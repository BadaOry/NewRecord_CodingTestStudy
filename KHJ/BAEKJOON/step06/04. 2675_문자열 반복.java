package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 04. 2675_문자열 반복
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		문자열 S를 입력받은 후에, 
		각 문자를 R번 반복해 
		새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 [테스트 케이스의 개수 T](1 ≤ T ≤ 1,000)가 주어진다. 
		각 테스트 케이스는 [반복 횟수 R](1 ≤ R ≤ 8), 
		[문자열 S]가 공백으로 구분되어 주어진다.
		
		=> 참고 사이트 :
			1. StringBuilder를 사용하려고 했으나 charAt으로 나누는 과정에서 충돌(String과 StringBuilder는 서로 다름..)이나서
			 	그냥 String문자열로 변형(String.valueOf()) 후 문자열 더하기로 해결
			 	
			 => 출력 초과..? 
			 	= 실수로 확인용 syso문을 안지우고 함..
			  	 + 첫 번쨰 테스트 케이스 후 출력문 초기화 필요 => 그냥 반복문 안에 넣으면 초기화가 필요없다.
				
	 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스의 개수 T
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			// 새 문자열을 저장할 변수 P
			String P = "";
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			// 반복 횟수 R
			int R = Integer.parseInt(st.nextToken());
			
			// 입력받은 문자열 S
			String S = st.nextToken();
//			System.out.println(S.length());
			
			// 입력받은 문자열 S를 charAt으로 나누기 위한 반복문
			for(int j = 0; j < S.length(); j++) {
				
				// 나누어진 문자를 문자열로 재 변형 => 반복 횟수만큼 더하기 위한 반복문
				for(int r = 1; r <= R; r++) {					
					P +=  String.valueOf(S.charAt(j));
				}
			}
			System.out.println(P); // 시간 = 128ms
		}
			
	}

}
