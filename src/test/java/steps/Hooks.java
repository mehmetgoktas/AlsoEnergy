package steps;



import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Driver;

public class Hooks{
	
	
	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();
	}
	
	
	@After
	public void tearDown() {
		Driver.closeDriver();
	}
		
	
		
	}
