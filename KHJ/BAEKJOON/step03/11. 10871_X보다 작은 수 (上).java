package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 11. 10871_X보다 작은 수
	/*
	 	시간 제한 : 1초
	 	1. 배열의 개수 N, 조건 값 X 입력
	 	2. 배열 개수의 인덱스 값에 해당하는 A 입력
	 	3. 배열의 값 중 X보다 작은 값을 출력 
	 */
		
		// 입력받기 위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력하기 위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		★ 그냥 br로 입력해서 받으면 한 줄에 입력하는 방식(10 5)으로 입력 받을 때
		  NumberFormat 런타임 에러가 발생한다.
		int N = Integer.parseInt(br.readLine()); 
		int X = Integer.parseInt(br.readLine());
		 */
		
		String[] strs = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int X = Integer.parseInt(strs[1]);
		
		// 배열의 N개의 인덱스에 해당하는 값을 입력받기 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//	============================================================================================	
/*
 
	// 방법 1. 배열을 생성하여 해결하는 방법	
		// 개수가 N개인 배열 생성 
		int[] nArray = new int[N];
		
		for(int i = 0; i<N; i++) {			
			// 각 인덱스에 해당하는 갑 주입
			nArray[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 값 중 X보다 작은 값을 추출하기 위한 반복문
		for(int i = 0; i<N; i++) {
			if(nArray[i] < X) {
				bw.write(nArray[i] + " ");
			}
		}
 */
//	============================================================================================
		
	// 방법 2. 배열 없이 해결하는 방법(StringBuilder 사용)
		
		// StringBuilder는 문자열끼리 더하는 상황에 사용한다.
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			
			// 조건문에서 X와 비교해야 하므로 int형으로 변환
			int index = Integer.parseInt(st.nextToken());
			
			// 조건에 맞는 값들을 하나로 더하는 중
			if(index < X) {
				sb.append(index + " ");
			}
		}
		
		// 문자열로 출력해야 하므로 String으로 변환
		bw.write(sb.toString());
		
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
