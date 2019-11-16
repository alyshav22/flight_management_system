package com.flightreservationsystem.model.domain;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 * Domain ManagerTest layer tests validate and 
 * equal methods for the Domain Manager class
 * 
 * 
 * @author alysha_velasquez
 *
 */

public class ManagerTest {

	/**
	 * Tests if a valid Manager is being passed in
	 */
	@Test
	public void testValidate() {
		System.out.println("Starting testValidate()");
		Manager m1 = new Manager(9999, "Hailey Duff", "555-555-5555", "duff@gmail.com", "password");
		/**
		 * Validate method from m1 should assert to True, since all variables
		 * being passed to create a new Manager are all valid.
		 */
		assertTrue("n1 validates", m1.validate());
		System.out.println("ManagerTest: testValidate PASSED");
	}

	/**
	 * Tests if two Managers are equal
	 */
	@Test
	public void testEqualsManager() {
		System.out.println("Starting testEqualsManager()");
		Manager m2 = new Manager(9999, "Hailey Duff", "555-555-5555", "duff@gmail.com", "password");
		Manager m3 = new Manager(9999, "Hailey Duff", "555-555-5555", "duff@gmail.com", "password");
		assertTrue("m1 equals m2", m2.equals(m3));
		System.out.println("ManagerTest: testEqualsFlight PASSED");
	}

}
