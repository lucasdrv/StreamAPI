package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicios11 {
// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
	//Utilizando a Stream API, encontre a soma dos quadrados de todos os números 
	//da lista e exiba o resultado no console.
	
	private static int sumSquareAll (List<Integer> nums) {
		return nums.stream()
				.map(n -> n*n)
				.reduce((n1, n2) -> n1+n2)
				.get();
		
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(sumSquareAll(numeros));
	}

}
