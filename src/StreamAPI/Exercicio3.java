package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {

	private static boolean areAllPositive(List<Integer> nums) {
		return !nums.stream()
				.anyMatch(n -> n < 0);

	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(numeros);
		System.out.println(areAllPositive(numeros));
	}

}
