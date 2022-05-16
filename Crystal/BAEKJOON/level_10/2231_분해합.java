package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); 
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == n) {
				
				result = i;
				break;
			}
		}
		
		
		System.out.println(result);
		
		/* 오리 버전 
		int n = Integer.parseInt(br.readLine()); 
		int m = 0;	// 생성자
		
		// [ 설계 ]
		// 1. n 을 입력받고
		// 2. n = m + (m / 100) + ((m % 100) / 10) + ((m % 100) % 10) 을
		//    만족하는 m 의 최소값을 찾아야 함
		
		
		for(int i = 1; i <= 1000000; i++) {

			if(n == i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10)) {
				
				m = i;
				break;
			}
		}
		
		if(m == 0) {
			
			
		}
		
		System.out.println(m);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 모르겠는데요..?
		// [ 참고 ] https://st-lab.tistory.com/98
		
		*/
	}
}

