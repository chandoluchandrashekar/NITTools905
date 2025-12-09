package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest
{
	private static Arithmatic ar;
	
	@BeforeAll
	public static void setup()
	{
		System.out.println("AppTest.setup()");
		ar=new Arithmatic();
	}
	@Test
	public void testwithPositives()
	{
		System.out.println("AppTest.testwithPositives()");
		Arithmatic a=new Arithmatic();
		float excepted=30.0f;
		float actual=a.sum(10.0f,20.0f);
		assertEquals(excepted,actual);
	}
	@Test
	public void testwithNegatives()
	{
		System.out.println("AppTest.testwithNegatives()");
		Arithmatic a=new Arithmatic();
		float excepted=-30.0f;
		float actual=a.sum(-10.0f,-20.0f);
		assertEquals(excepted,actual);
	}
	@Test
	public void testwithZeros()
	{
		System.out.println("AppTest.testwithZeros()");
		Arithmatic a=new Arithmatic();
		float excepted=0.0f;
		float actual=a.sum(0.0f,0.0f);
		assertEquals(excepted,actual);
	}
	@Test
	public void testwithMixedValues()
	{
		System.out.println("AppTest.testwithMixedValues()");
		Arithmatic a=new Arithmatic();
		float excepted=-10.0f;
		float actual=a.sum(10.0f,-20.0f);
		assertEquals(excepted,actual);
	}
	@AfterAll
	public static void tearDown()
	{
		System.out.println("AppTest.tearDown()");
		ar=null;
	}
}
