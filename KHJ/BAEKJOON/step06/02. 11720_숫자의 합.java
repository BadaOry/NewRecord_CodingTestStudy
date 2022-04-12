package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 02. 11720_숫자의 합
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		N개의 숫자가 공백 없이 쓰여있다. 
		첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
		둘째 줄에 숫자 N개가 공백없이 주어진다.
		
		이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.		
		
		=> 참고 사이트 : 
		
	 */

// ===================================================================================================================	
		
//	1. BufferedReader 방법	
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 숫자의 개수 N 
	int N = Integer.parseInt(br.readLine());
	// 한줄로 입력값을 받기 위한 변수 s
	String s = br.readLine();	
	// 입력값의 합을 구하기 위한 변수 result
	int result = 0;
	
	for(int i = 0; i < N; i++) {
		
		// String으로 받은 여러개의 입력값을 charAt으로 나눈 후 int형으로 변환하기 위해 - '0' 해준다(아스키코드값 빼기)
		int a = s.charAt(i) - '0';

		result += a;		
	}
	
	System.out.println(result);	// 시간 = 124ms

		
// ===================================================================================================================	
		
	}

}
