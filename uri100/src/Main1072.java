// eia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

import java.util.Scanner;

public class Main1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int val [] = new int[v];
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < v; i ++) {
			val [i] = sc.nextInt();
		}		
		 for (int i = 0; i < v; i++) {
	            if (val[i] >= 10 && val[i] <= 20) {
	                in++;
	            }
	            else {
	                out++;
	            }
	        }
	        System.out.println(in + " in\n"
	                        + out + " out");
		
		sc.close();
		

	}

}
