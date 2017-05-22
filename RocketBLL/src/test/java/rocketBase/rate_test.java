package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	// RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	// RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void TestInterestRAte() throws RateException{
		assertEquals(RateBLL.getRate(700),6.0,0.001);
	}
	@Test
	public void Testexcept() throws RateException{
		RateBLL.getRate(150);
	}
	@Test
	public void TestgetPay(){
		assertEquals(RateBLL.getPayment(0.04, 360, 300000, 0, false),1432.25,0.01);
	}

}
