package com.revature.stacklite.console.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.stacklite.bl.IIssueService;
import com.revature.stacklite.models.*;

public class MainMenu implements IMenu {
	private IIssueService issueService;
	private Scanner scanner;

	public MainMenu(IIssueService issueService, Scanner scanner) {
		this.issueService = issueService;
		this.scanner = scanner;
	}

	@Override
	public void Start() {
		boolean keepRunning = true;
		do {
			System.out.println("Welcome to Stack trickle (a stack overflow knockoff)");
			System.out.println("[0] List all issues");
			System.out.println("[1] Get proposed solutions of a particular issue");
			System.out.println("[2] Submit an issue");
			System.out.println("[x] Exit");
			System.out.println("What would you like to do? ");

			String userInput = scanner.nextLine();
			switch (userInput) {
			case "0":
				System.out.println("Listing all available issues");
				ListIssues();
				break;
			case "1":
				System.out.println("Enter issue id: ");
				String input= scanner.nextLine();
				ListIssue(input);
				break;
			case "2":
				AddIssue();
				break;
			case "x":
				System.out.println("Goodbye");
				keepRunning = false;
				break;
			}
		} while (keepRunning);
	}

	private void AddIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter a title for your issue (make sure it's descriptive of the issue)");
		String title= scanner.nextLine();
		System.out.println("Enter a full description of your issue: ");
		String body= scanner.nextLine();
		try {
			issueService.addIssue(new Issue(title, body));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Oh no! Something went wrong while trying to add :<");
			e.printStackTrace();
		}
		System.out.println("Perfect! Thank you for your submission!");
	}

	private void ListIssues() {
		try {
			for (Issue issue : issueService.getAllIssues()) {
				System.out.println(issue.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("Ran into some issue processing your request with the db");
			e.printStackTrace();
		}
	}

	private void ListIssue(String userInput) {
		
		try {
			Issue issue = issueService.getIssueById(Integer.parseInt(userInput));
			System.out.println(issue.toString());
			for (Solution soln : issue.getProposedSolutions()) {
				System.out.println(soln.toString());
			}
			IssueMenu(issue.getId());

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ran into some issue processing your request with the db");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void IssueMenu(int issueId) {
			System.out.println("Would you like to: ");
			System.out.println("[0] Add a solution to the issue? ");
			System.out.println("[1] Upvote a solution? ");
			System.out.println("[2] Downvote a solution? ");
			System.out.println("[x] Return to main menu");

			String userInput = scanner.nextLine();
			switch (userInput) {
			case "0":
				AddSolution(issueId);
				break;
			case "1":
				upVoteSolution(issueId);
				break;
			case "2":
				downVoteSolution(issueId);
				break;
			case "x":
				break;
			}
	}

	private void downVoteSolution(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Enter solution id of solution you wish to downvote");
		try {
			issueService.downVoteSolution(Integer.parseInt(scanner.nextLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong when processig your request");
			e.printStackTrace();
		} finally {
			ListIssue(id.toString());
		}
	}

	private void upVoteSolution(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Enter solution id of solution you wish to upvote");
		try {
			issueService.upVoteSolution(Integer.parseInt(scanner.nextLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something went wrong when processig your request");
			e.printStackTrace();
		} finally {
			ListIssue(id.toString());
		}
	}

	private void AddSolution(Integer issueId) {
		// TODO Auto-generated method stub
		System.out.println("Type out your proposed solution: ");
		try {
			issueService.addSolution(new Solution (0, 0, scanner.nextLine(), issueId));
			ListIssue(issueId.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Something happened while processing your request");
			e.printStackTrace();
		}
	}
}
