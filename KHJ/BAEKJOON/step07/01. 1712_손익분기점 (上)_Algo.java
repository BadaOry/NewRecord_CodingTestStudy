package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 01. 1712_손익분기점 (上)_Algo
	/*
	 	시간 제한 : 0.35초 / 메모리 제한 : 128MB
	 	
	 	노트북 판매 대수에 상관없이 
	 	매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 
	 	한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
	 	
	 	노트북 가격이 C만원으로 책정되었을 때
	 	총 판매비용이 총 비용(고정비용+가변비용)보다 많아지게 되는 지점을 손익분기점이라 할 때
	 	
	 	A, B, C가 주어지고 손익분기점을 구하는 프로그램을 작성하시오
	 	(첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다.)
	 	(손익분기점이 존재하지 않으면 -1을 출력한다.)
	 	
		=> 참고 사이트	 : https://st-lab.tistory.com/71
		
				손익분기점 공식을 잘못세움...
				반복문을 사용해야 할것이라고 생각했는데 아니었음.. 
				수학적 공식 세우기 + 생각 필요.. ㅜㅜ

	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
	// 고정비용 A
	int A = Integer.parseInt(st.nextToken());
	// 가변비용 B
	int B = Integer.parseInt(st.nextToken());
	// 노트북 가격 C
	int C = Integer.parseInt(st.nextToken());
	
	/*
		1. 손익분기점 : 
			노트북 판매량(C*n) > 고정비용(A) + 가변비용(B)*판매량(n)
		   => n = 고정비용(A) / 노트북가격(C)-가변비용(B)
		   
		★ 하지만 저 n 은 총 비용과 총 수익이 같아지는 지점일 뿐, 
		  이익이 나는 지점이 아니다.
		  
		2. 이익이 발생하는 판매량(n)
			(고정비용(A) / 노트북가격(C)-가변비용(B)) + 1
			
		3. 이익이 발생하지 않으면 -1을 출력한다.
			=> C-B <= 0
			=> C <= B
			
	*/
	
	if( C <= B) {
//		이익이 발생하지 않을 때
		System.out.println(-1);
	} else {
//		이익이 발생할 때 판매량(n)
		System.out.println((A/(C-B))+1); // 시간 = 120ms
	}
	
	
// ===================================================================================================================	
	
	}

}
