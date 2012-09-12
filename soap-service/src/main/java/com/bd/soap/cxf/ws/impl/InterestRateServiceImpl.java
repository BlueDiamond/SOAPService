package com.bd.soap.cxf.ws.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.jws.WebService;

import com.bd.soap.cxf.bean.MortgageIdentifier;
import com.bd.soap.cxf.bean.MortgageType;
import com.bd.soap.cxf.ws.InterestRateService;

@WebService(endpointInterface = "com.mycompany.webservice.service.InterestRateService")
public class InterestRateServiceImpl implements InterestRateService {
	List<MortgageType> mortgageTypes = new ArrayList<MortgageType>();
	
	public float getInterestRate(MortgageType type, int term) {
		float rate = 0.0f;

		if (type.equals("CLOSED")) {
			if (term == 1) {
				rate = 3.9f;
			} else if (term > 1 && term < 5) {
				rate = 4.0f;
			} else if (term >= 5 && term < 10) {
				rate = 4.9f;
			} else if (term > 10) {
				rate = 5.9f;
			}
		} else if (type.equals("OPEN")) {
			rate = 6.5f;
		} else if (type.equals("CONVERT")) {
			rate = 4.9f;
		} else if (type.equals("CASH-BACK")) {
			rate = 6.1f;
		}
		return 0;
	}

	@Override
	public Collection<MortgageType> getMortgageTypes() {
		List<MortgageType> mortgageTypes = new ArrayList<MortgageType>();

		mortgageTypes.add(new MortgageType(MortgageIdentifier.CASH_BACK, "Cash Back", 
						"5% CashBack can add up to a lot of renovations" 
						+ "furniture or appliances, or just a lot of money"
						+ " in your account!"));
		mortgageTypes
				.add(new MortgageType(
						MortgageIdentifier.CLOSED,
						"Closed",
						"Take out a five-year, Closed Variable Interest "
								+ "Rate Mortgage. As with the Open Variable Interest Rate "
								+ "Mortgage, the interest rate is set on the first day of "
								+ "each month, and your payments remain the same."));

		mortgageTypes.add(new MortgageType(MortgageIdentifier.CONVERT,
				"Convert", "Take advantage of interest rate fluctuations"));

		mortgageTypes
				.add(new MortgageType(
						MortgageIdentifier.OPEN,
						"Convert",
						"Prepay any amount of your mortgage, at any time, " +
						"with no administration costs and no prepayment charges"));
		return mortgageTypes;
	}

	@Override
	public void addMortgageType(MortgageType type) {
		mortgageTypes.add(type);
	}

}
