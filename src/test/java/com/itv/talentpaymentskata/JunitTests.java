package com.itv.talentpaymentskata;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTests {


	
	@Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
		
		PaymentcalculatorImp tester = new PaymentcalculatorImp(); // MyClass is tested
		
        // assert statements
		//manually calculated the payment
		//100 x (5+7+8) Actor
		//140 x 8 Writer
		//2 overtime hourse for an Actor x 1.5
		//the total value is 3123
		//the code should extract the values from the csv file are the result should match 3123.
        assertEquals(3123, tester.calculatePayment("src/main/resources/example-timesheet.csv").doubleValue(), 0);
    }

}
