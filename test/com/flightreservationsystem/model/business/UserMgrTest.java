package com.flightreservationsystem.model.business;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.User;

/**
 * 
 * Business UserMgrTest class that test methods in the Business layer User
 * @author ALYSHA
 */
public class UserMgrTest {

	// Declare instance variables
	private User user, foundUser;
	private UserMgr userMgr;

	/**
	 * Instantiates required object for all test, and configures test environment
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		user = new User("Alysha", "alysha@gmail.com", "password");
		userMgr = UserMgr.getUserMgr();

	}

	/**
	 * Test to make sure singleton UserMgr is not null.
	 */
	@Test
	public void testGetUserMgr() {
		System.out.println("Starting testGetUserMgr() ");
		assertNotNull("UserMgr Should not be null", userMgr);
		System.out.println("UserMgrTest: testGetUserMgr() PASSED");
	}

	/**
	 * Test for creating and persisting a User. Create method throws service load
	 * or save exception if there are errors
	 */
	@Test
	public void testCreate() {
		System.out.println("Starting testCreate()");
		assertTrue(userMgr.create(user));
		System.out.println("UserMgrTest: testCreate() PASSED");
	}

	/**
	 * Test querying list of users to find user. Throws service load exception if
	 * there are errors.
	 */
	@Test
	public void testQueryUser() {
		System.out.println("Starting testQueryUser()");
		foundUser = userMgr.queryUser("alysha@gmail.com", "password");
		assertNotNull("found User Should not be null", foundUser);
		assertTrue(foundUser instanceof User);
		System.out.println("UserMgrTest: testQueryUser() PASSED");
	}

}
