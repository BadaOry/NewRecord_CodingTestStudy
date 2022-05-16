package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		// [ 설계 ]
		// 1. 왼쪽/아래가 더 짧은지 오른쪽/위가 더 짧은지 판별
		//    ▷ x / w - x / y / h -y 를 배열에 차례대로 넣고
		//      Arrays 로 정렬해서 index 0 을 출력하자
		// 2. w - x 와 h - y 를 비교해서 더 작은것으로 가면 됨

		int[] length = new int[4];
		int min = 0; // 최소값
		
		length[0] = x;
		length[1] = w - x;
		length[2] = y;
		length[3] = h - y;
		
		Arrays.sort(length);
		
		System.out.println(length[0]);
//		
//		int x_min = Math.min(x,  w-x);
//		int y_min = Math.min(y,  h-y);
//		
//		System.out.println(Math.min(x_min, y_min));

		// [ 참고 ] https://st-lab.tistory.com/86
		//         ▷ 배열에 넣을 필요 없이, Math.min 메소드를 사용하면 더 간단하게 풀이 가능
	
	}	

}

