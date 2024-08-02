package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Project01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	    System.setProperty("webdriver.edge.driver", "C:\\Selenium\\driver\\msedgedriver.exe");
			
	    EdgeDriver driver = new EdgeDriver();
	    
	    driver.get("https://adactinhotelapp.com/");
			
  		driver.manage().window().maximize();
		
     	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
     	username.sendKeys("chan2728");
     	
     	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
     	password.sendKeys("6379731271");
     	
        driver.findElement(By.xpath("//input[@id='login']")).click();
        
        WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
        Select a = new Select(location);
        a.selectByValue("Sydney");
        
        WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
        Select b = new Select(hotels);
        b.selectByValue("Hotel Creek");
        
        WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
        Select c = new Select(roomType);
        c.selectByIndex(3);
        
        WebElement Rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
        Select d = new Select(Rooms);
        d.selectByIndex(5);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('datepick_in').value='27/01/2024';");    
        js.executeScript("document.getElementById('datepick_out').value='28/01/2024';");
        
        WebElement perRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select e = new Select(perRoom);
        e.selectByIndex(4);
        
        WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
        Select f = new Select(child);
        f.selectByIndex(1);
        
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
        driver.findElement(By.xpath("//input[@name='continue']")).click();
        
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("swasha");
        
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("chan");
        
        WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
        address.sendKeys("ramasami vellore 632107");
        
        WebElement cdNumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
        cdNumber.sendKeys("1234567890123456");
        
        
        WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
        Select a2 = new Select(type);
        a2.selectByIndex(1);
        
        WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
        Select b2 = new Select(month);
        b2.selectByIndex(1);
        
        WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
        Select c2 = new Select(year);
        c2.selectByIndex(5);
        
        WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
        ccv.sendKeys("9876543219");
        
        WebElement Booking = driver.findElement(By.xpath("//input[@name='book_now']"));
        Booking.click();
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Selenium\\Screenshot//Booking.png");
        Files.copy(src, des);
        
        
		
	}

	}


