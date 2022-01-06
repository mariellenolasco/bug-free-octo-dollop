package com.revature.stacklite.models;

public class Solution {
	private int id;
	private int upvote;
	private int downvote;
	private String answer;
	public Solution() {
		super();
	}
	public Solution(int id, int upvote, int downvote, String answer) {
		super();
		this.id = id;
		this.upvote = upvote;
		this.downvote = downvote;
		this.answer = answer;
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
}
