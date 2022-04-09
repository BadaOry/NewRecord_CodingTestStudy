package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// [ 설계 ]
		// 1. 걸리는 시간 로직 구하기 
		//    : n번 다이얼에 걸리는 시간 = n + 1 초
		// 2. 배열로 char 를 int 값으로 저장하기 
		// 3. 단어를 문자열로 입력하기
		// 4. 입력한 문자열을 문자로 분리
		// 5. 분리한 문자들의 해당 시간을 case 문으로 구해서 sum 하고 출력
		//    ▷ 으로 하려다가 ASCII 코드로 하기로 함
		
		String word = br.readLine();
		char[] wordarray = word.toCharArray();
		int time = 0;
		int sum = 0;

		
		for(int i = 0; i < wordarray.length; i++) {
			
			int wordchar = wordarray[i];
			
			if(65 <= wordchar && wordchar <= 67) {
				
				time = 3;
				sum += time;
			} else if (68 <= wordchar && wordchar <= 70) {
				
				time = 4;
				sum += time;
			} else if (71 <= wordchar && wordchar <= 73) {
				
				time = 5;
				sum += time;
			} else if (74 <= wordchar && wordchar <= 76) {
				
				time = 6;
				sum += time;
			} else if (77 <= wordchar && wordchar <= 79) {
				
				time = 7;
				sum += time;
			} else if (80 <= wordchar && wordchar <= 83) {
				
				time = 8;
				sum += time;
			} else if (84 <= wordchar && wordchar <= 86) {
				
				time = 9;
				sum += time;
			} else if (87 <= wordchar && wordchar <= 90) {
				
				time = 10;
				sum += time;
			} else {
				
				time = 11;
				sum += time;
			}
			
		}
		
		System.out.println(sum);
		
		
		// 도전 횟수 : 2
		// [ cause 1 ] 입력받은 단어를 쪼개서 char -> int 로 만드는데 실패함
		// [ 참고 1 ] String to char : https://www.delftstack.com/ko/howto/java/how-to-convert-a-string-to-char-in-java/
	}
	
}
