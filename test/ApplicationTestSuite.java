import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservationsystem.model.business.AllBusinessTests;
import com.flightreservationsystem.model.domain.AllDomainTests;
import com.flightreservationsystem.model.services.AllServicesTests;

/**
 * Application test suite aggregates all the layer suite tests
 * @author alysha_velasquez
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
	
	AllDomainTests.class,
	AllServicesTests.class,
	AllBusinessTests.class
})
public class ApplicationTestSuite {

}
