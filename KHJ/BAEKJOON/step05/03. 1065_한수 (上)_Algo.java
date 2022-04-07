package BAECKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 03. 1065_한수 (上)_Algo
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
	 	어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 [한수]라고 한다
		[등차수열]은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		
		N이 주어졌을 때, 
		1보다 크거나 같고, N보다 작거나 같은(1<= A <=N) 한수의 개수를 출력하는 프로그램을 작성하시오. 
		
		=> 참고 사이트 : https://st-lab.tistory.com/54
		
			1. 문제 이해가 힘듬...
			2. 알고리즘이 생각조차 안남..
			3. 혼자 절대 생각못했을듯..

	 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = algo(N);
		
		System.out.println(result);
		
	}
	
	// 한수의 개수를 세기 위한 함수
	public static int algo(int num) {
		// 한수 카운팅
		int count = 0;
		
		// 1~99는 그 자체로 수열이므로 그 자체로 한수이다.
		if(num < 100) {
			return num;
			
		} else {
			
			// 100이상의 수가 들어왔을 때 한수의 최소 개수는 99개이므로 count=99로 초기화 한다.
			count = 99;
			
			// 입력값 중 최댓값은 1000이지만 1000은 등차수열도 아니고 그 이상의 값도 받지 않기 때문에
			// num = 999 로 변경해준다 => 예외처리를 해준다
			if(num == 1000) {
				num = 999;
			}
		}
		
		for(int i = 100; i <= num; i++) {
			
			int hun = i / 100;			// 백의 자리수
			int ten = (i / 10) % 10;	// 십의 자리수
			int one = i % 10;			// 일의 자리수
			
			// 각 자리수가 수열을 이루면 카운팅
			if((hun - ten) == (ten - one)) {
				count++;
			}
		}
		
		return count;
	}

}
