package study;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 20220330
		
		// 4. 10172_개
		// println와 printf를 활용해 문제 풀이 : %n(줄바꿈)과 몬자열 결합기호 활용
		System.out.printf("|\\_/| %n" + 
						  "|q p|   /} %n" + 
						  "( 0 )\"\"\"\\ %n" +
						  "|\"^\"`    | %n" +
						  "||_/=\\\\__|");
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
		// 5. 1000_A+B
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > 0 && B < 10) {
			System.out.println(A+B);
		} else {
			System.out.println("첫 번째 수는 0 초과, 두 번째 수는 10 미만의 정수를 입력해 주세요.");
		}
		
		
		// 6. 1001_A-B
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > 0 && B < 10) {
			System.out.println(A-B);
		} else {
			System.out.println("첫 번째 수는 0 초과, 두 번째 수는 10 미만의 정수를 입력해 주세요.");
		}
		
		
		// 10. 10926_??!
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine()+"??!");
		
		
		// 11. 18108_1998년생인 내가 태국에서는 2541년생?!
		Scanner sc = new Scanner(System.in);
		
		// 태국 불기 : 해당 년도 + 543
		int y = 543;
		int year = sc.nextInt();
		
		System.out.println(year - y);
		
		
		// 12. 10430_나머지
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
		// 13. 2588_곱셈
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A * (B%10));
		System.out.println(A * (B%100/10));
		System.out.println(A * (B/100));
		System.out.println(A * B);
	}

}
