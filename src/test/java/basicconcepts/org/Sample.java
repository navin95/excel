package basicconcepts.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	@Test(dataProvider="SampleData",dataProviderClass=Data.class)
	public void tc2(String email, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(email);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
	}


}
