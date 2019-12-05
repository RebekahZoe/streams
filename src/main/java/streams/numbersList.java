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

	public static List<Integer> getOdd(List<Integer> numbers) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer num : numbers) {
			if (num %2 !=0) {
				newList.add(num);
			}
		}
		return newList;
	}

	public static int getsum(List<Integer> numbers) {
		int sum =0;
		for (Integer num: numbers) {
			sum +=num;
		}
		return sum;
	}

	

	public static List<Integer> getsquared(List<Integer> numbers) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer num : numbers) {
			int squarenum = num*num;
				newList.add(squarenum);
			}
		return newList;
	}
	
	

}
