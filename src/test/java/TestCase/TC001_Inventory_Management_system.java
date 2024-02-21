package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC001_Inventory_Management_system extends DriverSetup {
	
	@Test
	public void Inventory() throws InterruptedException{
		String baseUrl = "http://localhost/POS/login.php";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("mayuri.infospace@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.id("password")).sendKeys("rootadmin");
	
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/center/button")).click();
		Thread.sleep(20000);
	}

}
