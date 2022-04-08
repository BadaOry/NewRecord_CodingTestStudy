package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 04. 15552_빠른 A+B
	/*
	 	A+B 출력(1 <= A, B <= 1000 )
		★시간제한 : 1초★ => Scanner vs BufferedReader
		1. 첫 줄에 테스트케이스의 개수 T 입력
		2. 두 정수 A와 B 입력
	 */
		
// =====================================================		
		
	/*
	  	방법 1. Scanner	=> 시간 초과!!!!
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for (int i = 1; i <= T; i++) {			 
			
			int A = sc.nextInt(); 
			int B = sc.nextInt(); 
			
			// System.out.println()도 사용하면 시간이 초과된다. ★★★★★★
			System.out.println(A+B);
			
		}		
	 */
		
// =====================================================
		
	/*
	 	방법 2. BufferedReader => 시간 884ms
	 	참고 사이트 : https://st-lab.tistory.com/16
	 */
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st;
		
		for (int i = 1; i <= T; i++) {			 
			
		/*
			StringTokenizer : BufferedReader로 입력받은 String값을 구분자를 통하여 여러개의 토큰으로 분리하기 위한 메소드
			 - StringTokenizer(입력받은 문자열, 구분자, [true/false]));
			 - true/false : 구분자도 토큰에 넣을지 선택하는 옵션(dafault : false)
		 */
			// 입력할 때 스페이스바로 공백을 두어 A B 값을 입력해야 정상적으로 작동한다.
			st = new StringTokenizer(br.readLine(), " ");
			
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
			
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
