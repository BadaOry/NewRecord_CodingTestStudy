package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= N; i++) {
//			for(int k = N - 1; k >= 0;) {
//				k--;
//				bw.write(" ");
//			}
//			for(int j = 1; j <= i; j++) {
//				bw.write("*");
//			}
//			bw.write("\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 10. 2439_별찍기 - 2
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= N - i; j++) {
//				bw.write(" ");
//			}
//			for(int k = 1; k <= i; k++) {
//				bw.write("*");
//			}
//			bw.write("\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 11. 10871_X보다 작은 수
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		String[] str = br.readLine().split(" ");
//		
//		int N = Integer.parseInt(str[0]);
//		int X = Integer.parseInt(str[1]);
//		
//		String[] str2 = br.readLine().split(" ");
//		
//		for(int i = 0; i < N; i++) {
//			int A = Integer.parseInt(str2[i]);
//			if (A < X) {
//				bw.write(A + " ");				
//			}
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 12. 10952_A + B - 5
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		for (int i = 0; i >= 0; i++) {
//			String[] str = br.readLine().split(" ");
//			
//			int A = Integer.parseInt(str[0]);
//			int B = Integer.parseInt(str[1]);
//			
//			if (A == 0 && B == 0) {
//				break;
//			}
//			
//			bw.write((A+B) + "\n");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 13. 10951_A + B - 4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		String input = "";
//		
//		// input.length() != 0 -> 에러 잡기 쉽지 않았다.
//		while((input = br.readLine()) != null && input.length() !=0) {
//			st = new StringTokenizer(input);
//			
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			bw.write((A+B) + "\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		
		// 14. 1110_더하기 사이클
		// ing
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	}
}
