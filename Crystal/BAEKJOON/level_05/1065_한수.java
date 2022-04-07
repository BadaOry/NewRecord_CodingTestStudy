package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(d(Integer.parseInt(br.readLine())));
	}
	
	public static int d(int num) {
		
		int count = 0;
		
			
		if(num < 100) {
			
			return num; // 1 ~ 99 는 모두 등차수열이기 때문
			
		} else {
			
			count = 99; // 1 ~ 99 는 모두 등차수열이기 때문에 count 를 99 개로 초기화
			
			if(num == 1000) {
				
				num = 999; // 1000은 등차수열도 아니고, 1000보다 큰 수를 입력받지 않으므로
				           // num = 1000 일 경우, num = 999로 바꿔주는 예외 처리
			}
			
			for(int i = 100; i <= num; i++) { // 한수를 구하는 반복문
				
				int hun = i / 100;			// 한수의 100의자리 숫자
				int ten = (i / 10) % 10;	// 한수의 10의자리 숫자
				int one = i % 10;			// 한수의 1의자리 숫자
				
				if((hun - ten) == (ten - one)) {
					
					count++;
				}
			}
			
			return count;
		}

	}
	
		// 도전 횟수 : 2
		// [ cause 1 ] 
}
