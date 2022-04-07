package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 06. 8958_OX퀴즈
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
		첫째 줄에 테스트 케이스의 개수 N이 주어진다.
		각 테스트 케이스는 한 줄이며
		길이가 0보다 크고 80보다 작은 문자열이 입력된다.
		(문자열은 O와 X만으로 이루어져 있다.)
		
		O가 문제를 맞은 것이고, X는 문제를 틀린 것일 때
		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
		(OOXXOXXOOO = 1+2+0+0+1+0+0+1+2+3 = 10)
		
		점수를 구하는 프로그램 작성하시오
		
		=> 생각보다 코드 작성하는데 오래걸림
		   좀 더 간결한 코드가 있을 것 같지만 나중에 생각하기로.. 
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스의 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		// N의 수 만큼 테스트 케이스를 진행 
		for(int i = 1; i <= N; i++) {
			
			
			// O, X 문자열 입력
			String score = br.readLine();

			// 배열 생성(문자열을 받을 것이므로 String으로)
			String[] arr = new String[score.length()];
			
			
			// 입력된 O,X를 charAt으로 나누어 배열에 값 주입
			for(int j = 0; j < arr.length; j++) {				
				// charAt으로 분리한 뒤 다시 String타입으로 변형해서 배열에 값을 주입한다.
				arr[j] = Character.toString(score.charAt(j));
			}
			
			int count = 0;
			int sum = 0;
			
			// 점수를 구하기 위한 코드
			for(int x = 0; x < arr.length; x++) {
				if(arr[x].equals("O")) {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			System.out.println(sum); // => 시간 : 136ms
		}
		
	}
}
