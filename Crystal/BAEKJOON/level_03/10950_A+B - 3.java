package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int time = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= time; i++) {
			
			String[] numbers = br.readLine().split(" ");
			int first = Integer.parseInt(numbers[0]);
			int second = Integer.parseInt(numbers[1]);
			
			System.out.println(first + second);
		}
		
	}
		
}
