package com.verification;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeVerficationTest {

	@Test
	public void test1() {
		AgeVerfication ageverify=new AgeVerfication();
		//expected output ,       actual output 
		assertEquals("right to vote",ageverify.ageValid(25));
	}
	
	@Test
	public void test2() {
		AgeVerfication ageverify=new AgeVerfication();
		//expected output     ,     actual output
		assertEquals("check the age to vote",ageverify.ageValid(10));
	}
	

}
