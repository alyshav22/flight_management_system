import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservationsystem.model.business.AllBusinessTests;
import com.flightreservationsystem.model.domain.AllDomainTests;
import com.flightreservationsystem.model.services.AllServiceTests;

@RunWith(Suite.class)
@SuiteClasses({
	AllDomainTests.class,
	AllServiceTests.class,
	AllBusinessTests.class
})
public class AllTests {

}
