package com.revature.stacklite.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.Solution;
import com.revature.stacklite.util.data.ConnectionFactory;

public class SolutionDAO implements DAO<Solution> {

	@Override
	public Solution findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from solutions where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Solution(rs.getInt("id"), rs.getInt("upvote"), rs.getInt("downvote"), rs.getString("answer"),
						rs.getInt("issue_id"));
			}
		}
		return null;
	}

	@Override
	public Iterable<Solution> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Solution> solutions = new ArrayList<Solution>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "select * from solutions";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				solutions.add(new Solution(rs.getInt("id"), rs.getInt("upvote"), rs.getInt("downvote"),
						rs.getString("answer"), rs.getInt("issue_id")));
			}

		}
		return solutions;
	}

	@Override
	public void add(Solution newObject) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "insert into solutions (upvote, downvote, answer, issue_id) values (?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, newObject.getUpvote());
			pstmt.setInt(2, newObject.getDownvote());
			pstmt.setString(3, newObject.getAnswer());
			pstmt.setInt(4, newObject.getIssueId());
			pstmt.execute();
		}
	}

	@Override
	public void update(Solution newObject) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "update solutions set upvote = ?, downvote = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, newObject.getUpvote());
			pstmt.setInt(2, newObject.getDownvote());
			pstmt.setInt(3, newObject.getId());
			pstmt.execute();
		}
	}

}
