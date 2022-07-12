package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double calculator(double dollarQuote, double amountOfDollars) {
		return ((IOF * dollarQuote) * amountOfDollars) + dollarQuote * amountOfDollars;
	}
	
}
