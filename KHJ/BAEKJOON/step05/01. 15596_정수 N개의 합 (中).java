package BAECKJOON;

public class Test {
	
	public long sum(int[] a) {
		
		// 01. 15596_정수 N개의 합 (中)
	/*
	 	시간 제한 : 0.1초 / 메모리 제한 : 512MB
	 	
		정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		작성해야 하는 함수는 다음과 같다.
			Java: long sum(int[] a); (클래스 이름: Test)
			a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
			리턴값: a에 포함되어 있는 정수 n개의 합
		=>  
			1. 문제를 이해하지 못함..
				main을 구현하는 것이 아닌 "함수만" 구현하는 것이다.
				(int[] a) => 함수로 넘어오는 인자 a는 정수 배열이다.

	 */
		// a배열 정수의  합 : sum
		long sum  = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
	}
}
