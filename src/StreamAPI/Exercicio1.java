package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {
	
	private static void sortPrint(List<Integer> nums){
		nums.stream()
			.sorted()
			.forEach(n -> System.out.println(n));
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		sortPrint(numeros);
	}

}
