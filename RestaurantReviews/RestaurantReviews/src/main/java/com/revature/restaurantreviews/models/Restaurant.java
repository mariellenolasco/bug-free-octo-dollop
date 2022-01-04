package com.revature.restaurantreviews.models;

/**
 * Class used to hold data representing the restaurants we want to review
 * @author MarielleNolasco
 *
 */
public class Restaurant {
	private int id;
	private String name;
	public Restaurant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * Default constructor for restaurant class
	 */
	public Restaurant() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
