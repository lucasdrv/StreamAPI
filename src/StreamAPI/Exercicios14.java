package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercicios14 {
//Desafio 14 - Encontre o maior número primo da lista:
//	Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	
	private static int biggestPrime(List<Integer> nums) {
		return nums.stream().filter(isPrime).max(new ComparatorMax()).get();
		
	}
	
	static Predicate<Integer> isPrime = new Predicate<>() {

		@Override
		public boolean test(Integer num) {
			if(num == 2) return true;
			if(num >2) {
				for (int i=2; i<num ;i++) {
					if (num % i == 0) return false;
				}
				return true;
			} 
			else 
				return false;
		}
		
	};
	

	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 4, 3);
		
		System.out.println(biggestPrime(numeros));
	}

}	

class ComparatorMax implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1, o2);
	}
		
	}
