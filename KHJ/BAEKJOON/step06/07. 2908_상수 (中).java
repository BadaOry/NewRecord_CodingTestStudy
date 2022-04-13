package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 07. 2908_상수 (中)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
		(두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.)
		
		상수는 수를 다른 사람과 다르게 거꾸로 읽는다(234 => 432)
		
		두 수가 주어졌을 때, 상수의 대답으로
		두 수 중 큰값을 출력하는 프로그램을 작성하시오.
		
		=> 참고 사이트	 : 1. https://hianna.tistory.com/543 
						- StringBuffer / reverse()
					 : 2. https://st-lab.tistory.com/66
					    - StringBuilder / reverse()
					 : 3. https://ifuwanna.tistory.com/221
					 	- StringBuffer vs StringBuilder
			
			1. StringBuffer의 reverse() 메소드 기억하기!!
			2. StringBuilder의 reverse() 메소드 기억하기!!
	 */

// ===================================================================================================================		
		
	/*
	 	방법 1. 배열 + StringBuffer 사용(내가 푼것)
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String[] arr = br.readLine().split(" ");
	
	// 입력값을 반전 시키기 위한 코드
	for(int i = 0; i < arr.length; i++) {
		
		StringBuffer sb = new StringBuffer(arr[i]);
		
		arr[i] = sb.reverse().toString();
	}
	
	// 반전값을 비교하여 출력시키기 위한 코드 // 시간 = 120ms
	if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
		System.out.println(arr[0]);
	} else {
		System.out.println(arr[1]);		
	}
	 */
		
// ===================================================================================================================	
		
	/*
		방법 2. StringTokernizer + StringBuilder 사용
	*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
//		1. 토큰값을 StringBuilder로 감싸고(StringBuilder로 형변환)
//		2. reverse()로 문자값을 뒤집고
//		3. toString() 다시 문자열로 형변환 후
//		4. int형으로 형변환
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		// 삼항연산자 사용
		System.out.println(a > b ? a:b); // 시간 = 116ms
	
	}

}
