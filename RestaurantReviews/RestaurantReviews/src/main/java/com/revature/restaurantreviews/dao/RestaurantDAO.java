package com.revature.restaurantreviews.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.restaurantreviews.models.Restaurant;
import com.revature.restaurantreviews.util.ConnectionFactory;

/**
 * DAO for the restaurant table 
 * @author MarielleNolasco
 *
 */
public class RestaurantDAO implements DAO<Restaurant>{

	@Override
	public Restaurant findById(Integer id) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "select * from restaurants where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				Restaurant restaurant = new Restaurant();
				restaurant.setId(rs.getInt("id"));
				restaurant.setName(rs.getString("name"));
				return restaurant;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Restaurant> getAll() {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "select * from restaurants";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			List<Restaurant> restaurants = new ArrayList<Restaurant>();
			while(rs.next())
			{
				restaurants.add(new Restaurant(rs.getInt("id"),rs.getString("name")));
			}
			return restaurants;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
