package com.revature.restaurantreviews.controllers;

import java.util.Objects;

import com.revature.restaurantreviews.dao.DAO;
import com.revature.restaurantreviews.models.Restaurant;

import io.javalin.http.Handler;

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
		ctx.res.setStatus(204);
	};
}
