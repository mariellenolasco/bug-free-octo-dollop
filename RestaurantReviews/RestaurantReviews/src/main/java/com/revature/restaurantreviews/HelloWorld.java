
package com.revature.restaurantreviews;

import com.revature.restaurantreviews.util.Router;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.create(config -> {
	    config.registerPlugin(new OpenApiPlugin(getOpenApiOptions()));
	}).start(7000);
//    app.get("/", ctx -> ctx.result("Hello World"));
    Router.getInstance(app).setUpEndpoints();
  }
  private static OpenApiOptions getOpenApiOptions() {
	    Info applicationInfo = new Info()
	        .version("1.0")
	        .description("Restaurant Reviews API");
	    return new OpenApiOptions(applicationInfo).path("/swagger-docs").swagger(new SwaggerOptions("/swagger").title("Restaurant Review Swagger Documentation"));
	}
}
