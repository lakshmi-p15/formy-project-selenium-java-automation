import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/datepicker");
	    
	    WebElement datePicker = driver.findElement(By.id("datepicker"));
	    datePicker.sendKeys("03/25/2021");
	    datePicker.sendKeys(Keys.RETURN);
	    	    
	    driver.quit();

	}
}
