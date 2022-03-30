package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 10. 10926_??!
		// ※ Scanner vs BufferedReader : https://st-lab.tistory.com/41
		/*
			준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
			준하는 놀람을 ??!로 표현한다.
			준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
		*/
		/*	 
		  방법 1. scanner
		 
		 	scanner.nextLine() 		: 사용자가 입력한 값을 모두 읽어온다. (문자열)
		  		* scanner.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 '엔터'를 빼주기 위해서 sc.nextLine() 메소드를 한 번더 써야한다.
		  	scanner.next() 			: 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		  	scanner.nextInt() 		: 정수를 입력받을 때 사용한다.
		   	scanner.nextDouble() 	: 실수를 입력받을 때 사용한다.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		String Nickname = sc.next();
		
		System.out.println(Nickname+"??!");
		
		/* 
	 	※ 조건문을 사용하면 틀리게 나오기 때문에 바로 출력이 되도록 작성해야 한다...
	 	
//	 		== 연산자	: 주소값으로 일치여부 비교
// 	 		equals	: 내용의 일치여부 비교
		if(Nickname.equals("joonas")) {
			System.out.println(Nickname+"??!");
		} else {
			System.out.println(Nickname);
		}
		 */

// =================================================================================================================================		
		
		/*
			방법 2. BufferedReader
			1. 기본적으로 바이트 스트림인 InputStream 을 통해 바이트 단위로 데이터를 입력을 받는다.
			2. 입력 데이터를 char 형태로 처리하기 위해 중개자 역할인 문자스트림 InputStreamReader로 감싸준다. => 문자로 처리
			3. Buffer를 통해 입력받은 문자를 쌓아둔 뒤 한 번에 문자열처럼 보낸다 => 문자열처럼 출력가능
			★ readLine() : 입력메소드, 공백을 포함한 한줄 전체를 읽어 char 배열을 하나하나 생성할 필요 없이 String 으로 리턴하여 바로 받을 수 있다  
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Nick = br.readLine();
		
		System.out.println(Nick+"??!");
	}

}
