package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Optional; 
import java.util.Comparator;
public class numbersStream {

	public static int getMax(List<Integer> numbers) {
		int max = numbers.stream()
				.max(Integer::compare)
                .get();
		
		return max;
	}

}