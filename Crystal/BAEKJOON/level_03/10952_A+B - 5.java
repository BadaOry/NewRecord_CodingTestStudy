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
		// 1-1. a 와 b 입력 받기
		// 1-2. 0 0 이 입력되면 for 문 탈출
		// 2. a+b 출력
		
		// 1-1.
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken(" "));
			int b = Integer.parseInt(st.nextToken(" "));
			
			if((0 < a && a < 10) && (0 < b && b < 10)) {
				
				bw.write(a + b + "\n");
				
			  // 1-2.
			} else if (a == 0 && b == 0) {
				
				break;
			}
		}

		br.close();
		
		// 2. 
		bw.flush();
		bw.close();
	}
		
}
