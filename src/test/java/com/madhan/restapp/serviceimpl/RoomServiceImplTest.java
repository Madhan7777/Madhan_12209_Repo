package com.madhan.restapp.serviceimpl;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

class RoomServiceImplTest {
	
	@Autowired
	RoomServiceImpl rsi;
	
	WebDriver webdriver;
	@BeforeEach
	
	void init() {
		webdriver = new ChromeDriver();
		}

	@Test
	void testAddRoom() {
		webdriver.get("http://localhost:3000/addroom");
    	webdriver.findElement(By.id("roomno")).sendKeys("11");
    	webdriver.findElement(By.id("hostelfees")).sendKeys("804");
    	webdriver.findElement(By.id("messfees")).sendKeys("204");
    	webdriver.findElement(By.id("total")).sendKeys("1003");
    	webdriver.findElement(By.id("submit")).click();
    	WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = webdriver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Data added Successfully", txt);
	}

//	@Test
//	void testGetRoom() {
//		fail("Not yet implemented");
//	}
//
	@Test
	void testGetAllRoom() {
		webdriver.get("http://localhost:3000/viewroom");

	}

	@Test
	void testUpdateRoom() {
		webdriver.get("http://localhost:3000/editroom/5");
		webdriver.findElement(By.id("roomno")).clear();
    	webdriver.findElement(By.id("roomno")).sendKeys("546");
		webdriver.findElement(By.id("hostelfees")).clear();
    	webdriver.findElement(By.id("hostelfees")).sendKeys("10000");
		webdriver.findElement(By.id("messfees")).clear();
    	webdriver.findElement(By.id("messfees")).sendKeys("40000");
		webdriver.findElement(By.id("total")).clear();
    	webdriver.findElement(By.id("total")).sendKeys("50000");
    	webdriver.findElement(By.id("update")).click();
    	WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = webdriver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("User updated successfully", txt);
	}

//	@Test
//	void testDeleteRoom() {
//		webdriver.get("http://localhost:3000/viewroom");
//	    webdriver.findElement(By.cssSelector("tr:nth-child(10) .ms-1").id("delete")).click();
//	    WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = webdriver.switchTo().alert();
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Do you want to delete", txt);
//	}

}
