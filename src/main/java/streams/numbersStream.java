package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Optional;
import java.util.Collection;
import java.util.Comparator;
public class numbersStream {

	public static int getMax(List<Integer> numbers) {
		int max = numbers.stream()
				.max(Integer::compare)
                .get();
		
		return max;
	}

	public static int getMin(List<Integer> numbers) {
		int min = numbers.stream()
				.min(Integer::compare)
                .get();
		
		return min;
	}

	public static List<Integer> getEven(List<Integer> numbers) {
		List<Integer> list = numbers.stream()
							.filter(num -> num%2 == 0)
							.collect(Collectors.toList());
		return list;
	}

	public static List<Integer> getOdd(List<Integer> numbers) {
		List<Integer> list = numbers.stream()
				.filter(num -> num%2 != 0)
				.collect(Collectors.toList());
		return list;
	}

	public static int getsum(List<Integer> numbers) {
		int sum = numbers.stream()
				  .reduce((accumulator, current)->  (accumulator + current))
				  .get();
		return sum;
	}

}
