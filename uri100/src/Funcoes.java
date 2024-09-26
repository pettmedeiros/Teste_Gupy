// Fazer um programa para ler três números inteiros e mostrar na tela o maior deles

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
		System.out.println("Higher = " + a);
		} 
		else if (b > c) {
		System.out.println("Higher = " + b);
		} 
		else {
		System.out.println("Higher = " + c);
		}
		
		sc.close();
		
	
		
 */  // esse modo é o tradicional
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c); //função higher é para dizer qual é o maior
		showResult(higher);
		sc.close();
		}
	
		public static int max(int x, int y, int z) { //porém tem que fazer o mesmo if la de cima para achar o numero maior
		int aux;
		if (x > y && x > z) {
		aux = x;
		} else if (y > z) {
		aux = y;
		} else {
		aux = z;
		}
		return aux;
		}
		public static void showResult(int value) {
		System.out.println("Higher = " + value);
		
	}
	}	
		


