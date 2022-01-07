package com.revature.stacklite.util.rest;
import com.revature.stacklite.rest.controllers.IController;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

public class Router {
	private static Router router = null;
	private static Javalin app;
	private IController issueController;
	private IController solutionController;
	private Router(Javalin _app, IController issueController, IController solutionController)
	{
		app = _app;
		this.issueController = issueController;
		this.solutionController = solutionController;
	}
	
	public static Router getInstance(Javalin app, IController issueController, IController solutionController)
	{
		if(router == null) router = new Router(app, issueController, solutionController);
		return router;
	}
	
	public void setUpEndpoints()
	{
		app.get("/Issues", OpenApiBuilder.documented(DocumentationFactory.getDoc("getIssues"),issueController.getAll()));
		app.get("/Issues/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getIssue"),issueController.getById()));
		app.post("/Issues", OpenApiBuilder.documented(DocumentationFactory.getDoc("addIssue"),issueController.add()));
		app.get("Issues/{id}/Solutions/{solnId}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getSoln"),solutionController.getById()));
		app.put("Issues/{id}/Solutions/{solnId}", OpenApiBuilder.documented(DocumentationFactory.getDoc("putSoln"),solutionController.update()));
		app.post("Issues/{id}/Solutions/", OpenApiBuilder.documented(DocumentationFactory.getDoc("addSoln"),solutionController.add()));
		
	}
}
