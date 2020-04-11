package com.itv.talentpaymentskata;

import java.math.BigDecimal;

/**
 * Please implement this interface.
 * <p>
 * The week's timesheet information will be presented in a comma-separated format, one row per day, and each row 
 * will have 3 columns: date, the role being performed (Actor/Stuntman/Writer), and the number of hours worked
 * <p>
 * For example:
 * 13/05/2019,Actor,5
 * 14/05/2019,Writer,8
 * 16/05/2019,Actor,7
 * 17/05/2019,Actor,10
 * <p>
 * Note that there is no entry for 15/05/2019 as no hours were logged.
 * The timesheet only covers one person working during one week. That person will only be performing one role 
 * on a given day, i.e. they won't be both Actor and Writer on the same day.
 */
public interface PaymentCalculator
{
	/**
	 * @param timesheetContents Contains the full week's timesheet. Note that this is the timesheet contents themselves,
	 *                          not a filename or path
	 * @return The calculated amount to be paid, to 2 dp
	 */
	BigDecimal calculatePayment(final String timesheetContents);
}
