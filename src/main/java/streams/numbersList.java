package streams;

import java.util.ArrayList;
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

	public static List<Integer> getEven(List<Integer> numbers) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer num : numbers) {
			if (num %2 ==0) {
				newList.add(num);
			}
		}
		return newList;
	}
	

}
