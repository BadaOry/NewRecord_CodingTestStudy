package com.kh.baekjoon.step4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class step4 {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A == B) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(100 >= score && score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else {
			if(H > 0) {
				System.out.println((H - 1) + " " + (M + 15));
			} else {
				H = 23;
					
				System.out.println(H + " " + (M + 15));
			}
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int H = C / 60;
		int M = C % 60;
		
		if((B + M) >= 60) {
			// (ex. 40분 시작, 20분 조리 = 1시간 0분)
			if((A + H + 1) > 23) {
				// 시간 = A + H + 1 - 24 (ex. 23시 40분 시작, 3시간 20분 조리 = 3)
				System.out.println((A + H + 1 - 24) + " " + (B + M - 60));
			} else {
				// 시간 = A + H + 1
				System.out.println((A + H + 1) + " " + (B + M - 60));
			}
		} else {
			if((A + H) > 23) {
				// 시간 = A + H - 24
				System.out.println((A + H - 24) + " " + (B + M));
			} else {
				System.out.println((A + H) + " " + (B + M));
			}
		}
		
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A == B && B == C) {
			System.out.println(10000 + A * 1000);
		} else if(A == B || A == C) {
			System.out.println(1000 + A * 100);
		} else if(B == C) {
			System.out.println(1000 + B * 100);
		} else {
			ArrayList<Integer> list = new ArrayList<>();
			
			list.add(A);
			list.add(B);
			list.add(C);
			
			list.sort(Comparator.reverseOrder());
			
			System.out.println(list.get(0) * 100);
		}
		
		
	}
	
}
