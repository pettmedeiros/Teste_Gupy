import java.util.Scanner;
import java.util.Locale;
public class Main1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
	
		float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		
		if (media >= 7.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno aprovado.\n");
		}
		else if (media < 5.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno reprovado.\n");
		}
		else if (media >= 5.0 && media < 7.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.printf("Aluno em exame.\n");
			float nExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", nExame);
            float mFinal = (media + nExame) / 2;
            if (mFinal >= 5.0) {
                System.out.print("Aluno aprovado.\n");

            } else {
                System.out.print("Aluno reprovado.\n");

            }

            System.out.printf("Media final: %.1f\n", mFinal);
		}
		
		sc.close();
		

	}

}
