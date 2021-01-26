package org.executable;

import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolsQa extends Base_Class{

	public static void main(String[] args) throws Exception {

		chromeBrowser("https://demoqa.com/automation-practice-form/");
		
		maximize();
		
		implictWait();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		
		sendKeys(firstName, excelCode(20, 0));
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		sendKeys(lastName, excelCode(20, 1));
		
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		
		sendKeys(userEmail, excelCode(20, 2));
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
		
		clickButton(gender);
		
		WebElement phoneNumber = driver.findElement(By.id("userNumber"));
		
		sendKeys(phoneNumber, excelCode(20, 3));
		
		WebElement subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
	
		javaScriptValue(subjects, "English");
		
		System.out.println(getAttribute(subjects)); 
		
		WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-1"));
		
		clickButton(hobbies);
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		
		sendKeys(currentAddress, excelCode(20, 5));
		
		WebElement stateAndCity = driver.findElement(By.id("state"));
		
		javaScriptValue(stateAndCity, "NCR");
		
		System.out.println(getAttribute(stateAndCity));
		
		boolean displayed = stateAndCity.isDisplayed();
		
		System.out.println("Value is in Hide: " + displayed);

	}

}
