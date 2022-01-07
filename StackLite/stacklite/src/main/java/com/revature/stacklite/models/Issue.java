package com.revature.stacklite.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Issue {
	private int id;
	private String title;
	private String body;
	
	@JsonIgnore
	private List<Solution> proposedSolutions;

	public Issue(Issue issue, List<Solution> iterable) {
		this(issue.getId(), issue.getTitle(), issue.getBody());
		this.proposedSolutions = iterable;
	}

	public Issue(int id, String title, String body) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public Issue(String title, String body) {
		super();
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

	@Override
	public String toString() {
		return "Issue [id=" + id + ", title=" + title + ", body=" + body + ", proposedSolutions="
				+ proposedSolutions.size() + "]";
	}

}
