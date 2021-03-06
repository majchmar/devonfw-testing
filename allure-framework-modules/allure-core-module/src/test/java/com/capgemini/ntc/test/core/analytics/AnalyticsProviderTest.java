package com.capgemini.ntc.test.core.analytics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnalyticsProviderTest {
	
	@Before
	public void setup() {
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testGoogleProvider_sendClassName() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.GOOGLE;
		analyticsProvider.sendClassName("/com/capgemini/ntc/test/core/analytics", "AnalyticsProviderTest", "testGoogleProvider");
	}
	
	@Test
	public void testGoogleProvider_sendMethodEventShort() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.GOOGLE;
		analyticsProvider.sendMethodEvent("Selenium-Test-AnalyticsGoogleProvider");
	}
	
	@Test
	public void testGoogleProvider_sendMethodEventLong() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.GOOGLE;
		analyticsProvider.sendMethodEvent("Selenium-Test-AnalyticsGoogleProvider", "sendMethodEventLong");
	}
	
	@Test
	public void testDisabledProvider_sendClassName() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.DISABLED;
		analyticsProvider.sendClassName("/com/capgemini/ntc/test/core/analytics", "AnalyticsProviderTest", "testDisabledProvider");
	}
	
	@Test
	public void testDisabledProvider_sendMethodEventShort() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.DISABLED;
		analyticsProvider.sendMethodEvent("Selenium-Test-AnalyticsDisabledProvider");
	}
	
	@Test
	public void testDisabledProvider_sendMethodEventLong() {
		AnalyticsProvider analyticsProvider = AnalyticsProvider.DISABLED;
		analyticsProvider.sendMethodEvent("Selenium-Test-AnalyticsDisabledProvider", "testDisabledProvider - sendMethodEventLong");
	}
	
}
