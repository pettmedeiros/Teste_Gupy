package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancariaEx05;

public class Exercicio05ContaBancaria {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancariaEx05 account;	
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
				
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
		
			System.out.println();
		
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			System.out.println();
			account = new ContaBancariaEx05(accountNumber, holder, initialDeposit);
		}
		else {
			account = new ContaBancariaEx05(accountNumber, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account);
		
		
		
		
		


		
		
		
		
		
		
		sc.close();

	}

}
