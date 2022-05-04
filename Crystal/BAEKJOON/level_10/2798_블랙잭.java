package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] card = new int[n];
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(card, n, m);
		System.out.println(result);
		
		/* 오리 버전 (중도 포기)
		int max = 0;
		int comp = 0;
		
		for(int i = 0; i < n; i++) {  				// 첫 번째 수
			
			for(int j = i + 1; j < n; j++) { 		// 두 번째 수
				
				for(int k = j + 1; k < n; k++) {    // 세 번째 수
				
					max = card[i] + card[j] + card[k];
				
					if(max >= comp) {
						
						if(max <= m) {
							
							comp = max;
						}
						
					}
					else {
						return;
					}
				}	 

			}
		
		}	
		
		System.out.println(max);
		*/
		
		// 도전 횟수 : 2
		// [ cause 1 ] 3중 for 문까지는 생각했는데,
		//             첫번째 카드는 n-2, 두번째 카드는 n-1 까지 순회한다는걸 놓침
		// [ 참고 ]
	}	

	static int search(int[] card, int n, int m) {
		
		int result = 0;
		
		for(int i = 0; i < n-2 ; i++) {
			
			for(int j = i + 1; j < n-1; j++) {
				
				for(int k = j + 1; k < n; k++) {
					
					int sum = card[i] + card[j] + card[k];
					
					if(m == sum) {
						
						return sum;
					}
					
					if(result < sum && sum < m) {
						
						result = sum;
					}
				}
				
			}
		}
		
		return result;
	} 
}

