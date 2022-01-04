package com.revature.restaurantreviews.util;

import com.revature.restaurantreviews.controllers.RestaurantController;
import com.revature.restaurantreviews.dao.RestaurantDAO;

import io.javalin.Javalin;

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
	
	public void setUpEndpoints() {
		RestaurantController restaurantController = new RestaurantController(new RestaurantDAO());
		app.get("/restaurants", restaurantController.getRestaurants);
		app.get("/restaurants/:id", restaurantController.getRestaurant);
	}
}
