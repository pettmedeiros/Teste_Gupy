// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
//1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
//deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.


import java.util.Scanner;

public class Main1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasol = 0;
		int diesel = 0;
		int x = 0;
		
		while (x != 4) {
			x = sc.nextInt();
			
			if (x == 1) {
				alcool = alcool + 1;
			}
			else if (x == 2) {
				gasol = gasol + 1;
			}
			else if (x == 3) {
				diesel = diesel + 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasol);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
