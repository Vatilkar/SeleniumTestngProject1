package com.Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	public static void handleAssertion(String ActualText, String ExpectedText) {
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualText, ExpectedText);
		sa.assertAll();
		
		
	}
	
	
	public static void handleExplicitWait(WebDriver driver, int time, By element) {
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
		
		
		public static void handleExplicitWaitList(WebDriver driver, int time, List<WebElement> element) {
			
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
			
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
		
		
	}

}
