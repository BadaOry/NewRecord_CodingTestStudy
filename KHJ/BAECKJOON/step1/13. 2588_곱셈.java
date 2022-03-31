package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 13. 2588_곱셈
/*
	1. b를 문자열(String)로 입력받고
	2. charAt으로 각각의 문자로 분리한다
	3. 문자(char)는 아스키 코드로 이루어져 있으므로 문자 '0'을 빼면(" '문자' - '0' ") 숫자로 출력하게 된다.
	
	★ Integer.parseInt() : 문자열(String)을 숫자(Int)로 바꿔주는 메소드
 */

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a * (b.charAt(2) - '0'));
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(b));
	}
}
