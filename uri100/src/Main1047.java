import java.util.Scanner;

public class Main1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int duracao;
        int hInicio = a * 60 + b;
        int hFinal = c * 60 + d;
        
        if (a <= c) {
            duracao = hFinal - hInicio;
            if (duracao == 0) {
                System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTO(S)\n", (duracao % 60));
            }
            else {
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", ((duracao - duracao % 60) / 60), (duracao % 60));
            }
        }
        else{
            duracao = (24 * 60 - hInicio) + hFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", ((duracao - duracao % 60) / 60), (duracao % 60));
        }
    }
 
}