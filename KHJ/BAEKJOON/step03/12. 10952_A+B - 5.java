package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 12. 10952_A+B - 5
	/*
	 	시간 제한 : 1초
	 	두 정수 A와 B를 입력받은 다음, A+B를 출력
	 	각 테스트 케이스는 한 줄로 이루어짐
	 	제한 : 1. 0 < A, B < 10
	 		  2. 입력 마지막에는 0 두개가 들어온다.
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			
			String[] strs = br.readLine().split(" ");
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			
			if(A > 0 && B < 10) {
				
			// 출력 방법 1. syso	
//				System.out.println(A+B);
				
			// 방법 2. bw를 이용하여 출력하고 싶을 때(사실상 syso와 같다.)
				bw.write(String.valueOf(A+B));
				bw.newLine();
				bw.flush();
			} else {
				break;
			}
		}
		
		br.close();
		
//		bw.flush();
		bw.close();
		
	}
}
