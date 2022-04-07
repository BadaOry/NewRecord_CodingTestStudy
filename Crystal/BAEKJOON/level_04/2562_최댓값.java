package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[9]; // 배열 선언
		
		// 배열에 정수 입력
		for(int i = 0; i < 9; i++) {
			
			array[i] = Integer.parseInt(br.readLine());	
		}
		
		int index = 0; // 배열 인덱스 선언
		int max = 0;
		
		// 최대값 찾기
		for(int i = 0; i < 9; i++) {
			
			if(max < array[i]) {
				
				max = array[i];
				index = i + 1;
			}

		}
		
		System.out.println(max);
		System.out.println(index);
		
		
		
		// 도전 횟수 : 3
		// [ cause 1 ] NumberFormatException : 배열을 입력하는 부분의 오류
		// [ cause 2 ] 배열을 입력하는 방법의 오류
		// [ 참고 1 ] https://st-lab.tistory.com/44
		// [ 참고 2 ] https://coding-factory.tistory.com/254
	}
}
