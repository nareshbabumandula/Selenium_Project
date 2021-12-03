package com.exceptions.demo;

public class CastingVoteTest {
	
	void castVote(int age) throws InvalidAgeException {
		if (age<=18) {
			throw new InvalidAgeException("Minimum age should be greater then 18 to cast a vote");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		CastingVoteTest cast=new CastingVoteTest();
		cast.castVote(18);
	}

}
