package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
	
	//Declare instance variables
	private Manager m1,m2,m3;
	private User user;
	
	/**
	 * Instantiates required object for all test, and configures test environment
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setup() throws Exception{
		//Initialize instance variables
		user = new User("alysha101","password");
		m1 = new Manager();
		m2 = new Manager(555,"Laura","555-555-5555","laura@gmail.com",user);
		m3 = new Manager(555,"Laura","555-555-5555","laura@gmail.com",user);
	}
	
	/**
	 * Test with valid Manager passed in
	 */
	@Test
	public final void testValidate() {
		assertTrue("m1 validates",m1.validate());
		assertTrue("m2 validates",m2.validate());
		System.out.println("ManagerTest: testValidate PASSED");
	}
	
	/**
	 * Test default constructor
	 */
	@Test
	public final void testManager() {
		//No argument constructor should be null
		assertNotNull("should not be null",m1);
		System.out.println("ManagerTest: testManager() PASSED");
	}
	
	/**
	 * Test if two manager are equal
	 */
	@Test
	public final void testEqualsManager() {
		System.out.println("Starting testEqualsManager()");
		//assert should be equal
		assertTrue("m2 equals m3", m2.equals(m3));
		System.out.println("ManagerTest: testEqualsManager PASSED");
	}

}
