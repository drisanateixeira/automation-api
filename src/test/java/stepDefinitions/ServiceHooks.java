package stepDefinitions;

import org.apache.log4j.Logger;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.LoggerHelper;

public class ServiceHooks {

	Logger log = LoggerHelper.getLogger(ServiceHooks.class);

	@Before
	public void initializeTest() throws Exception {
		log.info("initializing tests");

	}

	@After(order = 1)
	public void endTest(Scenario cenario) {
		if (cenario.isFailed()) {

			try {
				log.info(cenario.getName() + " is Failed");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else {

			try {
				log.info(cenario.getName() + " is pass");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@After(order = 0)
	public void fecharBrowser() throws Exception {

	}

}
