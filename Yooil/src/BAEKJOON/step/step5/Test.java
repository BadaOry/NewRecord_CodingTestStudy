package BAEKJOON.step.step5;

public class Test {

	long sum(int[] a) {
		
		long sum = 0;
		
		for (int i : a) {			
			sum += i;
		}
		
		return sum;
	}
}