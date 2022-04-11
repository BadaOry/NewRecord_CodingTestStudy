package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 09. 2941_크로아티아 알파벳 (上)_Algo
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
		(영단어 --> 크로아티아 알파벳 변경 후 카운팅)
		
		첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
		
		=> 참고 사이트 : https://st-lab.tistory.com/68
		
			1. 어떻게 푸는지 모르겠음.. => 알고리즘
			2. 2개이상의 문자(char)를 어떻게 하나로 인식시켜야 하는지 몰랐음
			
			=> 더러워서 다른방법이라고 생각했지만 그 코드가 맞았다..
			
			그냥 syso로 count를 출력하면 백준에서 
			java.lang.StringIndexOutOfBoundsException 런타임 에러가 발생한다.
			조건문에 따라 마지막 문자에서 i가 ++이 되면 뒤의 문자가 없기 때문이다.
			따라서 현재 i 의 값이 문자열 길이(str.length) 에서 -1 값보다 작을 경우에만 실행시키면 된다.
			if(i < s.length() - 1) {	
			
			}
			
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String s = br.readLine();
	// 문자의 개수를 셀 변수
	int count = 0; 
	
	for(int i = 0; i < s.length(); i++) {
		
		char c = s.charAt(i);
		
		if(c == 'c') {
			
			if(i < s.length() - 1) {				
				if(s.charAt(i + 1) == '=') {
					// i+1 까지가 하나의 문자이므로 다음 문자로 건너 뛰기 위해 1 증가
					i++;
				} else if (s.charAt(i + 1) == '-') {
					i++;
				}				
			}		
			
		}
		
		else if (c == 'd') {
			
			if(i < s.length() - 1) {				
				if(s.charAt(i + 1) == 'z') {
					
					if(i < s.length() - 2) {						
						if(s.charAt(i + 2) == '=') {
							i += 2;
						}						
					}
					
				} else if (s.charAt(i + 1) == '-') {
					i++;
				}				
			}
			
		}
		
		else if (c == 'l') {
			
			if(i < s.length() - 1) {				
				if(s.charAt(i + 1) == 'j') {
					i++;
				}				
			}
			
		}
		
		else if (c == 'n') {
			
			if(i < s.length() - 1) {	
				if(s.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
		}
		
		else if (c == 's') {
			
			if(i < s.length() - 1) {				
				if(s.charAt(i + 1) == '=') {
					i++;
				}
			}
			
		}
		
		else if (c == 'z') {
			
			if(i < s.length() - 1) {				
				if(s.charAt(i + 1) == '=') {
					i++;
				}
			}
			
		}
		
		count++;
		
	}
	
	System.out.println(count); // 시간 = 120ms
		
// ===================================================================================================================	
		
	}

}
