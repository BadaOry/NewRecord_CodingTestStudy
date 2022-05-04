package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine(); // n
		int count = 0; // 소수 갯수 선언
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			
			// 소수면 true, 소수가 아니면 false
			boolean isPrime = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				
				continue;
			}
			
			for(int i = 2; i <= Math.sqrt(num); i++) {
				
				if(num % i == 0) {
					
					isPrime = false;
					break;
				}
			} 
			
			if(isPrime) {
				
				count++;
			}
			
		}

		System.out.println(count);
		
		/* 오리 버전 : 중도 포기
		 * 
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int count = 0;  // 소수의 갯수

		// 소수를 구하는 로직
		// : 소수는 1 과 자기 자신만으로 나누어져야 함
		//   n % 2, 3, 4... = 0 이어서는 안됨
		for(int i = 0; i < n; i++) {
			
			for(int j = 2; j <= array[i]; j++) {
				
				if(array[i] % j != 0) {

					if(array[i] == 1) {
						
						break;
					} 
					else {
						
						System.out.println("소수당첨 : " + j);
						count += 1;
					}
				}
				
			}

		}
		System.out.println(count);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 소수를 구하는 로직을 구현하지 못함
		// [ 참고 ] https://st-lab.tistory.com/80
		//         ▷ 배열 대신 function 사용
		*/
	}

}

