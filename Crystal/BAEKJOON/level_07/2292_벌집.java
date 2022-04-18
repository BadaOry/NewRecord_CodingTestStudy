package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1; // 겹 수
		int range = 2; // 범위 (최솟값 기준)
		
		if (n == 1) {
			
			System.out.println(1);
		}
		else {
			
			while(range <= n) {
				
				range += (count * 6);
				count++;
			}
			
			System.out.println(count);
		}
		
		/* 오리 버전
		int n = Integer.parseInt(br.readLine());
		int sum = 1;		// 총 숫자의 갯수
		int x = 0 ;			// x 번째 겹
		// [ 설계 ]
		// 1. x 번째 겹에는 몇개의 숫자가 있고 몇번부터 몇번까지인지 계산
		// 2. 1번방을 중심으로 n 이 x번째 겹에 있는지 확인할 것
		
		// 중심원   : 1*1개   1
		// 1번째 원 : 3*2개   2~7
		// 2번째 원 : 3*4개   8~19
		// 3번째 원 : 3*6개   20~37
		// x번째 원 : 3*(2*x) 
		// ▶ 우리가 최종적으로 구해야 할 건 x+1
		
		for(x = 1; x <= n; x++) {
			
			sum += 3 * (2 * x);
			
			if(n <= sum) {
				
				System.out.println(x + 1);
				
				break;
			}
		}
		
		// 도전 횟수 : 2
		// [ cause 1 ] 방법 자체는 틀리지 않았는데 어디서 틀렸는지는 잘 모르겠음..
	    */
	}

}

