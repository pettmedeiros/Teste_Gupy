
public class Operacao_Split {

	public static void main(String[] args) {
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];    // nesse caso tira as palavras juntas e coloca em um vetor, permintindo trabalhar individualmente
		
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
