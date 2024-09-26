import java.util.Scanner;

public class Main1018 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int cem = n / 100;
	int cinq = (n % 100) / 50;
	int vinte = ((n % 100) % 50) / 20;
	int dez = (((n % 100) % 50) % 20) / 10;
	int cinco = ((((n % 100) % 50) % 20) % 10) / 5;
	int dois = (((((n % 100) % 50) % 20) % 10) % 5) / 2;
	int um = ((((((n % 100) % 50) % 20) % 10) % 5) % 2) / 1;
	
	System.out.println(n + "\n" +
						cem + " nota(s) de R$ 100,00\n" +
						cinq + " nota(s) de R$ 50,00\n" +
						vinte + " nota(s) de R$ 20,00\n" +
						dez + " nota(s) de R$ 10,00\n" +
						cinco + " nota(s) de R$ 5,00\n" +
						dois + " nota(s) de R$ 2,00\n" +
						um + " nota(s) de R$ 1,00"); 
						
	
	
	sc.close();
	}

}
