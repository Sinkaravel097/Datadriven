package org.executable;

import org.base.Base;
import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends Base_Class{

	public static void main(String[] args) throws Exception {
		
		chromeBrowser("http://www.adactin.com/HotelApp/");
		
		maximize();
		
		implictWait();
		
		WebElement userName = driver.findElement(By.id("username"));
		
		sendKeys(userName, excelCodeAdactinHotel(1, 0));
		
		WebElement password = driver.findElement(By.id("password"));
		
		sendKeys(password, excelCodeAdactinHotel(1, 1));
		
		WebElement loginButton = driver.findElement(By.id("login"));
		
		clickButton(loginButton);
		
		WebElement welcomeNotes = driver.findElement(By.id("username_show"));
				
		System.out.println(getAttribute(welcomeNotes));
		
		WebElement location = driver.findElement(By.id("location"));
		
		dropDown(location, excelCodeAdactinHotel(1, 2));
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		
		dropDown(hotels, excelCodeAdactinHotel(1, 3));
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		
		dropDown(roomType, excelCodeAdactinHotel(1, 4));
		
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		
		dropdown1(numberOfRooms, excelCodeAdactinHotel(1, 5));
		
		WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
		
		dropdown1(adultPerRoom, excelCodeAdactinHotel(1, 6));
		
		WebElement childPerRoom = driver.findElement(By.id("child_room"));
		
		dropdown1(childPerRoom, excelCodeAdactinHotel(1, 7));
		
		WebElement searchButton = driver.findElement(By.id("Submit"));
		
		clickButton(searchButton);
		
		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		
		clickButton(radioButton);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		
		clickButton(continueButton);
	
		WebElement firstName = driver.findElement(By.id("first_name"));
		
		sendKeys(firstName, excelCodeAdactinHotel(1, 8));
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		
		sendKeys(lastName, excelCodeAdactinHotel(1, 9));
		
		WebElement billingAddress = driver.findElement(By.id("address"));
		
		sendKeys(billingAddress, excelCodeAdactinHotel(1, 10));
		
		WebElement creditCardNo = driver.findElement(By.id("cc_num"));
		
		sendKeys(creditCardNo, excelCodeAdactinHotel(1, 11));
		
		WebElement creditCardType = driver.findElement(By.id("cc_type"));
		
		dropDown(creditCardType, excelCodeAdactinHotel(1, 12));
		
		WebElement selectMonth = driver.findElement(By.id("cc_exp_month"));
		
		dropDown(selectMonth, excelCodeAdactinHotel(1, 13));
		
		WebElement selectYear = driver.findElement(By.id("cc_exp_year"));
		
		dropDown(selectYear, excelCodeAdactinHotel(1, 14));
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		
		sendKeys(cvv, excelCodeAdactinHotel(1, 15));
		
		WebElement bookNow = driver.findElement(By.id("book_now"));
		
		clickButton(bookNow);
		
		Thread.sleep(3000);
		
		WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
		
		String attribute = getAttribute(orderNo);
		
		excelWriteAdactinHotel(1, 16, attribute);
		
	

	}

}
