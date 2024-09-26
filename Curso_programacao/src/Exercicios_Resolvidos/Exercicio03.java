package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentEx03;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentEx03 std = new StudentEx03(); 
		
		System.out.print("What is name your student? " );
		std.name = sc.next();
		System.out.println();
		
		System.out.println("Put here your grade: ");
		std.grade1 = sc.nextDouble();
		std.grade2 = sc.nextDouble();
		std.grade3 = sc.nextDouble();
		System.out.println();
		
		System.out.printf("FINAL GRADE = %.2f\n", std.finalGrade() );
		if (std.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", std.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		
		
		sc.close();
		
		
		

	}

}
