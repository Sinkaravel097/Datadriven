package org.executable;

import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Naukri extends Base_Class{

	public static void main(String[] args) throws Exception {

		chromeBrowser(" https://my.naukri.com/account/register/basicdetails");
		
		maximize();
		
		implictWait();
		
		WebElement fresherOption = driver.findElement(By.xpath("//div[@class='fresherCont']"));
		
		clickButton(fresherOption);
		
		WebElement name = driver.findElement(By.id("fname"));
		
		sendKeys(name, excelCode(15, 0));
		
		WebElement emailId = driver.findElement(By.id("email"));
		
		sendKeys(emailId, excelCode(15, 1));
		
		WebElement password = driver.findElement(By.xpath("//input[@class='input ng-pristine ng-untouched ng-valid ng-valid-minlength ng-valid-maxlength']"));
		
		sendKeys(password, excelCode(15, 2));
		
		WebElement phoneNo = driver.findElement(By.xpath("//input[@class='input mobile ng-pristine ng-untouched ng-valid ng-valid-maxlength']"));
		
		sendKeys(phoneNo, excelCode(15, 3));
		
		Thread.sleep(3000);
		
		WebElement currentCity = driver.findElement(By.xpath("//div[@class='inpWrap']"));
		
		javaScriptClick(currentCity);
		
		WebElement optionChennai = driver.findElement(By.xpath("//li[text()='Chennai']"));
		
		clickButton(optionChennai);
	
		WebElement registor = driver.findElement(By.xpath("//button[text()='Register Now']"));
		
		clickButton(registor);
		
		Thread.sleep(3000);
		
		WebElement highestQualification = driver.findElement(By.xpath("(//input[@class='srchTxt ng-pristine ng-untouched ng-valid'])[1]"));
	
		clickButton(highestQualification);
		
		robotClass();
		
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.xpath("//input[@name='course_0']"));
		
		clickButton(course);
		
		robotClass();
		
		Thread.sleep(3000);
		
		WebElement specification = driver.findElement(By.xpath("//input[@name='spec_0']"));
		
		clickButton(specification);
		
		robotClass();
		
		WebElement institueName = driver.findElement(By.id("institute_0"));
		
		sendKeys(institueName, excelCode(15, 9));
		
		WebElement courseType = driver.findElement(By.xpath("(//label[@class='customRadioLbl'])[1]"));
		
		clickButton(courseType);
		
		Thread.sleep(3000);
		
		WebElement passingYear= driver.findElement(By.xpath("//input[@name='passingYear_0']"));
		
		clickButton(passingYear);
		
		robotClass();
		
		WebElement closeTheAdditionalFunction=driver.findElement(By.xpath("//span[text()='X']"));
		
		clickButton(closeTheAdditionalFunction);
		
		Thread.sleep(3000);
		
		WebElement skills = driver.findElement(By.xpath("//input[@name='keyskills']"));
		
		sendKeys(skills, excelCode(15, 11));
		
		robotClass1();
		
		Thread.sleep(3000);
		
		WebElement continueButton = driver.findElement(By.xpath("(//div[@class='submit-box'])[1]"));
		
		clickButton(continueButton);
		
		Thread.sleep(3000);
		
		WebElement descriptionYourProf = driver.findElement(By.id("title"));
		
		sendKeys(descriptionYourProf, excelCode(15, 12));
		
		Thread.sleep(3000);
		
		WebElement preferredLocation = driver.findElement(By.xpath("//input[@name='locationPref']"));
		
		clickButton(preferredLocation);
		
		robotClass2();
		
		WebElement skills1 = driver.findElement(By.xpath("//input[@name='skill0']"));
		
		sendKeys(skills1, excelCode(15, 13));
		
		WebElement version = driver.findElement(By.xpath("//input[@name='version0']"));
		
		sendKeys(version, excelCode(15, 14));
		
		Thread.sleep(3000);
		
		WebElement lastUsed = driver.findElement(By.xpath("//input[@name='lastUsedYear0']"));
		
		clickButton(lastUsed);
		
		robotClass1();
		
		Thread.sleep(3000);
		
		WebElement experiences = driver.findElement(By.xpath("//input[@name='expYear0']"));
		
		clickButton(experiences);
		
		robotClass2();
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='customRadioLbl'])[7]"));
		
		clickButton(gender);
		
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='submitProfileComplete']"));
		
		clickButton(submit);
		
		Thread.sleep(3000);
		
		WebElement orderConformation = driver.findElement(By.xpath("//div[text()='Your Naukri.com basic profile is saved.']"));
		
		String text = orderConformation.getText();
		
		excelWrite2(15, 16, text);
		
	

	}

}
