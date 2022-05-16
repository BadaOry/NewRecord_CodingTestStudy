package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 04. 2869_달팽이는 올라가고 싶다(中)_Algo
	/*
	 	시간 제한 : 0.15초 / 메모리 제한 : 128MB
	 	
		땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

		달팽이는 낮에 A미터 올라갈 수 있다. 
		하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
		또, 정상에 올라간 후에는 미끄러지지 않는다.

		달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	 	
	 	첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. 
	 	(1 ≤ B < A ≤ V ≤ 1,000,000,000)
	 	
		=> 참고 사이트 : https://st-lab.tistory.com/75
		
		   시간초과..?
		   => 반복문을 사용하지 않고 ★최적화 알고리즘★을 짜야 제한시간 안에 풀 수 있다.
		 
	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
	// A : 달팽이가 낮에 올라가는 거리(up)
	int A = Integer.parseInt(st.nextToken());	
	// B : 달팽이가 밤에 미끄러지는 거리(down)
	int B = Integer.parseInt(st.nextToken());
	// V : 달팽이가 오르고자 하는 총 거리(length)
	int V = Integer.parseInt(st.nextToken());
	
	/*
	// D : 나무막대에 오르는 일 수
	int D = 1;
	
	while(V > 0) {
		
		if(V - A <= 0) {
			break;
		} 
		else {
			V = V -(A-B);
			D++;
		}
		
	}
	
	System.out.println(D); // 시간초과(결과는 나옴)
	
	*/
	
	
// ===================================================================================================================	
	
	/*
		day = 나무막대에 오르는 최소한의 일 수
			1. 딱 떨어지는 경우
				(length-down) % (up - down) = 0
			2. 미끄러져서 하루가 더 필요한 경우 
				(length-down) % (up - down) != 0
	*/
	int day = (V-B) / (A - B);
	
	// 나머지가 있을 경우(하루가 더 필요한 경우)
	if((V-B) % (A - B) != 0) {
		day++;
	}
	
	System.out.println(day); // 120ms
	
	}	 

}
