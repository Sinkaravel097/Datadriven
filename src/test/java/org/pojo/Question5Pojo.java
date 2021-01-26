package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Question5Pojo extends Base {

	public Question5Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	private WebElement firstname;

	@FindBys({ @FindBy(id = "firstName"), @FindBy(className = " mr-sm-2 form-control") })
	private WebElement first;

	@FindAll({ @FindBy(id = "lastName"), @FindBy(className = " mr-sm-2 form-control") })
	private WebElement lastName;

	@FindBys({ @FindBy(id = "lastName"), @FindBy(className = " mr-sm-2 form-control") })
	private WebElement last;

	@FindAll({ @FindBy(id = "userEmail"), @FindBy(className = "mr-sm-2 form-control"),
			@FindBy(xpath = "//input[@placeholder='name@example.com']") })
	private WebElement email;

	@FindBy(xpath = "//input[@id='gender-radio-1']")
	private WebElement gender;

	@FindBy(id = "userNumber")
	private WebElement number;

	@FindAll({ @FindBy(id = "subjectsContainer"), @FindBy(xpath = "(//div[@class='col-md-9 col-sm-12'])[5]") })
	private WebElement sub;

	@FindAll({ @FindBy(xpath = "//label[text()='Sports']"), @FindBy(id = "hobbies-checkbox-1") })
	private WebElement hobbies;

	@FindAll({ @FindBy(id = "currentAddress"), @FindBy(xpath = "//textarea[@placeholder='Current Address']"),
			@FindBy(tagName = "textarea") })
	private WebElement address;

	@FindBy(xpath = "//div[text()='Select State']")
	private WebElement state;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[text()='Thanks for submitting the form']")
	private WebElement successful;
	
	@FindBy(xpath="//div[text()='Select City']")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}

	public WebElement getSuccessful() {
		return successful;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getFirst() {
		return first;
	}

}
