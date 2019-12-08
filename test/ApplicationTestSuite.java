import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservationsystem.model.business.AllBusinessTests;
import com.flightreservationsystem.model.domain.AllDomainTests;
import com.flightreservationsystem.model.services.AllServiceTests;


/**
 * Application test suite that test all layer test suite and class test
 * @author Alysha
 */
@RunWith(Suite.class)
@SuiteClasses({
	AllDomainTests.class,
	AllServiceTests.class,
	AllBusinessTests.class
})

/**
 * A single JUnit Test entry point for testing the entire application
 */
public class ApplicationTestSuite {
	
	/**
	 * the class remains empty,
	 * used only as a holder for the above annotations
	 * 
	 */

}
