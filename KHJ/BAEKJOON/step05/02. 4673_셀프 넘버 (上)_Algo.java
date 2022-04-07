package BAECKJOON;

public class Main {

	public static void main(String[] args) {
		
		// 02. 4673_셀프 넘버 (上)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의할 때
		(d(75) = 75+7+5 = 87)
		이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 	
		
		n을 d(n)의 생성자라고 한다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
		생성자가 없는 숫자를 셀프 넘버라고 한다.
		
		입력은 없다.
		10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		=> 함수를 만들고 알고리즘을 구현하여 문제를 해결해야한다.
		   참고 사이트 : https://st-lab.tistory.com/53
		
		  1. 문제 이해에 시간이 걸림
		  2. 더러운 코드 짜다가 참고사이트 봄..(boolean배열을 만드는 것까지 생각했음)
		  3. 각 자릿수 합을 구하는 알고리즘 작성법을 몰랐다 => 알고리즘 대단해!! 

	 */
	
// =============================================================================		
		
		/*	
	 	처음 만든 나의 더러운 코드
	  
		// 양의 정수 n
		int n = 33;
		System.out.println("양의 정수 : " + n);
		
		// 만(10000)의 자리수

		// 천의 자리수
		int w = n/1000 * 1000;
		System.out.println("천의 자리수 : " + w);
		// 백의 자리수
		int e = (n-w)/100 * 100;
		System.out.println("백의 자리수 : " + e);
		// 십의 자리수
		int r = (n-w-e)/10 * 10;
		System.out.println("십의 자리수 : " + r);
		// 일의 자리수
		int t = (n-w-e-r);
		System.out.println("일의 자리수 : " + t);
		
		int nc = 0;
		
		do {
			System.out.println(n);
			n = n + (w/1000+e/100+r/10+t);
		} while (n <= 10000);
		
		int[] arr = new int[10000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		 */
		
// =============================================================================	
		
		boolean[] check = new boolean[10001]; // 1~10000까지 이므로 (0은 default값으로 false)
		
		for(int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			// 생성자가 있는 수의 인덱스를 true로 => false인 수가 셀프 넘버!! 
			if(n <= 10000) {
				check[n] = true;
			}
		}		
	
		for(int i = 1; i <= 10000; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	// 함수 작성(★ 반복문을 통하여 자릿수 별 합을 구하는 알고리즘 기억하자!!)
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number%10);	// 첫 째 자리수
			number = number/10; 		// 10을 나누어 첫 째 자리를 없앤다.
		}
		
		return sum; // => 리턴이 되는 수는 '생성자가 있는 수' 이다. = 출력하면 안되는 수
	}
}
