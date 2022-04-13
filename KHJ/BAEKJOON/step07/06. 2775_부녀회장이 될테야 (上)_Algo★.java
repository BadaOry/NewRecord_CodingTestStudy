package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 06. 2775_부녀회장이 될테야 (上)_Algo★
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
	 	a층의 b호에 살려면 
	 	자신의 아래(a-1)층의 1호부터 b호까지 
	 	사람들의 수의 합만큼 사람들을 데려와 살아야 한다
	 	
	 	아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때,
	 	주어지는 양의 정수 k와 n에 대해 
	 	k층에 n호에는 몇 명이 살고 있는지 출력하라.
	 	(아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.) 
	 	
	 	첫 번째 줄에 Test case의 수 T 입력
	 	각 케이스마다 첫번째 줄에 정수 k(층), 두번째 줄에 정수 n(호) 입력
	 	(1 <= k, n <= 14)
	 	
		=> 참고 사이트	 : https://st-lab.tistory.com/78
		
				수학적 사고방식이 어려움;;.. 머리가 멍해진다..
				모르겠다..
				=> 1. 2차원 배열 사용 생각자체를 못함..
				   2. APT 알고리즘 자체가 어려움... ㅠㅠ

	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 한번에 출력하기 위해 StringBuilder 사용
	StringBuilder sb = new StringBuilder();
//	---------------------------------------------------
	
	/*
		알고리즘
		k층 n호 = (k-1)층1호 + (k-1)층2호 +...+ (k-1)층n호
			   = (k층 n-1호) + (k-1층 n호) => 표로 봐야 이해감..
	*/
	
	// 아파트 생성
	// 14호까지지만 인덱스는 0부터 시작하므로 0을 
	// 제외한 14개를 만들기 위해 15길이 배열 생성
	int[][] APT = new int[15][15];
	
	for(int i = 0; i < 15; i++) {
		// (0호는 사용안하니 아무값이나 주입)
		APT[0][i] = i; // 0층 1호 ~ 14호
		APT[i][1] = 1; // 1층~14층 1호
	}
	
	// i = 1층 ~ 14층
	for(int i = 1; i < 15; i++) {		
		// j = 2호 ~ 14호
		for(int j = 2; j < 15; j++) {
			// 3층 2호 = 3층1호 + 2층2호
			APT[i][j] = APT[i][j-1] + APT[i-1][j];
		}		
	}	
//	---------------------------------------------------
	
	// 테스트 케이스의 수 T
	int T = Integer.parseInt(br.readLine());	
	
	for(int i = 1; i <= T; i++) {
		// k층(0층 존재, k>=1)
		int k = Integer.parseInt(br.readLine());
		// n호(1호부터 14호까지 있음, 0층의 j호에는 j명이 산다.)
		int n = Integer.parseInt(br.readLine());
		
		// 결과값을 한번에 한줄에 하나의 값으로 출력하기위해 사용 
		sb.append(APT[k][n]).append('\n');
	}
	System.out.println(sb);	// 시간 = 116ms
	
// ===================================================================================================================	
	
	}

}
