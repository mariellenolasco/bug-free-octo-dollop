package com.revature.stacklite.models;

/**
 * This is the model to hold solutions
 * @author MarielleNolasco
 *
 */
public class Solution {
	private int id;
	private int upvote;
	private int downvote;
	private String answer;
	private int issueId;

	public Solution() {
		super();
	}

	public Solution(int id, int upvote, int downvote, String answer, int issueId) {
		super();
		this.id = id;
		this.upvote = upvote;
		this.downvote = downvote;
		this.answer = answer;
		this.issueId = issueId;
	}

	public Solution(int upvote, int downvote, String answer, int issueId) {
		super();
		this.upvote = upvote;
		this.downvote = downvote;
		this.answer = answer;
		this.issueId = issueId;
	}

	public int getId() {
		return id;
	}

	public int getUpvote() {
		return upvote;
	}

	public void setUpvote(int upvote) {
		this.upvote = upvote;
	}

	public int getDownvote() {
		return downvote;
	}

	public void setDownvote(int downvote) {
		this.downvote = downvote;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getIssueId() {
		return issueId;
	}

	@Override
	public String toString() {
		return "Solution \n [ id=" + id + ", \n upvote=" + upvote + ", downvote=" + downvote + ", \n answer=" + answer
				+ "]";
	}

}
