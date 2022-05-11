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
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char now = str.charAt(i);
			
			switch (now) {
			
				case '+':
				case '-':
				case '*':
				case '/':
					while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
						
						sb.append(stack.pop());
					}
					stack.add(now);
					break;
					
				case '(':
					stack.add(now);
					break;
					
				case ')':
					while(!stack.isEmpty() && stack.peek() != '(') {
						
						sb.append(stack.pop());
					}
					stack.pop();
					break;
					
				default:
					sb.append(now);	
			}
	
		}
		
		while(!stack.isEmpty()) {
			
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
		// [ 풀이 ] https://velog.io/@yanghl98/%EB%B0%B1%EC%A4%80-1918-%ED%9B%84%EC%9C%84-%ED%91%9C%EA%B8%B0%EC%8B%9D-JAVA%EC%9E%90%EB%B0%94
	}

	
	public static int priority(char operator) {
		
		if(operator == '(' || operator == ')') {
			
			return 0;
		} 
		else if(operator == '+' || operator == '-') {
			return 1;
		}
		else if(operator == '*' || operator == '/') {
			return 2;
		}
		
		return -1;
	}
}

