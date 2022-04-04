package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int time = Integer.parseInt(br.readLine());
		
		// [ 설계 ]
		// 1. i = 1 부터 time 횟수 반복해주는 for 
		// 2. 공백 time - i 개와 별 i 개 그려주는 for + \n
		
		for(int i = 1; i <= time; i++) {
			
			for(int j = time - i; j >= 1; j--) {
				
				bw.write(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				
				bw.write("*");
			}
			
			bw.write("\n");
		}

		
		br.close();

		bw.flush();
		bw.close();
	}
		
}
