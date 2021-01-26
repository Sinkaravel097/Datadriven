package org.executable;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.support.ui.Select;
import org.pojo.Question5Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question4 extends Base{

	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test
	private void tc1() throws IOException {		
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		System.out.println("Title of this page : "+pageTitle());
		Question5Pojo q5 = new Question5Pojo();
		findEle(q5.getFirstname(), question5(1, 0));
		findEle(q5.getLastName(), question5(1, 1));
		findEle(q5.getEmail(), question5(1, 2));
		javaClick(q5.getGender());
		findEle(q5.getNumber(), question5(1, 3));
		javaSendKeys(q5.getSub(), question5(1, 4));
		Object jg = javaGetAttribute(q5.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q5.getHobbies());
		javaClick(q5.getHobbies());
		findEle(q5.getAddress(), question5(1, 5));
		boolean select = isSelect(q5.getState());
		System.out.println("If we select the state dropdown? : "+select);
		boolean select2 = isSelect(q5.getCity());
		System.out.println("If we select the city dropdown? : "+select2);
		clickAny(q5.getSubmit());
		
		String textGet = textGet(q5.getSuccessful());
		if (textGet.contains("Thanks")) {
			System.out.println("Valid Inputs");
		}

	}

}
