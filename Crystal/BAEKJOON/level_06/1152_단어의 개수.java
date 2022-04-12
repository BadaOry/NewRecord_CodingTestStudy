package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();		
		StringTokenizer st = new StringTokenizer(sentence, " ");
		
		System.out.println(st.countTokens());

//		int count = 0;
//		while(true) {
//			
//
//				System.out.println(st.nextToken());
//				count += 1;
//				
//				if(st.nextToken() == null)
//
//		}
//		
//		System.out.println(count);
		
		// 도전 횟수 : 2
		// [ cause 1 ] split 을 쓰자니 총 갯수를 알 수 없어서 고민이고 (그렇다고 100만번을 돌리기도..)
		//             st 를 쓰자니 st.nextToken() != null 에서 NoSuchElementException
	}
	
}

