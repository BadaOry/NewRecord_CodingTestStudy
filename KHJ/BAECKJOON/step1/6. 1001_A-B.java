package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 6. 1001_A-B
		// 두 정수 A와 B를 입력받은 다음, A-B를 출력(A>0, B<10)
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>0 && B<10) {
			System.out.println(A-B);
		}
		
	}

}
