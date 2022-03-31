package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 6. 2525_오븐 시계
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
	/*
		왜 틀리게 나오는지 모르겠음.. 잘 나오는데..?		
		
		int H = C/60; 
		int M = C%60; 

		A = A + H; 
		B = B + M; 
		
		// B+C 분끼리 합쳤을 때 60분이 넘으면
		if(B >= 60) {
			
			A = A + B/60; 
			B = B%60; 
			
			if(A >= 24) {
				A = A - 24;		
			}
		}
		
		System.out.println(A + " " + B);
	 */
	
// =====================================================
		
		//방법 2. A를 분으로 변형 => 계산 => 시간/분으로 다시 변형		
		A = A*60;
		
		int M = A + B + C;
		int H = M/60;
		M = M%60;
		
		if (H >= 24) {
			H = H - 24;
		}
		
		System.out.println(H + " " + M);
		
	}
}
