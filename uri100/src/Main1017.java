import java.util.Scanner;
import java.util.Locale;
public class Main1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempo = sc.nextInt();
		int vel = sc.nextInt();
		double l = (tempo * vel) / 12.0; 
		System.out.printf("%.3f\n", l);
		
		
		sc.close();
	}

}
