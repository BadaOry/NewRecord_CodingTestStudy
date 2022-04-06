package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] remainder = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			
			remainder[i]= (Integer.parseInt(br.readLine())) % 42;
		}
		
		int comp = remainder[0];
		

		for(int i = 0; i < 10; i++) {

			if(comp != remainder[i]) {
				
				comp = remainder[i];
				count++;
			}
		}
		
		System.out.println(count + 1);
	
		// 도전 횟수 : 3
		// [ cause 1 ] 중복 숫자를 찾는 for 문의 논리 오류
		// [ cause 2 ] 배열을 boolean 이 아닌 int로 사용
		// [ 참고 1 ] https://st-lab.tistory.com/46
	}
}
