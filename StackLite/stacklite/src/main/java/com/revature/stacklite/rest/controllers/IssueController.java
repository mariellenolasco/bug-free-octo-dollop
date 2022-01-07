package com.revature.stacklite.rest.controllers;

import com.revature.stacklite.bl.IIssueService;
import com.revature.stacklite.models.Issue;

import io.javalin.http.Handler;

public class IssueController implements IController{
	private IIssueService issueservice;
	public IssueController(IIssueService issueservice)
	{
		this.issueservice = issueservice;
	}
	@Override
	public Handler getAll() {
		return ctx -> {
			ctx.jsonStream(issueservice.getAllIssues());
		};
	}
	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			ctx.json(issueservice.getIssueById(Integer.parseInt(ctx.pathParam("id"))));
		};
	}
	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			issueservice.addIssue(ctx.bodyAsClass(Issue.class));
		};
	}
	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return null;
	}


}
