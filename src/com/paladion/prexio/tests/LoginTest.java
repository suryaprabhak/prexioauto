package com.paladion.prexio.tests;

import com.paladion.prexio.fw.AbstractTestCase;
import com.paladion.prexio.utils.LoginUtil;

public class LoginTest extends AbstractTestCase {

	@Override
	protected void test() {
		LoginUtil.defaultLogin();
	}
}
