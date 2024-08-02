package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project02 extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		browser("chrome");
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement Cauliflower  = driver.findElement(By.xpath("//input[@type='search']"));
		Cauliflower.click();
		
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[2]"));
		cart.click();
		
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("//img[@alt='Cart']"));
		img.click();
		
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		checkout.click();
		
		Thread.sleep(2000);
		WebElement promo = driver.findElement(By.xpath("//input[@type='text']"));
		promo.sendKeys("SWAROVSK125");
		
		Thread.sleep(2000);
		WebElement Apply = driver.findElement(By.xpath("//button[@class='promoBtn']"));
		Apply.click();
		
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.xpath("//button[text()='Place Order']"));
		order.click();
		
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		country.click();
		Select a = new Select(country);
		a.selectByValue("India");
		
		Thread.sleep(2000);
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		
		Thread.sleep(2000);
		WebElement proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
		proceed.click();
		
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Selenium\\Screenshot//Shooping.png");
		Files.copy(src, des);
		
		
		
		
		
		}
}
