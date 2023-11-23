package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.FlightPage;
import pages.Homepage;

public class searchReturnFlightTest extends BaseTest{
	
	@Test
	public void searchReturnFlight() throws Exception {
		
		setup("chrome");
		Homepage home     = new Homepage(driver);
						    home.gotoMenu();
		FlightPage flight = home.giveReturnFlightDetails();
							flight.searchCheapestFlight();
							flight.getReturnFlightDetails();						
	}
	
}
