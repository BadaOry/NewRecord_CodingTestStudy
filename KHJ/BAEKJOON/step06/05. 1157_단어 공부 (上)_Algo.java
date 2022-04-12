package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 05. 1157_단어 공부 (上)_Algo
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
		첫째 줄에 알파벳 대소문자로 된 단어가 주어지면, 
		이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
		(단, 대문자와 소문자를 구분하지 않는다.)
		
		첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
		단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		
		=> 참고 사이트 : https://st-lab.tistory.com/64
		
			1. 가장 많이 사용하는 단어를 카운팅하는 법이 생각이 안남.. 
				=> 알고리즘이 필요(완전 어려움..)
				
			2. (char)문자의 10진수 값을 알고있어야 한다.
			
			3. 배열을 사용하여 카운팅해야 한다.
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 영문자의 개수는 26개이므로 빈도수를 나타내기 위한 배열 26크기를 가진 배열 생성
	// ex) arr[0] = a, A의 개수 카운팅
	int[] arr = new int[26]; 
	
	// 입력받은 문자열 값 s(입력받은 문자열을 전부 대문자로 변환)
	String s = br.readLine().toUpperCase();
	
	// 알파벳의 십진수 값을 알거나 해당 문자를 빼주어 
	// 알파벳값을 인덱스에 순서대로 int형 배열에 주입한다.
	for(int i = 0; i < s.length(); i++) {
		
		if('A' <= s.charAt(i) && s.charAt(i) <= 'z') { // 대문자 범위
			// 'A'를 빼 주어 A가 인덱스 0자리에 들어가도록 맞춤 
			arr[s.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가
		}
		
	}
	
//	System.out.println(Arrays.toString(arr));
	
// ------------ 가장 많이 사용된 알파벳이 무엇인지 출력하는 코드 --------------------
	
	// 가장 많이 사용된 알파벳 최댓값을 저장할 변수
	int max = -1; // 예외가 발생하지 않는 안전한 수 -1로 초기화
	// 출력할 문자 변수
	char ch = '?'; 
	
	for(int i = 0; i < 26; i++) {
		
		if(arr[i] > max) {
			max = arr[i];
			ch = (char)(i + 'A');
			
		} else if (arr[i] == max) {
			
			ch = '?';
			
		}
// ------------------------------------------------------------------------
		
	}
	
	System.out.println(ch); // 시간 = 288ms
		
// ===================================================================================================================	
		
	}

}
