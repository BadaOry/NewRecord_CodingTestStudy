package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 4. 14681_사분면 고르기
/*
	점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
	단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
 */
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");			
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else if(x < 0 && y < 0) {
			System.out.println("3");
		} else if(x > 0 && y < 0) {
			System.out.println("4");
		}
		
	}
}
