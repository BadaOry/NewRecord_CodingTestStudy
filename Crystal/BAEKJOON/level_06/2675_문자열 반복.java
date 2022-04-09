package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
			
			for(int k = 1; k <= t; k++) {
				
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken("");
			
			int r = Character.getNumericValue(str.charAt(0));
	
			for(int i = 2; i <= str.length() - 1; i++) {
					
				char repeat = str.charAt(i);
					
				for(int j = 1; j <= r; j++) {
					
					System.out.print(repeat);
				}
			}
                
             System.out.println();   
		}

		// 도전 횟수 : 5
		// [ cause 1 ] S 문자열을 분리하지 못함
		// [ cuase 2 ] str 의 길이를 잘못 구해서 for 문의 반복 횟수를 틀림
		// [ cause 3 ] 반복 횟수 R 의 초기화 오류 : char 를 int 로 바꾸는 방법을 몰랐음
		//             ▶ https://frhyme.github.io/java/java_basic02_char_to_int/
		// [ cause 4 ] 문제를 잘못 이해함 & 입출력 형태가 동일하지 않음
	}
	
}

