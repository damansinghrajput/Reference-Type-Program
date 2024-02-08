package test.com;

import java.time.*;
public class TotalDay {
	
	
	

	public static void main(String[] args) {

		LocalDate ldt = LocalDate.of(2024, Month.FEBRUARY, 8);
		Month m = ldt.getMonth();
		int cm = m.getValue();
		int dm = m.minLength();
		int mdm = m.maxLength();
		Month firstMonthOfQuarter = m.firstMonthOfQuarter();
		System.out.println("Current Month of Number : " + cm);
		System.out.println("Number of Days in Month : " + dm);
		System.out.println("Maximum Number of Days in Month : " + mdm); 
		System.out.println("First Month of the Quarter : " + firstMonthOfQuarter); 
}
}