package com.revature.restaurantreviews.util;

import com.revature.restaurantreviews.controllers.RestaurantController;
import com.revature.restaurantreviews.dao.RestaurantDAO;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

/**
 * Singleton used in mapping endpoints to controller handlers
 * @author MarielleNolasco
 *
 */
public class Router {
	private static Router router = null;
	private static Javalin app;
	private Router(Javalin _app)
	{
		app = _app;
	}
	
	public static Router getInstance(Javalin app) {
		if(router == null)
		{
			router = new Router(app);
		}
		return router;
	}
	
	/**
	 * Method for mapping the endpoints to controller handlers
	 */
	public void setUpEndpoints() {
		RestaurantController restaurantController = new RestaurantController(new RestaurantDAO());
		app.get("/restaurants", OpenApiBuilder.documented(DocumentationFactory.getDoc("get restaurants"), restaurantController.getRestaurants));
		app.get("/restaurants/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("get restaurant"), restaurantController.getRestaurant));
		app.post("/restaurants", OpenApiBuilder.documented(DocumentationFactory.getDoc("add restaurant"), restaurantController.addRestaurant));
		app.delete("/restaurants/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("delete restaurant"), restaurantController.deleteRestaurant));
		app.put("/restaurants/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("update restaurant"), restaurantController.updateRestaurant));
	}
}
