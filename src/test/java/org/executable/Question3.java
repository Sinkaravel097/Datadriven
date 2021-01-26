package org.executable;

import java.io.IOException;

import org.base.Base;
import org.testng.annotations.Test;

public class Question3 extends Base {
	
	@Test
	private void tc1() throws IOException {
		createRow(11);
		writeDataToParticularCell(11, 0, "test");
		writeDataToParticularCell(11, 1, "tester");

	}

}
