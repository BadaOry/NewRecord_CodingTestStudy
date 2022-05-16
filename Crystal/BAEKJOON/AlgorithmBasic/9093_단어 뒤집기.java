package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		while(n-- > 0) {
			
			Stack<Character> stack = new Stack<>();
			
			String str = br.readLine() + "\n";
			
			for(char ch : str.toCharArray()) {
				
				if(ch == ' ' || ch == '\n') {
					
					while(!stack.isEmpty()) {
						
						bw.write(stack.pop());
					}
					
					bw.write(ch);
				}
				else {
					
					stack.push(ch);
				}
			}
		}

		bw.flush();
		
		// [ 풀이 1 ] Stack 사용     ▶ https://dev-coco.tistory.com/157
		// [ 풀이 2 ] Stack 사용 안함 ▶https://programmer-ririhan.tistory.com/280
		
		// [ cause 1 ] Stack 구조까지는 생각했으나 
	}

	
}

