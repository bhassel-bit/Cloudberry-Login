package day6;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC02_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		/*
		Test case - TC02_Login
		---------
		1) Launch Chrome browser
		2) Open URL: https://cloudberrystore.services/
		3) Click on 'My Account' dropdown
		4) Click 'Login'
		5) Enter valid Email and Password
		6) Click 'Login' button
		7) Verify successful login
		8) Close App
		*/

		//1) Launch Chrome browser
		
		WebDriver driver = new ChromeDriver(); //open the chrome
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 2) Open URL: https://cloudberrystore.services/
		
		driver.get("https://cloudberrystore.services/");
		driver.manage().window().maximize();
		
		// 3) Click on 'My Account' dropdown - xpath - //i[@class='fa-solid fa-user']
		
		
		driver.findElement(By.xpath("//i[@class='fa-solid fa-user']")).click();
	
		//4) Click 'Login'
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
		
		//5) Enter valid Email and Password
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("brookhassel@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("120kbeforejan");
		
		//6) Click 'Login' button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//7) Verify successful login
		Thread.sleep(5000); //putting wait on the code for 5 seconds, which is 5000 in milliseconds
		boolean status = driver.findElement(By.xpath("//h1[normalize-space()='My Account']")).isDisplayed();
		//System.out.println(status);
		if (status==true)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		//8) Close App
		driver.quit();
		
		
	}
	
}
