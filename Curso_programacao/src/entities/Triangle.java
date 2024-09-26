package entities;

public class Triangle { // estou criando uma classe para ser importada no programa principal. 
	public double a;    // uma classe para triangulos
	public double b;
	public double c;

public double area() { // aqui estou fazendo o calcula da area para importador no programa principal
	double p = (a + b + c) / 2.0; // funciona tanto para area de X quanto para area de Y
	return Math.sqrt(p * (p - a) * (p - b) * (p -c));
	
	
}
}


