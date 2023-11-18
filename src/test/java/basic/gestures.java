package basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class gestures {
	
	public static WebElement menu;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/");
		
		
		menu= driver.findElement(By.xpath("//*[contains(text(),'All Courses')]"));
		WebElement sel=driver.findElement(By.xpath("//ul //*[contains(text(),'Selenium')]"));
		WebElement seljava=driver.findElement(By.xpath("//ul //*[contains(text(),'Selenium with Java')]"));
	
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).click().moveToElement(sel).moveToElement(seljava).click().build().perform();
		Thread.sleep(10000);
		
		List<WebElement> icon= driver.findElements(By.cssSelector("i.eicon-close"));
		if(icon.size()>0) {
			icon.get(0).click();
		}
		
		
		WebElement menu1= driver.findElement(By.xpath("//li //*[contains(text(),'All Courses')]"));
		WebElement app=driver.findElement(By.xpath("//ul //*[contains(text(),'Appium')]"));
		WebElement appjava=driver.findElement(By.xpath("//ul //*[contains(text(),'Appium with Java')]"));
		
		action.moveToElement(menu1).click().
		moveToElement(app).moveToElement(appjava).click().build().perform();	
		
	}

}
