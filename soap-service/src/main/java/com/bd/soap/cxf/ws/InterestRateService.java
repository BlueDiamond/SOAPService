package com.bd.soap.cxf.ws;

import java.util.Collection;

import javax.jws.WebService;

import com.bd.soap.cxf.bean.MortgageType;

@WebService
public interface InterestRateService {
	float getInterestRate(MortgageType type, int term);

	Collection<MortgageType> getMortgageTypes();

	void addMortgageType(MortgageType type);
}
