package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class OnlineShoppingsite extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		browser("chrome");
		getUrl("https://shop.demoqa.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='noo-product-inner noo-product-inner2'])[1]")).click();
		
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.xpath("//select[@id='pa_color']"));
		color.click();
		Select s = new Select(color);
		s.selectByValue("pink");
		
		Thread.sleep(2000);
		WebElement size = driver.findElement(By.xpath("//select[@name='attribute_pa_size']"));
		size.click();
		Select s1 = new Select(size);
		s1.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-name-and-total']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@class='input-text '])[1]"));
		firstName.sendKeys("swasha");
		
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("(//input[@class='input-text '])[2]"));
		lastName.sendKeys("chan");
		
		Thread.sleep(2000);
		WebElement company = driver.findElement(By.xpath("//input[@name='billing_company']"));
		company.sendKeys("shoptool");
		
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("(//input[@class='input-text '])[4]"));
		address.sendKeys("2/55 ramasami street");
		
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@id='billing_city']"));
		city.sendKeys("vellore");
		
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		pincode.sendKeys("123456");
		
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//input[@id='billing_phone']"));
		phone.sendKeys("9876543212");
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='billing_email']"));
		email.sendKeys("chandru2728@gmail.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", email);
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='I have read and agree to the website ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Selenium\\Screenshot//OrderDetails.png");
		Files.copy(src, des);
	}
}
