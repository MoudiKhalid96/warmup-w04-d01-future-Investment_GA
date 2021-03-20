package warmup;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Investment{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Input the investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Input the rate of interest: ");
		double rateOfInterest = input.nextDouble();
		
		System.out.print("Input number of years: ");
		double investmentYears = input.nextDouble();
		
		investment(investmentAmount, rateOfInterest, investmentYears);
		
	}
	
	public static void investment(double amount, double rate, double years) {
		NumberFormat formatter = new DecimalFormat("#0.0");
		double investmentOverYears = amount;
		
		System.out.println("\n\nYears \t FutureValue");
		
		for(int i=1 ; i<=years ; i++) {
			investmentOverYears += (investmentOverYears / rate);
			System.out.println(i + " \t " + formatter.format(investmentOverYears));
		}
	}
}






