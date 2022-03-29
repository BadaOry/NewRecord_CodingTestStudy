package com.kh.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1번 문제
//		System.out.println("Hello World!");
//		
//		// 2번 문제
//		System.out.println("강한친구 대한육군");
//		System.out.println("강한친구 대한육군");
//		
//		// 3번 문제
//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");
//
//		// 4번 문제
//        System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");
        
		// 5번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B= sc.nextInt();
//		System.out.println(A+B);
			
		// 6번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		System.out.println(A-B);
		
		// 7번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B= sc.nextInt();
//		System.out.println( A * B );
		
		// 8번 문제
//		Scanner sc = new Scanner(System.in);
//		Double A = sc.nextDouble();
//		Double B= sc.nextDouble();
//		System.out.println( A / B );
		
		// 9번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B= sc.nextInt();
//		System.out.println( A + B );
//		System.out.println( A - B );
//		System.out.println( A * B );
//		System.out.println( A / B );
//		System.out.println( A % B );
		
		// 10번 문제
//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		System.out.println( A + "??!");
		
		// 11번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		System.out.println( A - 543);
		
		// 12번 문제
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		System.out.println((A + B) % C);
//		System.out.println(((A % C) + (B % C))%C);
//		System.out.println((A * B) % C);
//		System.out.println(((A % C) * (B % C))%C);
		
		
		// 13번 문제
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
        String C = String.valueOf(B);
        String[] digits = C.split("(?<=.)");
        
		System.out.println(A * Integer.parseInt(digits[2]));
		System.out.println(A * Integer.parseInt(digits[1]));
		System.out.println(A * Integer.parseInt(digits[0]));
		
		System.out.println(A * B);

	}

}
