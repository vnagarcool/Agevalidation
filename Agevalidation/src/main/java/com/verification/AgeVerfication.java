package com.verification;

public class AgeVerfication {
	public String ageValid(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "check the age to vote";
		}
	}

}
