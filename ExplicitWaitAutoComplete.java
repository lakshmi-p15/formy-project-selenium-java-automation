
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitAutoComplete {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/autocomplete");
	    
	    WebElement autoComplete = driver.findElement(By.id("autocomplete"));
	    //autoComplete.click();
	    autoComplete.sendKeys("99 Rathon Street, Madeira, OH, USA");
	    
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    
	    WebElement searchResult = wait.until(ExpectedConditions
	    		.visibilityOfElementLocated(By.xpath("/html/body/div[2]")));
	    searchResult.click();
	     
	    driver.quit();	

		}

}