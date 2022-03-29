package study;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 2022 03 29
		
		// 1. 2557. Hello World
		System.out.println("Hello World!");
		
		// 2. 10718 We love kriii
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
		// 3. 10171 고양이
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		// 7. 10998 AxB
		/*
		 * 입력 : scanner
		 * 정수입력 : nextInt()
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
		
		// 8. 1008 A/B
		/*
		 * 형변환
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((double)a/(double)b);
		
		// 9. 10869 사칙연산
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

}
