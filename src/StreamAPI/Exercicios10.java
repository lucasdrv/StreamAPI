package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicios10 {
//	Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//		Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 
//		e exiba o resultado no console.
	
	
	
	private static List<Integer> oddMultipleOf3Or5(List<Integer> nums) {
		return nums.stream()
			.sorted()
			.filter(oddMultipleOf3Or5Calculator)
			.toList()
			;
	}
	
	static Predicate<Integer> oddMultipleOf3Or5Calculator = new Predicate<Integer>() {
		@Override
		public boolean test(Integer n) {
			if(n % 2 == 1)
				if(n % 3 == 0 || n % 5 == 0) {
					return true;
				}
			return false;
	      }
		
	};
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		System.out.println(oddMultipleOf3Or5(numeros));
	}

}
