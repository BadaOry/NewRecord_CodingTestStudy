package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 05. 10250_ACM 호텔 (上)_Algo★
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		문제를 단순화하기 위해서 호텔은 직사각형 모양이라고 가정하자. 
		각 층에 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). 
		그리고 엘리베이터는 가장 왼쪽에 있다고 가정하자
		
		엘레베이터 기준으로 걷는 거리가 가장 짧은 방을 선호하며
	 	걷는 거리가 같을 때에는 아래층의 방을 더 선호한다. 
	 	
	 	첫 줄에 [테스트 케이스의 개수 T]가 입력
	 	각 테스트 데이터는 
	 	[호텔의 층 수(H)], [각 층의 방 수(W)], [몇 번째 손님(N)]인지를 나타낸다.
	 	(1 ≤ H,	W ≤ 99, 
	 	 1 ≤ N ≤ H × W).
	 	 
	 	초기에 모든 방이 비어있다고 가정하에 
	 	이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하라.
	 	
		=> 참고 사이트 : https://st-lab.tistory.com/77

			손님(N)수에 따른 방배정 코드작성이 어려움..
			boolean 2차배열을 사용하여 해결하려고 했으나 그것보다 더 간단한 알고리즘이 있었다.. 내 시간이... 
			

	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 테스트 케이스의 개수 T
	int T = Integer.parseInt(br.readLine());
	StringTokenizer st;
	// 한번에 출력하기 위한 StringBuilder
	StringBuilder sb = new StringBuilder();
	
	
	// 테스트 케이스의 개수에 따라 호텔 방 설정 후 방번호 계산
	for(int i = 1; i <= T; i++) {
		
		st = new StringTokenizer(br.readLine(), " ");
		// 호텔의 층 수(높이)
		int H = Integer.parseInt(st.nextToken());
		// 각 층의 방 수(가로) 								-- 참고사이트를 보면 W는 사용하지 않기 때문에 그냥 버려도 됨..
		int W = Integer.parseInt(st.nextToken());
		// 몇 번째 손님
		int N = Integer.parseInt(st.nextToken());
		
		// N번째 손님이 머물 방의 층 수(Y)
		// N번째 손님이 머물 방의 거리 수(X)
		// Y + H = 배정받을 최종 호수
		int Y, X;
		if(N % H == 0) {
			// 방 번호를 구하기 위해 100을 곱한다.
			Y = H * 100;
			X = N / H;
			sb.append(Y + X).append("\n");
		} else {
			Y = (N % H) * 100;
			X = (N / H) + 1;
			sb.append(Y + X).append("\n");
		}
		
		/*
			내가 풀려고 했던것..
			boolean 2차 배열을 이용해 넣고 true로 변환된 값에 따라 방번호를 세어가려고 했는데
			인원수N에 따른 방 배정 코드짜기가 안됬다...
		boolean[][] arr = new boolean[H][W];

		for(int room = 0; room <= N%H; room++) {
			System.out.println("방 번호 증가 : " + room);
			System.out.println("N%H : " + N%H);
			if(N >= H) {
				
				for(int floor = 0; floor <= N/H; floor++) {
					arr[floor][room] = true;
				}
				
			} else {
				for(int floor = 0; floor < N; floor++) {
					arr[floor][room] = true;
				}
			}
		}
		 */	
	}
	
	System.out.println(sb); // 시간 = 124ms
	
// ===================================================================================================================	
	
	}

}
