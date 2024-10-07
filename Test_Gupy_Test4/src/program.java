import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,6,7);
		
		// list.stream(): Converte a lista em um Stream de inteiros, o que permite aplicar operações funcionais como map.
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray())); // toArray() Converte o array em uma string legível para exibição
		
		Stream<String> st2 = Stream.of("Maria", "João", "Pedro");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray())); //limit(10): Limita o Stream para pegar apenas os primeiros 10 elementos.
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
 		
		
		
		

	}

}
