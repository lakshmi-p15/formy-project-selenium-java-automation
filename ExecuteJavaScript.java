import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/modal");
    
	    WebElement openmodalButton = driver.findElement(By.id("modal-button"));
	    openmodalButton.click();
	    
	    WebElement closeButton = driver.findElement(By.id("close-button"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",closeButton);
	    
	    driver.quit();

	}
}
