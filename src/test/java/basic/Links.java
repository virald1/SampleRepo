package basic;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		/* System.out.println(driver.findElements(By.tagName("option")).size()); Select
		select = new Select(driver.findElement(By.id("searchLanguage")));
		select.selectByIndex(3); */
		
		WebElement block=driver.findElement(By.cssSelector("div.other-projects"));
		
		List<WebElement> links= block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		 for(WebElement link:links) {
			 System.out.println(link.getText()+"----"+link.getAttribute("href"));
		 }
		 
		 
		
	}

}
