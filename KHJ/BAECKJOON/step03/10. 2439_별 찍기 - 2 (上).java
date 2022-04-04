package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 09. 2439_별 찍기 - 2
	/*
	 	시간 제한 : 1초
	 	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개 출력
	 	하지만, 오른쪽을 기준으로 정렬한 별을 출력
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); 
		 
		for (int i = 1; i <= N; i++) {			 
			
			// 오른쪽 정렬하기 위해 공백을 추가
			for(int j = 1; j <= N - i; j++) {
				bw.write(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine(); // 줄 넘김			
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
