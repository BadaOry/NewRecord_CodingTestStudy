package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int rage = 0; // m 번째 겹
		
		// [ 규칙 찾기 ]
		// n번째 겹의 분수 갯수 : n
		// ex1. 2/2 는 5번째고, 1+ 2+ 3       보다 작으니 3번째 겹에 있고 거기엔 3/1, 2/2, 1/3 이 차례로 잇음
		// ex2. 3/2 는 9번째고, 1+ 2+ 3+ 4    보다 작으니 4번째 겹에 있고 거기엔 1/4, 2/3, 3/2, 4/1 이 차례로 잇음
		// ex3. 1/5 는15번째고, 1+ 2+ 3+ 4+ 5 보다 작으니 5번째 겹에 있고 거기엔 5/1, 4/2, 3/3, 2/4, 1/5 이 차례로 있음
		// ex0. x/y 는 n번째고, 1+ 2+ ... + m 보다 작으니 m번째 겹에 있고 거기엔 
		//      m이 홀수면 m/1, m-1/2, ..., 1/m 까지 있고
		//         짝수면 1/m, 2/m-1, ..., m/1 까지 있음
		
		for(int i = 1; i <= 10000000; i++) {
			
			sum += i;
			if(n <= sum) {
				
				rage = i;
				break;
			}
		}
		
		
		int[] numerator = new int[rage];    // 분자
		int[] denominator = new int[rage];  // 분모
		
		if(rage % 2 == 0) {
			
			for(int i = 0; i < numerator.length; i++) {
				
				numerator[i] = i + 1;
				denominator[i] = rage;
				
				rage -= 1;
 			}
		}
		else {
			
			for(int i = 0; i < numerator.length; i++) {
				
				numerator[i] = rage;
				denominator[i] = i +1;
				
				rage -= 1;
 			} 			
		}
		
		System.out.println(numerator[n + numerator.length - sum -1] + "/" + denominator[n + numerator.length - sum -1]);
		
		// 짝수번째 겹에서 7을 넣으면 0, 8을 넣으면 1, 9를 넣으면 2, 10을 넣으면 3이 나와야 함
		// 홀수번째 겹에서 11을 넣으면 0, 12 를 넣으면 2... 15를 넣으면 4가 나와야 함
		// n 과 sum 과 rage 로 풀수는 없을까?
		// n = 8, sum = 10, rage = 4 를 조합해서 1 를 만든다
		// > n + rage - sum - 1 = 2
		// n = 11, sum = 15, rage = 5 > 0
		
		// 이게 돌아가네.. 클린코드 버전은 아래로
		// [ 참고 ] https://st-lab.tistory.com/74

	}
	
	

}

