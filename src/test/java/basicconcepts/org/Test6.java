// parameters....

package basicconcepts.org;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	
	WebDriver driver ;
	@BeforeClass
	public void beforeclass() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Parameters({"email","pass"})
	@Test
	public void test(String email,String pass) {
		WebElement txtname = driver.findElement(By.id("email"));
		txtname.sendKeys(email);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}
		
	@AfterClass
	public void afterclass() {
		driver.quit();

	}

}
