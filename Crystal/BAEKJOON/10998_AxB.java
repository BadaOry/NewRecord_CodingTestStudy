package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
        int A = 0;
        int B = 0;
    
        Scanner sc = new Scanner(System.in);  
        
        A = sc.nextInt();
          
        B = sc.nextInt();
        
        if((0 < A && A < 10) && (0 < B && B < 10)) {
        	System.out.println(A * B);
        } else {
        	System.out.println("다시 입력하세요.");
        }
        
        
        // 도전 횟수 : 5
        // [ cause 1 ] nextInt 가 아니라 nextLine().charAt(0) 사용
        // [ cause 2 ] 컴파일 에러 : Scanner 를 import 못함 
        //						  ▷ import java.util.Scanner; 추가
        // [ cause 3 ] 문제를 잘못읽어서 if 조건식이 틀림 (A,B 모두 0 과 10 사이)
        // [ cause 4 ] 컴파일 에러 : 조건식을 0 < A < 10 따위로 씀...
        
	}

}
