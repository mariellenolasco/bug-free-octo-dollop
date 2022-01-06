package com.revature.stacklite.models;

import java.util.List;

public class Issue {
	private int id;
	private String title;
	private String body;
	private List<Solution> proposedSolutions;
	
	public Issue(int id, String title, String body, List<Solution> proposedSolutions) {
		this(id, title, body);
		this.proposedSolutions = proposedSolutions;
	}
	public Issue(int id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public Issue() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public List<Solution> getProposedSolutions() {
		return proposedSolutions;
	}
	public void setProposedSolutions(List<Solution> proposedSolutions) {
		this.proposedSolutions = proposedSolutions;
	} 
	
}
