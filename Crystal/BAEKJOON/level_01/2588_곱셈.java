package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
        	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int first = Integer.parseInt(br.readLine());		
		
		String[] second = br.readLine().split("");
		
		int d = Integer.parseInt(second[0]);
		int e = Integer.parseInt(second[1]);
		int f = Integer.parseInt(second[2]);
		
		System.out.println(first * f);
		System.out.println(first * e);
		System.out.println(first * d);
		System.out.println(first * (d * 100 + e * 10 + f));
	}

}
