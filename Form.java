import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/form");
	    
	    WebElement firstName = driver.findElement(By.id("first-name"));
	    firstName.sendKeys("naga");
	    WebElement lastName = driver.findElement(By.id("last-name"));
	    lastName.sendKeys("lak");
	    WebElement jobTitle = driver.findElement(By.id("job-title"));
	    jobTitle.sendKeys("free");
	    
	    WebElement radioButton = driver.findElement(By.id("radio-button-3"));
	    radioButton.click();
	    
	    WebElement checkList = driver.findElement(By.id("checkbox-2"));
	    checkList.click();
	    
	    WebElement dropDownMenu = driver.findElement(By.cssSelector("option[value='1']"));
	    dropDownMenu.click();
	    
	    WebElement datePicker = driver.findElement(By.id("datepicker"));
	    datePicker.sendKeys("03/12/2021");
	    datePicker.sendKeys(Keys.RETURN);
	    
	    WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
	    submitButton.click();
	    
	    driver.quit();

	}
}
