
package com.revature.stacklite.rest;

import com.revature.stacklite.bl.IssueService;
import com.revature.stacklite.data.IssueDAO;
import com.revature.stacklite.data.Repository;
import com.revature.stacklite.data.SolutionDAO;
import com.revature.stacklite.rest.controllers.IssueController;
import com.revature.stacklite.rest.controllers.SolutionController;
import com.revature.stacklite.util.rest.Router;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

public class RestDriver {
	public static void main(String[] args) {
		Javalin app = Javalin.create(config -> {
			config.registerPlugin(new OpenApiPlugin(getOpenApiOptions()));
		}).start(7000);
		Router.getInstance(app,
				new IssueController(new IssueService(new Repository(new IssueDAO(), new SolutionDAO()))),
				new SolutionController(new IssueService(new Repository(new IssueDAO(), new SolutionDAO()))))
				.setUpEndpoints();
	}

	private static OpenApiOptions getOpenApiOptions() {
		Info applicationInfo = new Info().version("1.0").description("StackLite API");
		// adding swagger to API Documentation
		return new OpenApiOptions(applicationInfo).path("/swagger-docs")
				.swagger(new SwaggerOptions("/swagger").title("StackLite API Documentation"));
	}
}
