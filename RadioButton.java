import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sailakshmi/downloads/chromedriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://formy-project.herokuapp.com/radiobutton");
	    
	    WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
	    radiobutton1.click();
	    
	    WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
	    radiobutton2.click();
	    
	    WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value='option3']"));
	    radiobutton3.click();
	    
	    driver.quit();

	}
}
