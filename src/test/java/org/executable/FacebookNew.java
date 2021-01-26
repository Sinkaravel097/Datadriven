package org.executable;

import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookNew extends Base_Class{

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
		
		explicitWait("//div[contains(text(),'entered')]");
		
		WebElement message = driver.findElement(By.xpath("//div[contains(text(),'entered')]"));

		String text = message.getText();
		
		System.out.println(text);
		
		excelWrite2(13, 2, text);
	
	
	
	

	}

}
