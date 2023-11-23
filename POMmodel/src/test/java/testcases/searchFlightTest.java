package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.FlightPage;
import pages.Homepage;

public class searchFlightTest extends BaseTest{
	
	@Test(dataProvider="getData")
	public void searchFlightTests(String from,String to) throws Exception {
		
		setup("chrome");
		Homepage home     = new Homepage(driver);
						    home.gotoMenu();
		FlightPage flight = home.giveOnewayFlightDetails(from,to);
							flight.searchCheapestFlight();
							flight.getFlightDetails();
		Assert.fail();					
							
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="Delhi";			//0th row
		data[0][1]="Banglore";
		return data;
	}

}
