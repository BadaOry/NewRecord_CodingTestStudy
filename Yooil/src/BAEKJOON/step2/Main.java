package BAEKJOON.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		// 1. 두 수 비교하기
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		if (a > b) {
//			System.out.println(">");
//		} else if (a < b) {
//			System.out.println("<");
//		} else {
//			System.out.println("==");
//		}
		
		
		// 2. 시험 성적
//		Scanner sc = new Scanner(System.in);
//		int a;
//		
//		a = sc.nextInt();
//		
//		if (100 >= a && a >= 90) {
//			System.out.println("A");
//		} else if (89 >= a && a >= 80) {
//			System.out.println("B");
//		} else if (79 >= a && a >= 70) {
//			System.out.println("C");
//		} else if (69 >= a && a >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		// 3. 윤년
//		Scanner sc = new Scanner(System.in);
//		int a;
//		
//		a = sc.nextInt();
//		
//		if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
		
//		4. 사분면 고르기
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		if (a > 0 && b > 0) {
//			System.out.println("1");
//		} else if (a < 0 && b > 0) {
//			System.out.println("2");
//		} else if (a < 0 && b < 0) {
//			System.out.println("3");
//		} else if (a > 0 && b < 0) {
//			System.out.println("4");
//		}
		
//		// 5. 알람 시계
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		 
//		if (b >= 45) {
//			System.out.println(a + " " + (b-45));
//		} else if (b < 45 && a != 0) {
//			System.out.println((a-1) + " " + (15+b));
//		} else if (b < 45 && a == 0) {
//			System.out.println(23 + " " + (15+b));
//		}
		
//		// 6. 오븐 시계
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int A = 0;
//		int B = 0;
//		int C = 0;
//		
//		try {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			
//			A = Integer.parseInt(st.nextToken());
//			B = Integer.parseInt(st.nextToken());
//			C = Integer.parseInt(br.readLine());
//			
//			A = A + C / 60;
//			B = B + C % 60;
//			
//			if(B >= 60) {
//				A = A + B / 60;
//				B = B % 60;
//			}
//			
//			if(A >= 24) {
//				A -= 24;
//			}
//			
//			System.out.println(A + " " + B);
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 7. 주사위 세개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 0;
		int B = 0;
		int C = 0;
		int max = 0;
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			
			if(A == B && B == C) {
				System.out.println(10000 + A * 1000);
			} else if(A != B && B != C && A != C) {
				if(A > B && A > C) {
					max = A;
				} else if(B > A && B > C) {
					max = B;
				} else {
					max = C;
				}
				
				System.out.println(max*100);
			} else if((A == B && B != C) || (A == C && A != B) || (B == C && A != B)) {
				if(A == B || A == C) {
					System.out.println(1000 + A * 100);
				} else if(B == C) {
					System.out.println(1000 + B * 100);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
