import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/scroll");
	    
	    WebElement name = driver.findElement(By.id("name"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(name);
	    name.sendKeys("naga");
	    
	    WebElement date = driver.findElement(By.id("date"));
	    date.sendKeys("01/01/2020");
	     
	    driver.quit();	

		}

}