package org.executable;

import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends Base_Class{

	public static void main(String[] args) throws Exception {
		
		chromeBrowser("https://www.facebook.com/");
		
		maximize();
		
		implictWait();
		
		WebElement userName = driver.findElement(By.id("email"));
		
		sendKeys(userName, excelCode(13, 0));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		sendKeys(password, excelCode(13, 1));
		
		WebElement loginButton = driver.findElement(By.id("u_0_b"));
		
		clickButton(loginButton);
		
	

	}

}
