package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // n개 정수 입력

		String[] arrayn = (br.readLine()).split(" "); // 배열에 들어가는 수 입력
		int[] array = new int[n]; // 배열 선언
		
		// 배열에 정수 입력
		for(int i = 0; i < n; i++) {
			
			array[i] = Integer.parseInt(arrayn[i]);	
 		}
		
		Arrays.sort(array); // 배열 정렬
		
		System.out.println(array[0] + " " + array[n-1]);
		
		// 도전 횟수 : 2
		// [ cause 1 ] NumberFormatException : 배열을 입력하는 부분의 오류
		// [ 참고 1 ] https://coding-factory.tistory.com/254
	}
}
