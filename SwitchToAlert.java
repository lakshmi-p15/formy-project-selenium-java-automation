import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/switch-window");
    
	    WebElement alertButton = driver.findElement(By.id("alert-button"));
	    alertButton.click();
	    
	    driver.switchTo().alert().accept();
	    
	    driver.quit();

	}
}
