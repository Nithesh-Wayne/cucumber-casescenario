package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/skeleton/cartadd.feature","src/test/resources/skeleton/searchscenario.feature","src/test/resources/skeleton/signscenario2.feature","src/test/resources/skeleton/registration.feature"},
				//glue= "skeleton",
				//plugin="html:target/htmlreport"
		plugin="json:target/jsonreport.json")
public class RunCukesTest {
}
