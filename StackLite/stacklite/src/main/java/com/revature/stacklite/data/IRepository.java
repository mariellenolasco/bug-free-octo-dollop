package com.revature.stacklite.data;

import java.sql.SQLException;
import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

public interface IRepository {

	Issue getIssueById(int id) throws SQLException;

	List<Issue> getIssues() throws SQLException;

	void addIssue(Issue newIssue) throws SQLException;

	Solution getSolutionById(int id) throws SQLException;

	void updateSolution(Solution updatedSolution) throws SQLException;

	void addSolution(Solution newSolution) throws SQLException;

}