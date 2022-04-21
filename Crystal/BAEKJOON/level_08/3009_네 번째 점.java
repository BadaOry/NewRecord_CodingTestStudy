package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] coord_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		int x;
		int y;
		
		// x 좌표 비교
		if(coord_1[0] == coord_2[0]) { 			// 1번 2번의 x 좌표 비교
			
			x = coord_3[0];
		}	
		else if(coord_1[0] == coord_3[0]) {     // 1번 3번의 x 좌표 비교
			
			x = coord_2[0];
		}
		else {
			
			x= coord_1[0];
		}
		
		// y 좌표 비교
		if(coord_1[1] == coord_2[1]) { 			// 1번 2번의 y 좌표 비교
			
			y = coord_3[1];
		}	
		else if(coord_1[1] == coord_3[1]) {     // 1번 3번의 y 좌표 비교
			
			y = coord_2[1];
		}
		else {
			
			y= coord_1[1];
		}
		
		System.out.println(x + " " + y);

		
		/* 오리 버전 (중도 포기)
		int[] xs = new int[4];
		int[] ys = new int[4];
				
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			xs[i] = Integer.parseInt(st.nextToken());
			ys[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 3; i++) {
			
			if(xs[i] != ys[i]) {
				
				int length = xs[i] - ys[i];
				System.out.println("길이가 양수일때 길이 : " + length);
				
				if(length < 0) {
					
					length = length - (2 * length);
					System.out.println("길이가 음수일때 길이 : " + length);
				}
				
				break;
			}		
		}
		
		Arrays.sort(xs);
		Arrays.sort(ys);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 로직은 감이 오는데, 좌표를 구할 때 
		//             x, y가 각각 두쌍 있어야하는데 이걸 코드로 표현하지 못하겠음..
		// [ 참고 ] https://st-lab.tistory.com/87
		*/
	}	

}

