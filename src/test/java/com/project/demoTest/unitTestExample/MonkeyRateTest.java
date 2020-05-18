package com.project.demoTest.unitTestExample;

import org.junit.Assert;
import org.junit.Test;

public class MonkeyRateTest {
	@Test
	public void check1(){Assert.assertEquals("r = 4.3%; S = 55.20 mVNĐ", MoneyRate.calculateMoneyRate(100,12));}
}
