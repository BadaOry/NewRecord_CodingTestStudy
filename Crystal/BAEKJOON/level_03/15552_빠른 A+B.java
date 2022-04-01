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
		
		StringTokenizer st;
		
		for(int i = 1; i <= time; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
		
		// 도전 횟수 : 2
		// [ cause 1 ] 시간 초과 : StringTokenizer 대신 split 과 추가 변수 2개 사용
		// [ 참고 1 ] https://st-lab.tistory.com/30
	}
		
}
