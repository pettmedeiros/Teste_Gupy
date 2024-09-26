import java.util.Locale;
import java.util.Scanner;

public class Main1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		 Scanner leitor = new Scanner(System.in);
	        
	        int cod = leitor.nextInt();
	        int qntd = leitor.nextInt();
	        double tot;
	        
	        if (cod == 1) {
	            tot = qntd * 4.00;
	            System.out.printf("Total: R$ %.2f\n", tot);
	        }
	        else if (cod == 2) {
	            tot = qntd * 4.50;
	            System.out.printf("Total: R$ %.2f\n", tot);
	        }
	        else if (cod == 3) {
	            tot = qntd * 5.00;
	            System.out.printf("Total: R$ %.2f\n", tot);
	        }
	        else if (cod == 4) {
	            tot = qntd * 2.00;
	            System.out.printf("Total: R$ %.2f\n", tot);
	        }
	        else if (cod == 5) {
	            tot = qntd * 1.50;
	            System.out.printf("Total: R$ %.2f\n", tot);
	        }
	    }
	 
	}