package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// 2022 04 01
		
		// 1. 2739_구구단
//		Scanner sc = new Scanner(System.in);
//		
//		int i = sc.nextInt();
//		
//		for(int j=1; j <= 9; j++) {
//			
//			System.out.println(i + " * " + j + " = " + (i * j));
//		}
		
		
		// 2. 10950_A + B - 3
//		Scanner sc = new Scanner(System.in);
//		
//		int t = sc.nextInt();
//		
//		for (int i = 0; i < t; i++) {
//			
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println(a+b);
//			
//			if (i == t) {
//				break;
//			}
//		}


		// 3. 8393_합
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int sum = 0;
//		
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
//			System.out.println(sum);
		
		
		// 4. 15552_빠른 A + B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.println(a + b);
		}
		
		// 5. 2741_N 찍기
		// 6. 2742_기찍 N
		// 7. 11021_A + B - 7
		
		
	}
}