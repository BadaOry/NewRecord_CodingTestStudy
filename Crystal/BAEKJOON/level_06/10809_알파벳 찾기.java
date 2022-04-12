package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		char[] word = new char[s.length()];
		int[] alphabet = new int[26];
		
		
		// word 에 배열로 넣기
		for(int i = 0; i < s.length(); i++) {
			
			word[i] = s.charAt(i);
		}
		
		
		// alphabet 배열의 기본값을 -1 로 초기화
		for(int i = 0; i < 26; i++) {
			
			alphabet[i] = -1;
		}
		
		
		// 조건 맞추는 for 문 돌리기
		for(int i = 0; i < s.length(); i++) {
			
			// alphabet[0] = 97 = a
			// alphabet[1] = 98 = b
			//  ..
			// alphabet[25] = 122 = z
			
			// 만약 word[0] = b 면 alphabet[1] 에 = 0
			// 만약 word[1] = a 면 alphabet[0] 에 = 1
			// 만약 word[i] = e 면 alphabet[e-97] 에 = i;
			
			
			for(int j = 0; j < 26; j++) {
				
				if((word[i] - 97) == j && alphabet[j] == -1) {
					
					alphabet[j] = i;
				}
			}
		}
		
		
		// 출력
		for(int i : alphabet) {
			
			System.out.print(i +  " ");
		}
		
		// 도전 횟수 : 3
		// [ cause 1 ] for 문 돌릴때 i 와 j 의 순서가 바뀐듯
		// [ cause 2 ] alphabet 배열이 초기화 되지 않았고,
		//             첫 번째 글짜 위치가 아닌 것이 나옴

	}
	
}

