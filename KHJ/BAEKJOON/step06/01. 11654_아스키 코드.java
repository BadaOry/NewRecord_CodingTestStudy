package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 01. 11654_아스키 코드
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
		주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		
		=> 참고 사이트 :
			1. 정답은 맞췄으나 이게 맞을까 의구심이 듬.. => 이게 맞네..?
	 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = br.readLine().charAt(0);
		
		System.out.println(s);
		
		
	}
	
	

}
