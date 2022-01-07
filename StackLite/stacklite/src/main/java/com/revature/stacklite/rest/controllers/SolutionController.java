package com.revature.stacklite.rest.controllers;

import com.revature.stacklite.bl.IIssueService;
import com.revature.stacklite.models.Solution;

import io.javalin.http.Handler;

public class SolutionController implements IController {
	private IIssueService issueService;

	public SolutionController(IIssueService issueService) {
		this.issueService = issueService;
	}

	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.jsonStream(issueService.getIssueById(Integer.parseInt(ctx.pathParam("solnId"))));
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			issueService.addSolution(ctx.bodyStreamAsClass(Solution.class));
			ctx.res.setStatus(201);
		};
	}

	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return ctx -> {
			issueService.updateSolution(ctx.bodyStreamAsClass(Solution.class));
		};
	}
}
