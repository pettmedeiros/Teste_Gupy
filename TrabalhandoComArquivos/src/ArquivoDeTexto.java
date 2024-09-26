import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoDeTexto {

	public static void main(String[] args) {
		File file = new File("C:\\Temp\\in.txt"); // importando um arquivo de texto da pasta temp
		Scanner sc = null; 
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // testar se existe mais linhas no arquivo
				System.out.println(sc.nextLine()); //imprimir todas as linhas do arquivo
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc !=null) {
				sc.close();
			}
		}
	}
	
	
	
}
