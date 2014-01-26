package com.paladion.prexio.fw;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public abstract class AbstractTestCase {
	
	@Test
	@Parameters(value={"username", "password"})
	public void runTest(String username, String password) {
		TestProperties testProps = TestProperties.getInstance();
		testProps.clear();
		
		testProps.setProperty("username", username);
		testProps.setProperty("password", password);
		
		test();
	}
	
	protected abstract void test();
}
