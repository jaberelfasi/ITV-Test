package com.itv.talentpaymentskata;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculationLogic {
	
	public BigDecimal calculatePay(ArrayList<String[]> csvConvertedToArrayList) {
		
		
		double valueProcessing = 0;
		
		//iterate through each ArrayList element (csvRow[x]) to calculate the payment of each job.
		
		for (int i=0; i<csvConvertedToArrayList.size(); i++) {
			double tempValueProcessing = 0;
			String[] csvRow = csvConvertedToArrayList.get(i);
			double workedTime = Double.parseDouble(csvRow[2]);
			double overTime = 0;
			if(workedTime>8) {
				overTime = (workedTime-8);
				workedTime = workedTime - overTime;
				tempValueProcessing = overTime * 1.5;
			}
			
			//csvRow[0] contains the date
			//csvRow[1] contains the job type
			//csvRow[2] contains the worked hours
			
			switch(csvRow[1]) {
			case "Actor": tempValueProcessing = tempValueProcessing + (workedTime * 100);
				break;
			case "Writer":tempValueProcessing = tempValueProcessing + (workedTime * 140);
				break;
			case "Stuntman":tempValueProcessing = tempValueProcessing + (workedTime * 120);
				break;
			}
			
			valueProcessing = valueProcessing + tempValueProcessing;
		}
		
		
		
		
		BigDecimal paymentResult = new BigDecimal(valueProcessing);
		return paymentResult;
	}

}
