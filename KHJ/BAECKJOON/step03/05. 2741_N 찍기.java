package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 05. 2741_N 찍기
	/*
	 	자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); 
		
		for (int i = 1; i <= N; i++) {			 
					
			bw.write(i + "\n");
			
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
