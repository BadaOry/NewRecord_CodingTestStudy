package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int n = s.length();
		Stack<Character> stack = new Stack<>();
		
		int now = 0;
		
		while(true) {
			
			if(s.charAt(now) == '<') {
				
				while(!stack.isEmpty()) {
					
					sb.append(stack.pop());
				}
				
				while(true) {
					
					sb.append(s.charAt(now));
					now++;
					if(s.charAt(now) == '>') {
						
						sb.append(s.charAt(now));
						now++;
						break;
					}
				}
			}
			
			else if (s.charAt(now) == ' ') {
				
				while(!stack.isEmpty()) {
					
					sb.append(stack.pop());
				}
				
				sb.append(' ');
				now++;
			}
			else {
				
				stack.add(s.charAt(now));
				now++;
			}
			
			if(now == n) {
				
				while(!stack.isEmpty()) {
					
					sb.append(stack.pop());
				}
				
				break;
			}
			
		}
		
		System.out.println(sb);

		// [ 풀이 1 ] https://jainn.tistory.com/247?category=939429
		// [ 풀이 2 ] https://velog.io/@newtownboy/JAVA17413%EB%B2%88-%EB%8B%A8%EC%96%B4-%EB%92%A4%EC%A7%91%EA%B8%B0-2
		// [ 참고 1 ] Stack 구조 : https://st-lab.tistory.com/173
		// [ 참고 2 ] Stack 구현하기 : https://st-lab.tistory.com/174
	}
}

