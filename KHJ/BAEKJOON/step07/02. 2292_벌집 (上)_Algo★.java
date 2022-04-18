package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 02. 2292_벌집 (上)_Algo★
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
		육각형으로 이루어진 벌집이 있다.
		중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
	 	숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 
	 	몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
	 	첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
	 	
	 	1				: 벌집 개수 01개, 통과하는 방의 개수(count) 1
	 	2(range)~7	 	: 벌집 개수 06개, 통과하는 방의 개수 2
	 	8~19			: 벌집 개수 12개, 통과하는 방의 개수 3
	 	20~37			: 벌집 개수 18개, 통과하는 방의 개수 4
	 	38~61			: 벌집 개수 24개, 통과하는 방의 개수 5
	 	...
	 	n		: 
	 		 	
		=> 참고 사이트 : https://st-lab.tistory.com/73
		
			모르겠다...
			벌집숫자가 정해져 있다면 억지구현이라도 할 테인데.. 너무 많은걸 보니
			뭔가 수학적 사고가 안떠오른다..
			
			=> 알고리즘까지는 생각했으나 그것을 코딩으로 못 짬..


	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 숫자 N
	int N = Integer.parseInt(br.readLine());
	int count = 1; // 통과하는 방의 개수(최소 루트)
	int range = 2; // 해당 방의 번호 범위의 최솟값 기준(2~7 : 2, 8~19 : 8)
	
	if(N == 1) {
		System.out.println(1);
	}
	
	else {
		// N = 10
		while(range <= N) {
			// 2 = 2 + (6*1) = 8
			// 8 = 8 + (6*2) = 20
			range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화
			count++;
		}
		System.out.println(count); // 시간 : 124ms
	}
	
// ===================================================================================================================	
	
	}

}
