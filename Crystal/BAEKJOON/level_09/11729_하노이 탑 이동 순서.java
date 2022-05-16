package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); 	// 첫 번째 원판의 갯수

		bw.write((int) (Math.pow(2, n) - 1) + "\n");
		
		Hanoi(n, 1, 2, 3);
		
		bw.flush();
		bw.close();
			
			// [ 참고 ] https://st-lab.tistory.com/96
		}
		
		
	public static void Hanoi(int n, int start, int mid, int to) throws IOException {
			
		// 이동할 원반의 수가 1개인 경우
		if(n == 1) {
			
			bw.write(start + " " + to + "\n");
			return;
		}
		
		Hanoi(n-1, start, to, mid);
		
		bw.write(start + " " + to + "\n");
		
		Hanoi(n - 1, mid, start, to);
	}

}

