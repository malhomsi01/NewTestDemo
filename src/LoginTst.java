import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTst {

	
	// JUnit is a test runner and test reporter.
	// It also acts as a test function.
	
	@Test
	public void login() {
		
		//environment setup in Selenium.
		System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");
		
		//Step 1.) Calling the webdriver.
		// This step will call and open the chrome browser.
		WebDriver driver = new ChromeDriver();
		
		//Step 2.) Calling the driver to open the web address.
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		//Step 3.) Finding the elements for User ID  and passwords fields.
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		
		//Step 4.) Using .click to automate the button press.
		driver.findElement(By.id("wp-submit")).click();
		
		//Step 5.) Using .isDisplayed to validate the home page opened.
		driver.findElement(By.id("title")).isDisplayed();
		driver.close();
		driver.quit();
	}

	@Test
	public void Login() {
	
	//WebDriver Environment setup.
	System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Driver is calling the web address and elements.
	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.findElement(By.id("user_login")).sendKeys("admin");
	driver.findElement(By.id("user_pass")).sendKeys("demo123");
	driver.findElement(By.id("wp-submit")).click();
	driver.findElement(By.id("title")).isDisplayed();
	driver.findElement(By.id("title")).isDisplayed();
	driver.close();
	driver.quit();
	
	}
	
}
