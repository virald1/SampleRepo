package pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import base.Basepage;
import extentlisteners.ExtentListeners;

public class FlightPage extends Basepage {
	
	public FlightPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[contains(text(),'OKAY')]")
	public WebElement okay;
	
	@FindBy(xpath="//*[contains(text(),'Cheapest')]")
	public WebElement cheapest;
	
	@FindBy(xpath="//*[contains(text(),'Cheapest')]/../p[2]")
	public WebElement text;
	
	@FindBy(xpath="((//div[@class='listingCard  appendBottom5'])[1] //p)")
	public List<WebElement> info;
	
	@FindBy(xpath="//div[contains(@class,'fontSize18')]")
	public WebElement price;
	
	public void searchCheapestFlight() {
		w.until(ExpectedConditions.elementToBeClickable(okay));		
		okay.click();
		cheapest.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//System.out.println(text.getText());
		
	}
	
	public void getFlightDetails() {
		for(int i=0;i<info.size();i++) {
			   if(i==5) { continue;  }		   //5
				System.out.println(info.get(i).getText());
				log.info(info.get(i).getText());
				Reporter.log( info.get(i).getText() + "<br>");
				ExtentListeners.test.log(Status.INFO, "Flight Info: "+info.get(i).getText());
		}
		System.out.println(price.getText().replace("\n"," ").trim());
	}
	
	public void getReturnFlightDetails() {
		for(int i=0;i<info.size();i++) {
			   if(i==1 || i==2 || i==20) { continue;  }		   
				System.out.println(info.get(i).getText());
				log.info(info.get(i).getText());
				Reporter.log( info.get(i).getText() + "<br>");
				ExtentListeners.test.log(Status.INFO, "Flight Info: "+info.get(i).getText());
		}
		System.out.println(price.getText().replace("\n"," ").trim());
	}
	
	
}
