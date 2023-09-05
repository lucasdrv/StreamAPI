package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Exercicio7 {
//Desafio 7 - Encontrar o segundo número maior da lista:
//	Com a ajuda da Stream API, encontre o segundo número maior da lista
//	e exiba o resultado no console.
	
	private static void secondBiggestNumber(List<Integer> nums) {
		nums.stream()
			.sorted()
			.skip(nums.size()-2)
			.limit(1)
			.forEach( n -> System.out.println(n));
			

	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 4, 3);
		secondBiggestNumber(numeros);
		
	}
	
	
}
