package rocketBase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	// RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	// RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score

@Test
public void test1(){
	ArrayList<RateDomainModel> rts = RateDAL.getAllRates();
	assert(rts.size() > 0);
	ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
	assertEquals(rates.get(0).getdInterestRate(),7.00,0.01);
	assertEquals(rates.get(1).getdInterestRate(),6.50,0.01);
	assertEquals(rates.get(2).getdInterestRate(),6.00,0.01);
	assertEquals(rates.get(3).getdInterestRate(),5.75,0.01);
	assertEquals(rates.get(4).getdInterestRate(),5.50,0.01);
}
}
