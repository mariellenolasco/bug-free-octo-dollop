package com.revature.restaurantreviews.controllers;

import java.util.Objects;

import com.revature.restaurantreviews.dao.DAO;
import com.revature.restaurantreviews.models.Restaurant;

import io.javalin.http.Handler;

/**
 * Controller for the requests regarding restaurant resources
 * @author MarielleNolasco
 *
 */
public class RestaurantController {
	private DAO<Restaurant> restaurantDAO;
	public RestaurantController(DAO<Restaurant> restaurantDAO)
	{
		this.restaurantDAO = restaurantDAO;
	}
	public Handler getRestaurant = ctx -> {
		int id = Integer.parseInt(Objects.requireNonNull(ctx.pathParam("id")));
		ctx.json(restaurantDAO.findById(id));
	};
	
	public Handler getRestaurants = ctx -> {
		ctx.json(restaurantDAO.getAll());
	};
	
	public Handler addRestaurant = ctx -> {
		restaurantDAO.add(ctx.bodyAsClass(Restaurant.class));
		ctx.res.setStatus(201);
	};
	
	public Handler deleteRestaurant = ctx -> {
		restaurantDAO.delete(Integer.parseInt(Objects.requireNonNull(ctx.pathParam("id"))));
		ctx.res.setStatus(204);
	};
	public Handler updateRestaurant = ctx -> {
		restaurantDAO.update(ctx.bodyAsClass(Restaurant.class));
		ctx.res.setStatus(204);
	};
}
