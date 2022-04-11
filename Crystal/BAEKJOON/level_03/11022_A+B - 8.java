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
	
		
		for(int i = 1; i <= time; i++) {
		
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i + ": " + first + " + " + second + " = " + (first + second) + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
	}
		
}