package Configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class UiHooks {
	 private AppManager uiManager = new AppManager();

	    @Before
	    public void setUp() {
	        uiManager.setUp();
	    }

	    @After
	    public void tearDown() {
	        uiManager.tearDown();
	    }
}
