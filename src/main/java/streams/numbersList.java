package streams;

import java.util.Collections;
import java.util.List;

public class numbersList {

	public static int getMax(List<Integer> numbers) {
		int max = Collections.max(numbers);
		return max;
		
	}

	public static int getMin(List<Integer> numbers) {
		int min = Collections.min(numbers);
		return min;
	}

}
