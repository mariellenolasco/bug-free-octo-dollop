package com.revature.restaurantreviews.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
 * Singleton Design Pattern - Creational pattern - Restricts a class so that
 * only a single instance of it can be made within an application - Constructor
 * cannot be invoked outside of the class
 *
 * Factory Design Pattern - Creational pattern - Used to abstract away the
 * creation/instantiation logic of an object
 */
/**
 * Singleton Factory used for generating connections to the DB
 * @author MarielleNolasco
 *
 */
public class ConnectionFactory {
	private static final ConnectionFactory connectionFactory = new ConnectionFactory();
	// allows us to keep our db credentials private
	private Properties props = new Properties();
	static {
		try {
			// Forcibly load the PostgreSQL Driver into JVM memory so that it can create a
			// connection
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//Private constructor in line with the singleton design pattern
	private ConnectionFactory() {
		try {
			// loads properties from properties file
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			props.load(loader.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ConnectionFactory getInstance() {
		return connectionFactory;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"),
					props.getProperty("db.password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
