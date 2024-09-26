// Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
//Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) 
// ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), 
//pois por definição zero é par, seu programa deverá imprimir apenas NULL.

import java.util.Scanner;

public class Main1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qntd = sc.nextInt();

        for (int i = 0; i < qntd; i++) {
            int valor = sc.nextInt();
            if (valor % 2 == 0) {
                if (valor == 0) {
                    System.out.println("NULL");
                }
                if (valor > 0) {
                    System.out.println("EVEN POSITIVE");
                } 
                else if (valor < 0) {
                    System.out.println("EVEN NEGATIVE");
                }
            } 
            else {
                if (valor > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }     
        }
        
        sc.close();
        
    }
}