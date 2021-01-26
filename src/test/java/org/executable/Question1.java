package org.executable;

import java.io.IOException;

import org.base.Base;
import org.testng.annotations.Test;

public class Question1 extends Base {
	
	@Test
	private void tc1() throws IOException {
		rowAndColumnCount("E:\\Selenium Practical\\DataDriven\\Excel\\Student.xlsx", "Sheet1");
	}

}
