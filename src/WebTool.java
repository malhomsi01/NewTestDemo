import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTool {

	@Test
	public void TestCase() {
	System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys("admin");
	driver.findElement(By.id("user_pass")).sendKeys("demo123");
	driver.findElement(By.id("wp-submit")).click();
	driver.findElement(By.id("title")).sendKeys("Hi There");
	driver.findElement(By.id("content")).sendKeys("This is Enrico from TechFios");
	driver.findElement(By.id("save-post")).click();
	driver.findElement(By.id("title")).isDisplayed();
	driver.close();
	driver.quit();
	
	
	}
}
