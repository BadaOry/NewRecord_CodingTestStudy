package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int n = Integer.parseInt(br.readLine());
		int i = 0; // 반복문 돌리는 횟수
		int comp = n; // 비교할 값 n
		

		do {		
//			// n 의 1의 자리 숫자가 새로운 숫자 t의 10의 자릿수 되는거 구하기
//			t = (n % 10) * 10;
//			// t의 1의 자리 숫자 구하기
//			t = ((n / 10) + (n % 10)) % 10;
			
			// 새로운 숫자 n
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			
			// Count 증가
			
			i++;
			
		} while (comp != n);
		
		System.out.println(i);
				
		// 도전 횟수 : 밤하늘의 퍼얼..만큼..
		// [ 참고 1 ] https://st-lab.tistory.com/42
		// [ 참고 2 ] https://crazykim2.tistory.com/448
	}
}
