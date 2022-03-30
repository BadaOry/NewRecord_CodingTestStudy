package com.kh.baekjoon.step1;

import java.util.Scanner;

public class step1 {
	
	public void method1() {
		System.out.println("Hello World!");
	}
	
	public void method2() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	
	public void method3() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	public void method4() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A + B);
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A - B);
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(A * B);
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println((double)A / B);		
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		String id = sc.nextLine();
		
		System.out.println(id + "??!");
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		System.out.println(year - (2541 - 1998));
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
	
	public void method13() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int first = B % 10;
		int second = (B % 100) / 10;
		int third = (B % 1000) / 100;
		
		System.out.println(A * first);
		System.out.println(A * second);
		System.out.println(A * third);
		System.out.println((A * first) + (A * second) * 10 + (A * third) * 100);
	}
	
}
