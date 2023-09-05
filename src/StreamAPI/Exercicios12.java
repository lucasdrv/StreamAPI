package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicios12 {
//Desafio 12 - Encontre o produto de todos os números da lista:
//	Com a ajuda da Stream API, encontre o produto de todos os números da lista
//	e exiba o resultado no console.
	
	private static int productAll(List<Integer> nums) {
		return nums.stream().reduce((n1, n2) -> n1*n2).get();
				
		
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(productAll(numeros));
	}

}
