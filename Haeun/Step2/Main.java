package study;

import java.util.Scanner;

public class BaekjoonStudy_220331 {
	
	public static void main(String[] args) {
		// 2022 03 31
		// 1. 1330_두 수 비교하기
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//        int B = sc.nextInt();
//        
//		if(A > B) {
//			System.out.println(">");
//		} else if (A < B) {
//			System.out.println("<");
//		} else if (A == B) {
//			System.out.println("==");
//		}
		
		
		// 2. 9498_시험 성적
//		Scanner sc = new Scanner(System.in);
//		
//		int result = sc.nextInt();
//		
//		if(90 <= result && result <= 100) {
//			System.out.println("A");
//		} else if(80 <= result && result <= 89) {
//			System.out.println("B");
//		} else if(70 <= result && result <= 79) {
//			System.out.println("C");
//		} else if(60 <= result && result <= 69) {
//			System.out.println("D");
//		} else if(0 <= result && result <= 59) {
//			System.out.println("F");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//			
//			sc.close();
//		}
		
		
		// 3. 2753_윤년
//		Scanner sc = new Scanner(System.in);
//		
//		int year = sc.nextInt();
//		
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
		
		
		// 4. 14681_사분면 고르기
		// 백준에서는 
//		System.out.println("x의 값을 입력하세요");
//		int x = sc.nextInt();
//		
//		System.out.println("y의 값을 입력하세요");
//		int y = sc.nextInt();
		// 위 부분 때문에 자꾸 틀렸다고 잡혔다.

//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		
//		if(0 < x && 0 < y) {
//			System.out.println("1");
//		} else if(0 > x && 0 < y) {
//			System.out.println("2");
//		} else if(0 > x && 0 > y) {
//			System.out.println("3");
//		} else if(0 < x && 0 > y) {
//			System.out.println("4");
//		}
		
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
//		if(0 <= hh && hh <= 23 && 0 <= mm && mm <= 59) {	// hh,mm 범위 지정
//			if((mm - 45) < 0) {	// 입력한 mm값 - 45분이 음수일 경우
//				hh --;			// hh 감소
//				mm = 60 - (45 - mm);
//				
//				System.out.println(hh + " " + mm);
//				
//			} else if(mm > 60) {	// mm이 60을 넘을 경우
//				hh ++;
//				mm = 60 - mm;	// 60에서 mm을 빼준다.
//				
//				System.out.println(hh + " " + mm);
//				
//			}
//		} else {
//			if (hh < 0) {	// hh의 값이 음수일경우
//				hh = hh + 24;
//			}
//			System.out.println(hh + " " + (mm - 45));
//		}
//		
//		if(mm < 45) { // mm : 45분 이전
//			hh--;
//			mm = 60 - (45 - mm);
//			
//			if(hh < 0) { // hh : 0시라면 45분 전 시간은 23시
//				hh = 23;
//			}
//			System.out.println(hh + " " + mm);
//		} else {
//			System.out.println(hh + " " + (mm - 45));
//		}
		
		
		// 6. 2525_오븐 시계
		// 오답
//		Scanner sc = new Scanner(System.in);
//		int hh, mm, c, d;
//		
//		hh = sc.nextInt();
//		mm = sc.nextInt();
//		c = sc.nextInt();
//		d = mm + c;
//		
//		sc.close();
//		
//		if(d > 60 || d == 60) {
//			hh++;
//			mm = d / 60;
//			
//			if(hh < 0) {
//				hh = 23;
//			System.out.println(hh + " " + mm);
//			
//			}
//		} else {
//			System.out.println(hh + " " + mm);
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int hh, mm, c;
//		
//		hh = sc.nextInt();
//		mm = sc.nextInt();
//		c = sc.nextInt();
//		
//		sc.close();
//		
//		mm += c;
//		if (mm >= 60) {
//			while(mm >= 60) {
//				 mm-=60;
//                 hh++;
//                 if(hh>=24) {
//                     hh=0;
//                 }
//             }
//         }
//		System.out.println(hh + " " + mm);
		// https://blue-boy.tistory.com/117
		// += : mm = mm + c;
		
//		Scanner sc = new Scanner(System.in);
//		int hh, mm;
//		
//		hh = sc.nextInt();
//		mm = sc.nextInt() + sc.nextInt(); 
//		
//		while (mm > 59) {
//			hh++; 
//			mm -= 60;
//			} 
//		while (hh > 23) 
//			hh -= 24;
//		System.out.println(hh + " " + mm);
		// https://dalconbox.tistory.com/261

		
		// 7. 2480_주사위 세개
//		Scanner sc = new Scanner(System.in);
//		
//		int a, b, c;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if(a == b && b == c && c == a) { // 다 같은 경우
//			System.out.println(10000 + a * 1000);
//		} else if(a != b && b != c && c != a) {	// 다 다른 경우에서
//			if (a > b && a > c) {		// a가 가장 큰 경우
//				System.out.println(a * 100);
//			} else if(b > c && b > a) {	// b가 가장 큰 경우
//				System.out.println(b * 100);
//			} else if(c > a && c > b) {	// c가 가장 큰 경우
//				System.out.println(c * 100);
//			}
//		} else {
//			if (a == b && b != c && a != c) {	// a와 b는 같지만 c는 같지 않을 때
//				System.out.println(1000 + a * 100);
//			} else if(a == c && b != c && a != b) {	// a와 c가 같고 b는 같지 않을 때
//				System.out.println(1000 + c * 100);
//			} else if(b == c && a != b && a != c) {	// b와 c가 같고 a는 같지 않을 때
//				System.out.println(1000 + b * 100);
//			}
//		}
	}
}
