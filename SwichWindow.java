import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SwichWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/switch-window");
	    
	    WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
	    newTabButton.click();
	    
	    String handle = driver.getWindowHandle();
	    
	    for (String handle1: driver.getWindowHandles()) {
	    	driver.switchTo().window(handle1);
	    }
	    
	    driver.switchTo().window(handle);
	    
//	    WebElement alertButton = driver.findElement(By.id("alert-button"));
//	    alertButton.click();
	     
	    driver.quit();

	}

}