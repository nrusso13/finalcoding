package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {

	RateDomainModel y = new RateDomainModel();
	
	public RateException(RateDomainModel y){
		this.y = y;
	}
	public RateDomainModel getRateDomainModel(){
		return y;
	}
}
