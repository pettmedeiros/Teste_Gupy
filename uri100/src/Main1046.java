import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hInicio = sc.nextInt();
		int  hFim= sc.nextInt();
		int tempo;
		
		if (hInicio > hFim) {
			tempo = 24 + hFim - hInicio;
		}
		else if (hFim > hInicio) {
			tempo = hFim - hInicio;
		}
		else {
			tempo = 24;
		}
		
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)"); 
		
		sc.close();
	}

}
