import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class AutoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/autocomplete");
	    
	    WebElement autoComplete = driver.findElement(By.id("autocomplete"));
	    //autoComplete.click();
	    autoComplete.sendKeys("99 Rathon Street, Madeira, OH, USA");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement searchResult = driver.findElement(By.xpath("/html/body/div[2]"));
	    searchResult.click();
	     
	    driver.quit();	

		}

}
