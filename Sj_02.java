import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Sj_02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/keypress");
	    
	    WebElement name = driver.findElement(By.id("name"));
	    name.click();
	    name.sendKeys("ChromeDriver");
	    
	    WebElement button = driver.findElement(By.className("col-sm-4"));
	    button.click();
	     
	    driver.quit();

	}

}
