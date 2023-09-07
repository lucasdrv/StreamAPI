package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios16 {
//Desafio 16 - Agrupe os números em pares e ímpares:
//	Utilize a Stream API para agrupar os números em duas listas separadas, 
//	uma contendo os números pares e outra contendo os números ímpares da lista original, 
//	e exiba os resultados no console.
	
	private static ArrayList<List<Integer>> oddsAndEvents(List<Integer> nums) {
		ArrayList<List<Integer>> Listas = new ArrayList<>();
		Listas.add(nums.stream().filter(n -> n % 2 == 0).toList());
		Listas.add(nums.stream().filter(n -> n % 2 == 1).toList());
		return Listas;
		
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(oddsAndEvents(numeros));
	}

}
