package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		// 2022 04 04
		
		// 8. 11022_A + B - 8
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int T = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= T; i++) {
//			String[] str = br.readLine().split(" ");
//			
//			int A = Integer.parseInt(str[0]);
//			int B = Integer.parseInt(str[1]);
//			
//			bw.write("Case #" + i +": " + A + " + " + B + " = " + (A + B) + "\n");
//			if(i == T) {
//				break;
//			}
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 9. 2438_별찍기 - 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			for(int k = N -1; k < N; k--) {
				bw.write(" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		// 10. 2439_별찍기 - 2
		// 11. 10871_X보다 작은 수
		// 12. 10952_A + B - 5
		// 13. 10951_A + B - 4
		// 14. 1110_더하기 사이클
	}
}
