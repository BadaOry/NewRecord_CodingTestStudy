package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2022 03 31
		// 1. 1330_두 수 비교하기
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
        int B = sc.nextInt();
        
		if(A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
		
		
		// 2. 9498_시험 성적
		Scanner sc = new Scanner(System.in);
		
		int result = sc.nextInt();
		
		if(90 <= result && result <= 100) {
			System.out.println("A");
		} else if(80 <= result && result <= 89) {
			System.out.println("B");
		} else if(70 <= result && result <= 79) {
			System.out.println("C");
		} else if(60 <= result && result <= 69) {
			System.out.println("D");
		} else if(0 <= result && result <= 59) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
			sc.close();
		}
		
		
		// 3. 2753_윤년
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
		// 4. 14681_사분면 고르기
		// 백준에서는 
//		System.out.println("x의 값을 입력하세요");
//		int x = sc.nextInt();
//		
//		System.out.println("y의 값을 입력하세요");
//		int y = sc.nextInt();
		// 위 부분 때문에 자꾸 틀렸다고 잡혔다.

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		if(0 < x && 0 < y) {
			System.out.println("1");
		} else if(0 > x && 0 < y) {
			System.out.println("2");
		} else if(0 > x && 0 > y) {
			System.out.println("3");
		} else if(0 < x && 0 > y) {
			System.out.println("4");
		}
		
//		if(x != 0 && y != 0) {
//			if(0 < x && x <= 1000 && 0 < y && y <= 1000) {
//				System.out.println("1");
//			} else if (0 > x && x >= -1000 && 0 < y && y <= 1000) {
//				System.out.println("2");
//			} else if (0 > x && x >= -1000 && 0 > y && y >= -1000) {
//				System.out.println("3");
//			} else if (0 < x && x <= 1000 && 0 > y && y >= -1000) {
//				System.out.println("4");
//			}
//		} else {
//			System.out.println("0이 아닌 -1000 ~ 1000 사이의 수를 입력하세요.");
//		}
		
		
		// 5. 2884_알람 시계 (어렵...ㅠ)
//		Scanner sc = new Scanner(System.in);
//		
//		int hh = sc.nextInt();
//		int mm = sc.nextInt();
//		
////		if (00 <= hh && hh <= 23) {
////			if(hh > 23) {
////				hh = 00;
////		}
//		
//		if((mm - 45) > 00) {
//			
//			if(mm > 59) {
//				hh++;
//				mm = 0;
//				System.out.println(hh + " " + mm);
//			}
//		} else {
//			System.out.println(mm - 45);
//		}
		
		
		// 6. 2525_오븐 시계
		// 7. 2480_주사위 세개
		
		
	}

}
