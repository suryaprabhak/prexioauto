package com.paladion.prexio.fw;

import java.util.HashMap;
import java.util.Map;

public class TestProperties {
	private static final TestProperties INSTANCE = new TestProperties();
	private Map<String, String> testProps = new HashMap<>();
	
	private TestProperties() {
		//do nothing
	}
	
	public static TestProperties getInstance() {
		return INSTANCE;
	}
	
	public void clear() {
		testProps.clear();
	}
	
	public String getProperty(String propertyName) {
		return testProps.get(propertyName);
	}
	
	public void setProperty(String propertyName, String propertyValue) {
		testProps.put(propertyName, propertyValue);
	}
}
