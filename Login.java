package com.bp.idp.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\BiswarupDan\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sit-bpcustomers.cs84.force.com/BP");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Biswarup");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Biswarup7");
		//driver.findElement(By.xpath("//span[contains(@class,'label bBody')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click();
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'failed')]")).getText());  
	}                                           

}
