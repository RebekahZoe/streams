package streams;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StreamTest {

	@Test
	public void streamTest() {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i=0; i<11; i++) {
			numbers.add(i);
		}
		
		int max = numbersStream.getMax(numbers);
		Assert.assertEquals(10, max);
		
		int min = numbersStream.getMin(numbers);
		Assert.assertEquals(0, min);
		
		List<Integer> evenList = new ArrayList<Integer>();
		
		for (int i=0; i < numbers.size();i++) {
			if( i%2 ==0) {
			evenList.add(i);
		}
		}
		List<Integer> evenListActual = numbersStream.getEven(numbers);
		Assert.assertEquals(evenList, evenListActual);
		
		List<Integer> oddList = new ArrayList<Integer>();
		
		for (int i=0; i < numbers.size();i++) {
			if( i%2 !=0) {
			oddList.add(i);
		}
		}
		List<Integer> oddListActual = numbersStream.getOdd(numbers);
		Assert.assertEquals(oddList, oddListActual);
		
		int sum = numbersStream.getsum(numbers);
		Assert.assertEquals(55, sum);
		
		int squaredMin = numbersStream.getMin(numbersStream.getsquared(numbers));
		Assert.assertEquals(0,squaredMin);
	}

}
