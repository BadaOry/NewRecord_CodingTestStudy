package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 06. 1152_단어의 개수_(中)
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
	 	영어 대소문자와 공백으로 이루어진 문자열이 주어질 때 
	 	몇개의 단어가 있는지 개수를 구하라
	 	(단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어라)
	 	
	 	첫 줄에 영어 대소문자와 공백으로 이루어진 문자열 입력
	 	단어는 공백 한 개로 구분
		
		=> 참고 사이트 : https://st-lab.tistory.com/65
			
			1. ★ split 함수를 사용할 경우 " " 입력 시 1이 출력되어 틀리게 나온다
			
			2. StringTokenizer 사용 시 token개수를 셀 수 있는 countTokens() 메소드 기억하기
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 1. trim을 사용하여 앞 뒤 공백을 없애고
	/*
		2. split으로 " "를 구분자로 사용하여 배열 arr에 값 주입 
			=> " " 입력 시 빈 문자열이 되므로 1이 출력되어 틀림
			
	String[] arr = br.readLine().trim().split(" ");
	 */
	
//	StringTokenizer st = new StringTokenizer(br.readLine().trim(), " "); // 시간 = 260ms;
//		=> trim()메소드를 안써줘도 자동으로 처음과 마지막의 공백을 처리해준다.
	StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 시간 = 272ms ..? 메소드 하나 덜 쓰는데 왜 시간이 더 오래걸림..?	
	
	System.out.println(st.countTokens());
		
// ===================================================================================================================	
		
	}

}
