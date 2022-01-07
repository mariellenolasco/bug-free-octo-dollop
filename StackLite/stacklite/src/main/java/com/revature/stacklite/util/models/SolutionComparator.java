package com.revature.stacklite.util.models;

import java.util.Comparator;

import com.revature.stacklite.models.Solution;

public class SolutionComparator implements Comparator<Solution> {

	@Override
	public int compare(Solution o1, Solution o2) {
		// TODO Auto-generated method stub
		Integer vote1 = o1.getUpvote() - o1.getDownvote();
		Integer vote2 = o2.getUpvote() - o2.getDownvote();
		return vote2.compareTo(vote1);
	}

}
