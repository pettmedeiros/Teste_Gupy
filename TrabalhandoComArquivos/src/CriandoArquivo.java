import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good aferternoon", "Good night"};
		
		String path = "C:\\temp\\out.text";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
	}
		catch (IOException e){
			e.printStackTrace();
		}
}
}
