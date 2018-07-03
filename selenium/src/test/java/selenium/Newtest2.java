package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newtest2 {
	@Test
	public void testGitHubLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("Rexy1234");
		driver.findElement(By.id("password")).sendKeys("Rexy@1993");
		driver.findElement(By.name("commit")).click();
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"GitHub");
		
		System.out.println("Continue with test code....");
	}

}
