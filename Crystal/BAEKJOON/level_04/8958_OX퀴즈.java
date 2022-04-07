package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(); 
		int test_case = Integer.parseInt(br.readLine()); 
		
		String array[] = new String[test_case];

		for(int i = 0; i < test_case; i++) {
			
			array[i] = br.readLine();
		}
		
		for(int i = 0; i < test_case; i++) {
			
			int count = 0; 
			int sum = 0; 
			
			for(int j = 0; j < array[i].length(); j++) {
				
				if (array[i].charAt(j)  == 'O' ) {
					
					count++;
				} else {
					
					count = 0;
				}
				
				sum += count;
			}
			
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);

	}
}

