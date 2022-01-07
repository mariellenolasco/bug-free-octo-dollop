package com.revature.stacklite.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.util.data.ConnectionFactory;

public class IssueDAO implements DAO<Issue>{

	@Override
	public Issue findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "select * from issues where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				return new Issue(
						rs.getInt("Id"),
						rs.getString("Title"),
						rs.getString("Body")
				);
			}
		}
		return null;
	}

	@Override
	public Iterable<Issue> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Issue> issuesList = new ArrayList<Issue>();
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			//Statement doesn't perform as well as prepared statement, but you can do DDL 
			// with it. Theoretically speaking, you can make JDBC code first
			String query = "select * from issues";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				issuesList.add(
						new Issue(
								rs.getInt("Id"),
								rs.getString("Title"),
								rs.getString("Body")
								));
			}
			
		}
		return issuesList;
	}

	@Override
	public void add(Issue newObject) throws SQLException {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "insert into issues (title, body) values (?, ?);";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newObject.getTitle());
			pstmt.setString(2, newObject.getBody());
			pstmt.execute();
		}
		
	}

	@Override
	public void update(Issue newObject) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
