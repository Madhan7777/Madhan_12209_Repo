package com.madhan.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

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

class StudentServiceImplTest {
	
	@Autowired
	StudentServiceImpl ssi;
	
	WebDriver webdriver;
	@BeforeEach
	
	void init() {
		webdriver = new ChromeDriver();
		}

	@Test
	void testAddStudent() {
		webdriver.get("http://localhost:3000/add");
    	webdriver.findElement(By.id("studentname")).sendKeys("sathees");
    	webdriver.findElement(By.id("department")).sendKeys("cse");
    	webdriver.findElement(By.id("year")).sendKeys("1000");
    	webdriver.findElement(By.id("roomno")).sendKeys("11224");
    	webdriver.findElement(By.id("submit")).click();
    	WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = webdriver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Data added Successfully", txt);
	}

//	@Test
//	void testGetStudent() {
//		fail("Not yet implemented");
//	}

	@Test
	void testGetAllStudent() {
		webdriver.get("http://localhost:3000/view");

	}

	@Test
	void testUpdateStudent() {
		webdriver.get("http://localhost:3000/edit/1");
		webdriver.findElement(By.id("studentname")).clear();
    	webdriver.findElement(By.id("studentname")).sendKeys("barbie");
		webdriver.findElement(By.id("department")).clear();
    	webdriver.findElement(By.id("department")).sendKeys("eee");
		webdriver.findElement(By.id("year")).clear();
    	webdriver.findElement(By.id("year")).sendKeys("third year");
		webdriver.findElement(By.id("roomno")).clear();
    	webdriver.findElement(By.id("roomno")).sendKeys("111");
    	webdriver.findElement(By.id("update")).click();
    	WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = webdriver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Student updated successfully", txt);

	}

//	@Test
//	void testDeleteStudent() {
//		webdriver.get("http://localhost:3000/view");
//	    webdriver.findElement(By.cssSelector("tr:nth-child(5) .ms-1").id("delete")).click();
//	    WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = webdriver.switchTo().alert();
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Do you want to delete", txt);
//	}

}
