package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 08. 10757_큰 수 A+B(中)_BigInteger 사용
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000.....)
	 	
		=> 참고 사이트 : https://st-lab.tistory.com/199
		
		   엄청 큰 수를 입력하면 NumberFormatException이 발생
		   => 방법 1. 덧셈을 직접구현
		      방법 2. 자바의 BigInteger클래스를 사용(long형이 넘어가는 매우 큰 수에 대해서 사용)
		 
	 */

// ===================================================================================================================		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// BigInteger 사용
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		// BigInteger는 +, -, *, /, += 와 같은 연산자를 지원하지 않기 때문에, 메소드를 이용해야 한다.
		// add : BigInteger값을 더하는 메소드
		A = A.add(B);
		
		System.out.println(A); // 시간 = 256ms
//		System.out.println(A.toString()); // 문자열로 리턴
	}	 

}
