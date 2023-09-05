package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {

	private static int sumEvens(List<Integer> nums) {
		return nums.stream()
			.filter(n -> n % 2 == 0)
			.reduce(0 , Integer::sum);
			//.reduce(0 , (x,y) -> (x+y));
	}

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(sumEvens(numeros));
	}

}
