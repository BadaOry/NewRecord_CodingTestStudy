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
		
		// 1. 입력 받고
		// 2. * & /n
		// 3. ** & /n
		// ~6. ***** & /n
		
		for(int i = 1; i <= time; i++) {
				
			for(int j = 1; j <= i; j++) {
				
				bw.write("*");
			}
			
			bw.write("\n");
		}
		
		br.close();

		bw.flush();
		bw.close();
	}
		
}
