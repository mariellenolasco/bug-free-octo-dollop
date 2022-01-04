package dao;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import models.Restaurant;

public class RestaurantDAO {
	private List<Restaurant> restaurants = Arrays.asList(
			new Restaurant(1, "Balajadia's"),
			new Restaurant(2, "Toto's Grill"),
			new Restaurant(3, "Canto")
			);
	private static RestaurantDAO restaurantdao = null;
	private RestaurantDAO() {
		
	}
	public static RestaurantDAO instance() {
		if(restaurantdao == null) return new RestaurantDAO();
		return restaurantdao;
	}
	public Optional<Restaurant> getRestaurantById(int id)
	{
		//what the heck is stream???
		return restaurants.stream()
				.filter(rest -> rest.getId() == id)
				.findAny();
	}
	public Iterable<Restaurant> getRestaurants()
	{
		return restaurants;
	}
}
