package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class OnlineShopping extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		browser("chrome");
		getUrl("https://automationexercise.com/");
		
		WebElement Signup = driver.findElement(By.xpath("//a[@href='/login']"));
		Signup.click();
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		email.sendKeys("chandruchan27287@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("swashachan");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		login.click();
		
		Thread.sleep(2000);
		WebElement shirt = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[41]"));
		shirt.click();
		
		Thread.sleep(2000);
		WebElement shopping = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		shopping.click();
		
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]"));
		cart.click();
		
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		checkout.click();
		
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		order.click();
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='name_on_card']"));
		name.sendKeys("chandru");
		
		Thread.sleep(2000);
		WebElement cardnumber = driver.findElement(By.xpath("//input[@name='card_number']"));
		cardnumber.sendKeys("9876543210543212");
		
		Thread.sleep(2000);
		WebElement cvc = driver.findElement(By.xpath("//input[@name='cvc']"));
		cvc.sendKeys("2728");
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//input[@name='expiry_month']"));
		month.sendKeys("01");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//input[@name='expiry_year']"));
		year.sendKeys("2031");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Selenium\\Screenshot//Order.png");
		Files.copy(src, des);
		
		
	}
}
