package com.test.project;

import org.testng.annotations.Test;

public class F_ExpectedException {
	@Test(expectedExceptions=NumberFormatException.class)
	public void infiniteLoop()
	{
		String x ="100A";
		Integer.parseInt(x);
	}

}
