package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 03. 2577_숫자의 개수 (上)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
	 	세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
	 	0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하기
	 		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. 
	 		A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수
	 		
	 	=> 매우 어려움.. 이해는 가지만 혼자 생각하기 어려울듯..
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int result = A*B*C;
		
		// int형 result를 String.valueOf()메소드를 사용해 String으로 형변환
		String str = String.valueOf(result);
		
		// 확인용
//		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			// arr[str 문자열의 i 자릿수의 int형 값] 으로
			// 각각의 숫자가 몇번 쓰였는지 값 주입
			arr[(str.charAt(i) - '0')]++;
		}
		
		for(int v : arr) {
			System.out.println(v);
		}
		
	}
}
