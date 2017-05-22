package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.FinanceLib;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		ArrayList<RateDomainModel> rates = _RateDAL.getAllRates();
		double dInterestRate = 0.0;
		
		for (java.util.Iterator<RateDomainModel> it = rates.iterator(); it.hasNext();){
			RateDomainModel rt = (RateDomainModel) it.next();
			if(rt != null && (rt.getiMinCreditScore() == GivenCreditScore)){
				dInterestRate = rt.getdInterestRate();
			}
		}
		if(dInterestRate == 0.0){
			throw new RateException(null);
		}
		return dInterestRate;
		
		
		
		
	}
	
	
	
	
	
	
	
	//RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
