package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] numbers = new int[2];
		
		for(int i = 0; i < 2; i++) {
			
			numbers[i] = Integer.parseInt(st.nextToken());
		}
	
		int a = numbers[0];
		int b = numbers[1];
		
		int inversea = (((a % 100) % 10) * 100) + ((a / 10) % 10) * 10  + (a / 100);
		int inverseb = (((b % 100) % 10) * 100) + ((b / 10) % 10) * 10 + (b / 100);
		

		if (inversea > inverseb) {
			
			System.out.println(inversea);
		}
		else {
			
			System.out.println(inverseb);
		}
		

	}
	
}

