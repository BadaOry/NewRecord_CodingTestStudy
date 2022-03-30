package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1. 2557_Hello World
		System.out.println("Hello World!");
		System.out.println();
		
		// 2. 10718_We love kriii
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		System.out.println();
		
		// 3. 10171_고양이
	/*
	 	역슬래쉬(\) 를 출력하기 위해선 " " 안에 \\로 작성해야 한다.
		<escape 문자(특수문자) 출력>
		역슬래쉬(\) : \\ , 작은 따옴표(') : \',  큰 따옴표(") : \", 유니코드 : \+u(에러나서 + 추가함)	 	
	*/
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		System.out.println();
		
		// 7. 10998_AxB
	/*
	 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > 0 && B < 10) {			
			System.out.println(A*B);
		}
		
		System.out.println();
	 */
		
		// 8. 1008_A/B
	/*
		소수점자리까지 표현해주기 위해 int로 입력받은 값을 double로 형변환 시켜 출력
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > 0 && B < 10) {			
			System.out.println((double)A/(double)B);
		}
		
		System.out.println();
	 */
		
		// 9. 10869_사칙연산 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A >= 1 && B <= 10000) {			
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		}
		
		
	}

}
