package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 03. 1193_분수찾기 (上上)_Algo★_모르겠음..
	/*
	 	시간 제한 : 0.5초 / 메모리 제한 : 256MB
	 	
		무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
		
		1/1 1/2 1/3 1/4 1/5 ...
		2/1 2/2 2/3 2/4 ...
		3/1 3/2 3/3 ...
		4/1 4/2 ...
		5/1 ...
		...
		
		이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
		지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
		
		X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	 	
		=> 참고 사이트 : https://st-lab.tistory.com/74
		
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 찾고자 하는 분수 순서 X
	int X = Integer.parseInt(br.readLine());
	
	// T 	= 분모와 분자갑의 합
	// T-1 	= 같은 T값을 가지는 대각선 칸의 개수
	
	// 대각선 위로 올라갈 때는 T%2가 0
	// 대각선 아래로 내려갈 때는 T%2가 1이다 
	
	// 해당 범위의 대각선 칸 개수(cross_count)
	int cross_count = 1;
	// 해당 대각선 직전 대각선 까지의 칸의 누적 합(prev_count_sum)
	int prev_count_sum = 0;
	
	while(true) {
		// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
		if(X <= prev_count_sum + cross_count) {
			
			// 대각선의 개수가 홀수라면
			if(cross_count % 2 == 1) {
				// 분모가 큰 수부터 시작
				// 분모 = 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 -1)
				// 분자 = X 번째 - 직전 대각선까지의 누적 합
				System.out.print((cross_count - (X - prev_count_sum -1)) + "/" + (X - prev_count_sum));
				break;
			}
			
			else { // 대각선의 개수가 짝수라면
				// 홀수일 때의 출력을 반대로
				System.out.print((X - prev_count_sum) + "/" +  (cross_count - (X - prev_count_sum -1)));
				break;
			}
			
		} else {
			prev_count_sum += cross_count;
			cross_count++;
		}
	}
	
// ===================================================================================================================	
	
	}

}
