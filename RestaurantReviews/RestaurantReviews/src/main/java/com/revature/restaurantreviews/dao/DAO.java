package com.revature.restaurantreviews.dao;

import java.util.List;

/**
 * Generic Interface for DAOs (thank you Wezley)
 * @author MarielleNolasco
 *
 * @param <T>
 */
public interface DAO<T> {
	T findById(Integer id);
	List<T> getAll();
	T add(T newObject);
	void delete(Integer id);
	void update(T updatedObject);
}
