import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownMenu {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/dropdown");
	    
	    WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
	    dropdownMenuButton.click();
	    
	    WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	    autocomplete.click();
	    
	    driver.quit();

	}
}
