package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] array = br.readLine().split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);

		if(a == b && b== c && a == c) {
			
			System.out.println(10000 + a*1000);
		} else if (a == b || a == c || b == c){
			
			if(a == b || a == c) {
				
				System.out.println(1000 + a * 100);
			} else {
				
				System.out.println(1000 + b * 100);
			}
			
		} else {
			
			if(a > b && a > c) {
				
				System.out.println(a * 100);
			} else if(b > a && b > c) {
				
				System.out.println(b * 100);
			} else if(c > b && c > a) {
				
				System.out.println(c * 100);
			}
		}
		
	}
}
