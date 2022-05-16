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
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		int result = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '(') {
				
				stack.push('(');
				continue;
			}
			
			if(input.charAt(i) == ')') {
				
				stack.pop();
				
				if(input.charAt(i - 1) == '(') {
					
					result += stack.size();
				}
				else {
					
					result++;
				}
			}	
		}
		
		bw.write(result + "\n");
		bw.flush();
		br.close();
		br.close();
		
		// [ 풀이 ] https://steady-coding.tistory.com/10
	}
}

