package com.itv.talentpaymentskata;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PaymentcalculatorImp implements PaymentCalculator{

	@Override
	public BigDecimal calculatePayment(String timesheetContents) {
		// TODO Auto-generated method stub
		
		//reading the csv file
		ArrayList<String[]> csvConvertedToArrayList = new ArrayList<String[]>();
		CSVReader csvReader = new CSVReader();
		csvConvertedToArrayList = csvReader.readCSV(timesheetContents);
		
		//calculate payment
		CalculationLogic calLogic = new CalculationLogic();	
		BigDecimal paymentResult;
		paymentResult = calLogic.calculatePay(csvConvertedToArrayList);
		
		System.out.println(paymentResult);
		return paymentResult;
	}

}
