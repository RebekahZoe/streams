package streams;

import java.util.List;

public class numbersList {

	public static int getMax(List<Integer> numbers) {
		int max =0;
		for (int i =0; i< numbers.size();i++) {
			
			max = Math.max(max, i);
		}
		return max;
	}

	public static int getMin(List<Integer> numbers) {
		int min = 11;
		for (int i =0; i< numbers.size();i++) {
			
			min = Math.min(min, i);
		}
		return min;
	}

}
