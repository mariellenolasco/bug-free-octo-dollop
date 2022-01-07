package com.revature.stacklite.data;

import java.sql.SQLException;

public interface DAO<T> {
	T findById(int id) throws SQLException;
	Iterable<T> getAll() throws SQLException;
	void add(T newObject) throws SQLException;
	void update(T newObject) throws SQLException;
}
