package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio5 {
//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
	
	public static double meanNumbersMoreThan5(List<Integer> nums) {
		return nums.stream()
				.filter(n -> n > 5)
				.mapToInt(n -> n.intValue())
				.average()
				.getAsDouble()
				;
	}

	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(meanNumbersMoreThan5(numeros));
	}

}
