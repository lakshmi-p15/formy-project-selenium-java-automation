import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.junit.Test;

public class Sj_01 {
	public static void main(String[] args) {
		testGoogleSearch();
    }
  //@Test
  public static void testGoogleSearch()  {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver",
    		"/Users/sailakshmi/downloads/chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    //Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    //Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
}
