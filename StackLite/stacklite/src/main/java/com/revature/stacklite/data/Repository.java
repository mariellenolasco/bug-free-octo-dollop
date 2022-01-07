package com.revature.stacklite.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.*;

public class Repository implements IRepository {
	private DAO<Issue> issueDAO;
	private DAO<Solution> solutionDAO;

	public Repository(DAO<Issue> issueDAO, DAO<Solution> solutionDAO) {
		this.issueDAO = issueDAO;
		this.solutionDAO = solutionDAO;
	}

	@Override
	public Issue getIssueById(int id) throws SQLException {
		List<Solution> allsolutions = (List<Solution>) solutionDAO.getAll();
		return new Issue(issueDAO.findById(id), allsolutions.stream().filter(soln -> soln.getIssueId() == id).toList());
	}

	@Override
	public List<Issue> getIssues() throws SQLException {
		List<Issue> issues = (List<Issue>) issueDAO.getAll();
		List<Solution> allsolutions = (List<Solution>) solutionDAO.getAll();
		List<Issue> issuesWithSolutions = new ArrayList<Issue>();
		for (Issue issue : issues) {
			issuesWithSolutions.add(new Issue(issue,
					allsolutions.stream().filter(soln -> soln.getIssueId() == issue.getId()).toList()));
		}
		return issuesWithSolutions;
	}

	@Override
	public Solution getSolutionById(int id) throws SQLException {
		return solutionDAO.findById(id);
	}

	@Override
	public void updateSolution(Solution updatedSolution) throws SQLException {
		// TODO Auto-generated method stub
		solutionDAO.update(updatedSolution);
	}

	@Override
	public void addSolution(Solution newSolution) throws SQLException {
		// TODO Auto-generated method stub
		solutionDAO.add(newSolution);

	}

	@Override
	public void addIssue(Issue newIssue) throws SQLException {
		// TODO Auto-generated method stub
		issueDAO.add(newIssue);
	}

}
