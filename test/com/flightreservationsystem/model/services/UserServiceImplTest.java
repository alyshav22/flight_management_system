package com.flightreservationsystem.model.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flightreservationsystem.model.domain.User;

public class UserServiceImplTest {

	// Declare Instance variables
	private ServiceFactory testServiceFactory;
	private User user, searchUserResults;
	private IUserService saveUserService, findUserService;

	/**
	 * Instantiates required object for all test, and configures test environment.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// initialize instance variables
		testServiceFactory = ServiceFactory.getInstance();
		user = new User();
		String fileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(fileLocation);
	}

	/**
	 * Asserts if you can save an user using services.
	 */
	@Test
	public final void testRegisterUser() {
		System.out.println("Starting testSaveUser() ");
		try {
			saveUserService = (IUserService) testServiceFactory.getService(IUserService.NAME);
			assertTrue(saveUserService.saveUser(user));
			assertNotNull("should not be null", UserServiceImpl.getUserHashtable());
			assertEquals("failure - Artist objects are not equal",
					UserServiceImpl.getUserHashtable().get(user.getEmailAddress()), user);
			System.out.println("UserServiceImplTest: testRegisterArtist() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (UserRegisterException e) {
			e.printStackTrace();
			fail("UserRegisterSaveException");
		}

	}

	/**
	 * Asserts if you can find an artist using services.
	 */
	@Test
	public final void testCheckLogin() {

		System.out.println("Starting testCheckLogin() ");

		try {
			findUserService = (IUserService) testServiceFactory.getService(IUserService.NAME);
			assertNotNull("should not be null", UserServiceImpl.getUserHashtable());
			searchUserResults = findUserService.checkLogin("alysha@gmail.com");
			assertNotNull("should not be null", searchUserResults);
			System.out.println(searchUserResults.toString());
			System.out.println("UserServiceImplTest: testCheckLogin() PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (VerifyUserException e) {
			e.printStackTrace();
			fail("VerifyUserException");
		}

	}

}
