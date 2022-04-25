package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] number = new int[21];
		number[0] = 0;
		number[1] = 1;
		
		for(int i = 2; i < 21; i++) {
			
			number[i] = number[i -1] + number[i -2];
			System.out.println(i+"번째 : " + number[i]);
		}

		int n = Integer.parseInt(br.readLine());
		
		System.out.println(number[n]);
		
		// 도전 횟수 : 2
		// [ cause 1 ] ArrayIndexOutOfBoundException : 20 입력할 경우
		//             ▶ 배열의 길이를 20에서 21으로 조정
	}

}

