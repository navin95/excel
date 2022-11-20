package basicconcepts.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;
	@Parameters({"Browser","email","pass"})
	@Test
	public void tc1(String brwsr,String email, String pass) {
		if (brwsr.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (brwsr.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		} else if (brwsr.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} 
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(email);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
	}

}
