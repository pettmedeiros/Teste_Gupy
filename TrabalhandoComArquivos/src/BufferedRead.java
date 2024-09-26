import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) {
		String path = "C:\\Temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine(); // vai ler as linhas até chegar um valor 
			while (line != null) { // enquanto nao chegar o valor nulo mostre na tela 
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
