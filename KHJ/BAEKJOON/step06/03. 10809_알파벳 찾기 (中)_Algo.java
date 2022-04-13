package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 03. 10809_알파벳 찾기 (中)_Algo
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		알파벳 소문자로만 이루어진 단어 S가 주어진다. 
		각각의 알파벳에 대해서, 
		단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 단어 S가 주어진다. 
		단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		
		=> 참고 사이트 : https://st-lab.tistory.com/62
		
			1. 입력받은 문자열의 마지막 문자값의 등장위치가 주입되지 않음..
			  - 동일문자일 경우 처음등장 위치만 넣을때 문제 발생하는것 같음
			  
			=> 조건문을 다르게 설정!!
			
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 입력된 단어 S
	String S = br.readLine();
	
	// 영문자의 총 개수 : 26개
	int[] arr = new int[26]; 
	
	//  기본 default값으로 -1 주입(초기화)
	for(int i = 0; i < 26; i++) {
		arr[i] = -1;
	}
	
	// 'a' = 97 
	for(int i = 0; i < S.length(); i++) {
		
		if(arr[S.charAt(i) - 'a'] == -1) {
			arr[S.charAt(i) - 'a'] = i;
		}
		
	}
	
	// 출력
/*
	방법 1. for문
 */
	for(int i = 0; i < 26; i++) {
		System.out.print(arr[i] + " ");	// 시간 : 140ms
	}
	
/*
	방법 2. 향상된 for문
	for(int val : arr) {
		System.out.print(val + " ");	// 시간 : 148ms
	}
 */
		
// ===================================================================================================================	
		
	}

}
