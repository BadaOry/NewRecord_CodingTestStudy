package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			
			while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
				
				seq[stack.pop()] = seq[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			
			seq[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			
			sb.append(seq[i]).append(' ');
		}
		
		System.out.println(sb);
		
		/* 시도 (중도 포기)
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			
			array[i] = a;
		}
		
		
		int compare = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(array[i] <= array[i + 1]) {
				
				compare = array[i + 1];
			}
		}
		*/
		
		// [ 풀이 ] https://st-lab.tistory.com/196 방법 3
	}

	
}

