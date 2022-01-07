package com.revature.stacklite.bl;

import java.sql.SQLException;
import java.util.List;

import com.revature.stacklite.data.IRepository;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;
import com.revature.stacklite.util.models.SolutionComparator;

public class IssueService implements IIssueService {

	private IRepository repo;

	public IssueService(IRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Issue> getAllIssues() throws SQLException {
		return repo.getIssues();
	}

	@Override
	public Issue getIssueById(int id) throws SQLException {
		// TODO Auto-generated method stub
		Issue issue = repo.getIssueById(id);
		issue.setProposedSolutions(issue.getProposedSolutions().stream().sorted(new SolutionComparator()).toList());
		return issue;
	}

	public void upVoteSolution(int id) throws SQLException {
		Solution upvotedSolution = repo.getSolutionById(id);
		upvotedSolution.setUpvote(upvotedSolution.getUpvote() + 1);
		repo.updateSolution(upvotedSolution);
	}

	public void downVoteSolution(int id) throws SQLException {
		Solution downvotedSolution = repo.getSolutionById(id);
		downvotedSolution.setDownvote(downvotedSolution.getUpvote() + 1);
		repo.updateSolution(downvotedSolution);
	}

	public void addSolution(Solution newSolution) throws SQLException {
		repo.addSolution(newSolution);
	}

	@Override
	public void addIssue(Issue newIssue) throws SQLException {
		// TODO Auto-generated method stub
		repo.addIssue(newIssue);

	}
	public void updateSolution(Solution updatedSolution) throws SQLException {
		repo.updateSolution(updatedSolution);
	}
}
