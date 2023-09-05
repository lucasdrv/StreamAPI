package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 
// e exiba o resultado no console.
	
	private static boolean ifNumMore10(List<Integer> nums) {
		return nums.stream()
			.anyMatch(n -> n>10);
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 9, 5, 4, 3);
		System.out.println(ifNumMore10(numeros));
	}

}
