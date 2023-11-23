package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Basepage;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#webengage-notification-container>iframe")
	public WebElement frame;
	
	@FindBy(xpath="//a[@class='close']/i")
	public WebElement closeFrame;
	
	@FindBy(css="span.commonModal__close")
	public WebElement closeModal;
	
	
	public Homepage gotoMenu() throws InterruptedException {
		
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		w.until(ExpectedConditions.elementToBeClickable(closeFrame));
		click(closeFrame,"close a Frame");
		driver.switchTo().defaultContent();
		click(closeModal,"close a Modal");
		
		return this;
	}
	
	@FindBy(css="input#fromCity")
	public WebElement fromCity;	
	
	@FindBy(css="input[placeholder='From']")
	public WebElement from;	
	
	@FindBy(xpath="//ul/li //p[text()='New Delhi, India']")
	public WebElement delhi;
	
	@FindBy(css="input#toCity")
	public WebElement toCity;
	
	@FindBy(css="input[placeholder='To']")
	public WebElement to;
	
	@FindBy(xpath="//ul/li //p[text()='Bengaluru, India']")
	public WebElement bengaluru;
	
	@FindBy(xpath="//p[text()='25']/..")
	public WebElement fromDate;
	
	@FindBy(xpath="(//p[text()='30']/..)[3]")
	public WebElement toDate;
	
	@FindBy(xpath="//*[contains(text(),'Tap to add')]")
	public WebElement addRetun;
	
	@FindBy(xpath="//ul/li //p[text()='Mumbai, India']")
	public WebElement bombay;
	
	@FindBy(xpath="//ul/li //p[text()='Abu Dhabi, United Arab Emirates']")
	public WebElement abuDhabi;
	
	@FindBy(xpath="//a[text()='Search']")
	public WebElement search;
	
	public FlightPage giveOnewayFlightDetails(String From,String To) throws InterruptedException {
		
		fromCity.click();
		type(from, From, "From");
		delhi.click();
		toCity.click();
		type(to, To, "To");
		bengaluru.click();
		fromDate.click();
		search.click();
		
		return new FlightPage(driver);
	}
	
	public FlightPage giveReturnFlightDetails() throws InterruptedException {
		
		fromCity.click();
		type(from, "Bombay", "From");
		bombay.click();
		toCity.click();
		type(to,"Abudhabi", "To");
		abuDhabi.click();
		fromDate.click();
		addRetun.click();
		toDate.click();
		search.click();
		
		return new FlightPage(driver);
	}
	

}
