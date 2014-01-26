package com.paladion.prexio.utils;

import com.paladion.prexio.fw.TestProperties;
import com.paladion.prexio.pages.LoginPage;

public class LoginUtil {
	private static LoginPage loginPage = new LoginPage();
	private static TestProperties testProps = TestProperties.getInstance();
	
	public static void defaultLogin() {
		login(testProps.getProperty("username"), testProps.getProperty("password"));
	}
	
	public static void login(String userName, String password) {
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}
}