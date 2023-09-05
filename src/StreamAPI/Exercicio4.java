package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio4 {
	
	private static List<Integer> removeOdds(List<Integer> nums) {
		return nums.stream()
			.filter(n -> n % 2 == 0)
			.toList()
			;
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(removeOdds(numeros));
	}
}
