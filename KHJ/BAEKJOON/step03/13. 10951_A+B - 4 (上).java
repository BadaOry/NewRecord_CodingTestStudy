package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 13. 10951_A+B - 4
	/*
	 	시간 제한 : 1초
	 	두 정수 A와 B를 입력받은 다음, A+B를 출력
	 	제한 조건 : 0 < A, B < 10
	 	
	 	★ 이 문제에서 가장 중요한 점은 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것이다.
	 	  종료 조건이 없는 반복문일 경우 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때(EOF : End Of File) 반복문을 종료된다.
	 	  BufferedReader의 경우 EOF일 때 null값을 반환하여 NullPointer 런타임 에러가 발생할 수 있다.
	 	  따라서 null일 경우가 아닐 떄만 반복문이 기능하도록 조건을 걸어주어야 한다.
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		StringTokenizer st;		
		String str;	 // 반복문의 EOF오류(NullPointer 런타임 에러)를 해결하기 위한 변수
		
		while( (str=br.readLine()) != null) {
			
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			// 반복문 멈추기 위한 테스트용 조건문
			if(A > 0 && B < 10) {				
				sb.append(A+B + "\n");
			} else {
				break;
			}			
			
//			sb.append(A+B + "\n");
			
		}
		
		System.out.println(sb);
		
		
	}
}
