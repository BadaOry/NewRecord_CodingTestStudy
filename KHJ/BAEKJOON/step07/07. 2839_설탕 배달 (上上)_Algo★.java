package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 07. 2839_설탕 배달 (上上)_Algo★
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
		설탕 봉지는 3kg 봉지와 5kg 봉지가 있다.
		
		배달해야하는 N이 입력될 때 배달하는 봉지의 최소개수를 출력하라
	 	(정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.)
	 	
		=> 참고 사이트 : https://st-lab.tistory.com/72
		
			if문을 통해 해결하려고 함..
		
			수학적 사고가 필요하다고 한다...
			봐도 모르겠다...
			=> 이걸 이해하려면 표로 만들어 규칙성을 찾아야 한다..	
			
			1. n 이 4 또는 7 인 경우
				=> 정확히 안떨어짐(-1)
			2. n 이 5의 배수인경우 ( 5로 나눈 나머지가 0 인 경우 )
				=> 5kg봉지로만 이루어짐
			3. n 이 5의 배수 + 1 또는 5의 배수 + 3 인 경우 ( 5로 나눈 나머지가 1 또는 3 인 경우 )
				=> 5kg와 3kg로 적당히 나눔
			4. n 이 5의 배수 + 2 또는 5의 배수 + 4 인 경우 ( 5로 나눈 나머지가 2 또는 4 인 경우 )
				=> 5kg와 3kg로 적당히 나눔
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 배달해야 하는 설탕 무게 N
	int N = Integer.parseInt(br.readLine());
	
	if(N == 4 || N == 7) {
		System.out.println(-1);
	}
	else if (N % 5 == 0) {
		System.out.println(N/5);
	}
	else if (N%5 == 1 || N % 5 == 3) {
		System.out.println((N/5) + 1);
	}
	else if (N%5 == 2 || N % 5 == 4) {
		System.out.println((N/5) + 2);
	}
	
	// 시간 = 124ms
	
// ===================================================================================================================	
	
	}

}
