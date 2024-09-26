import java.io.File;
import java.util.Scanner;

public class Manipulando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine(); // o caminho digitado será salvo no strPath
		
		File path = new File(strPath); // aqui faz o chamado do caminho na variavel path
		
		File[] folders = path.listFiles(File:: isDirectory); //crio uma lista com apenas os diretorios ou pastas 
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File:: isFile);//crio uma lista com apenas arquivos
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfuly: " + sucess);
		
		
		sc.close();
	}

}
