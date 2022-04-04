package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 07. 11021_A+B - 7
	/*
	 	시간 제한 : 1초
	 	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); 
		StringTokenizer st;
		
		for (int i = 1; i <= T; i++) {			 
			
			st = new StringTokenizer(br.readLine(), " ");
			
			bw.write("Case #"+ i + ": "
					+ (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
