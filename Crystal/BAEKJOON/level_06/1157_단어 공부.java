package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[26]; // 알파벳 총 갯수
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			
			if('A' <= word.charAt(i) && word.charAt(i) <= 'Z') { // 대문자 범위
				
				array[word.charAt(i) - 'A']++;  // 해당 인덱스의 값 1 증가
			} else { 										   // 소문자 범위
				
				array[word.charAt(i) - 'a']++;
			}
		}
	
		
		int max = -1;
		char print = '?';
		
		for(int i = 0; i < 26; i++) {
			
			if(array[i] > max) {
				
				max = array[i];
				print = (char)(i + 65);  // 대문자로 출력
			} 
			else if(array[i] == max) {
				
				print = '?';
			}
		}
		
		System.out.println(print);	
		
		// 도전 횟수 : 2
		// [ 참고 1 ] https://st-lab.tistory.com/64
	}
	
}

