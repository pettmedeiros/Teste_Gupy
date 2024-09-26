package entities;

public class Calculator_Circunferencia {
	public static double PI = 3.14159; // static deixa o valor de PI inalteravel 
	
	public static double circumference(double radius) { //static deixa o valor da circunferecia inalterado, sendo igual para todo e qualquer objeto
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) { // static deixa o valor do volume inalterado, sendo igual para todo e qualquer objeto
		return 4.0 * PI * radius * radius * radius / 3.0; 
	}
	
}
