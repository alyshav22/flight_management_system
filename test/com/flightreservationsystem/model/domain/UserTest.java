package com.flightreservationsystem.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	//Declare instance variables
		private User u1,u2,u3;
		
		/**
		 * Instantiates required object for all test and configures test environment
		 * @throws java.lang.Exception
		 */
		@Before
		public void setup() throws Exception{
			//Initialize instance variables
			u1 = new User();
			u2 = new User("Michael","jordan007@gmail.com","password");
			u3 = new User("Michael","jordan007@gmail.com","password");
		}
		
		/**
		 * Test with valid User passed in
		 */
		@Test
		public final void testValidate() {
			System.out.println("Starting testValidate()");
			assertTrue("u1 validates",u1.validate());
			assertTrue("u2 validates",u2.validate());
			System.out.println("UserTest: testValidate PASSED");
		}
		
		/**
		 * Test default constructor
		 */
		@Test
		public final void testUser() {
			System.out.println("Starting testAdmin()");
			//No argument constructor should be null
			assertNotNull("should not be null",u1);
			System.out.println("UserTest: testUser() PASSED");
		}
		
		/**
		 * Test if two User are equal
		 */
		@Test
		public final void testEqualsUser() {
			System.out.println("Starting testEqualsUser()");
			//assert should be equal
			assertTrue("u2 equals u3", u2.equals(u3));
			System.out.println("UserTest: testEqualsUser PASSED");
		}
		
		/**
		 * Test if two User are not equal
		 */
		@Test
		public final void testNotEqualsUser() {
			System.out.println("Starting testNotEqualsUser()");
			// assert should be false
			assertFalse("u1 does not equal u3 ", u1.equals(u3));
			System.out.println("UserTest: testNotEqualsUser() PASSED");
		}

}
