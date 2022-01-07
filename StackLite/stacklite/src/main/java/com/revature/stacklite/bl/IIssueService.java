package com.revature.stacklite.bl;

import java.sql.SQLException;
import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

public interface IIssueService {

	List<Issue> getAllIssues() throws SQLException;
	Issue getIssueById(int id) throws SQLException;
	void addIssue(Issue newIssue) throws SQLException;
	
	void addSolution(Solution newSolution) throws SQLException;
	void upVoteSolution(int id) throws SQLException;
	void downVoteSolution(int id) throws SQLException;
	void updateSolution(Solution updatedSolution) throws SQLException;
}