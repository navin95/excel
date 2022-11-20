package basicconcepts.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	@Test(dataProvider="TestData")
	public void tcl(String email, String pass) {
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

	@DataProvider(name="SampleData")
	public Object[][] data() {
		return new Object[][] {
			{"user1","test123"},
			{"user2","test234"},
			{"user3","test345"},
			{"user4","test456"}
			
	};
}
	
	@DataProvider(name="TestData")
	public Object[][] data1() {
		return new Object[][] {
			{"testuser1","sample123"},
			{"testuser2","sample234"},
			{"testuser3","sample345"},
			{"testuser4","sample456"}
			
	};
}
}