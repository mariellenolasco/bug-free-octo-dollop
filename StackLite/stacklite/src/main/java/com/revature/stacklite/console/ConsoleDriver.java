package com.revature.stacklite.console;

import java.util.Scanner;

import com.revature.stacklite.bl.IssueService;
import com.revature.stacklite.console.ui.IMenu;
import com.revature.stacklite.console.ui.MainMenu;
import com.revature.stacklite.data.IssueDAO;
import com.revature.stacklite.data.Repository;
import com.revature.stacklite.data.SolutionDAO;

public class ConsoleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMenu mainMenu = new MainMenu(new IssueService(new Repository(new IssueDAO(), new SolutionDAO())), new Scanner(System.in));
		mainMenu.Start();
	}
}
