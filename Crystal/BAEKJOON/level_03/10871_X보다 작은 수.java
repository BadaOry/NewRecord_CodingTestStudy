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
		
		// [ 설계 ]
		// 1. n 과 x 입력 받기
		// 2. 수열 입력 받기 ▷ for 문
		// 3. x 보다 작은 수 출력하기 ▷ for & if 문
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 1.
		int n = Integer.parseInt(st.nextToken(" "));
		int x = Integer.parseInt(st.nextToken(" "));
		
		// 2. 
		st = new StringTokenizer(br.readLine());
		
		int[] array = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			
			int number = Integer.parseInt(st.nextToken(" "));
			
			array[i] = number;
		}
		
		
		// 3.
		for(int i = 0; i < n; i++) {
			
			if(array[i] < x) {
				
				bw.write(array[i] + " ");
			}
			
		}
		
		
		br.close();

		bw.flush();
		bw.close();
	}
		
}
