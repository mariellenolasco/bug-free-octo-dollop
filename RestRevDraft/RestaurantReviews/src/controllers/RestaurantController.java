package controllers;
import io.javalin.*;
import models.Restaurant;
import java.util.Objects;
import java.util.Optional;

import dao.RestaurantDAO;
public class RestaurantController {
	// Handler is the main interface for endpoint actions
	public static Handler getRestaurants = ctx -> {
		RestaurantDAO dao = RestaurantDAO.instance();
		ctx.json(dao.getRestaurants());
	};
	public static Handler getRestaurant = ctx -> {
		int id = Integer.parseInt(Objects.requireNonNull(ctx.param("id")));
		RestaurantDAO dao = RestaurantDAO.instance();
		Restaurant restaurant = dao.getRestaurantById(id).get();
		if(restaurant.equals(null)) ctx.response().setStatus(404);
		else ctx.json(restaurant);
	};
}
