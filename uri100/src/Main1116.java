import java.util.Locale;
import java.util.Scanner;

public class Main1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		while (cont < n) {
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			cont = cont + 1;
			
			
			
			if ( y == 0) {
			System.out.println("divisao impossivel");
			}
			else {
				float div = x / y;
				System.out.printf("%.1f\n", div);
			}
				
		}
		sc.close();


}
}