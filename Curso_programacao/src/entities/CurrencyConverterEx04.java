package entities;

public class CurrencyConverterEx04 {
	public static double IOF = 0.06;
	
	public static double converter(double price, double dollars) {
	
	return ((IOF * dollars ) + dollars) * price ;
	}
	

}
