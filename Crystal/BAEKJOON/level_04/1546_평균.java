package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] array = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		for(int i = 0; i < array.length; i++) {
			
			array[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(array);
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			sum += ((array[i] / array[array.length - 1]) * 100);
		}
		
		System.out.println(sum / array.length);
		
		/* 오리 버전
		// [ 설계 ]
		// 1. 배열의 길이 입력받기
		// 2. 배열에 길이만큼의 숫자 입력받기
		// 3. max 값 구하기
		// 4. 점수 / max * 100 점을 배열에 새로 넣기
		
		// 1.
		int n = Integer.parseInt(br.readLine());
		
		// 2.
		double[] array = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			array[i] = Double.parseDouble(st.nextToken(" "));
		}
		
		// 3.
		double max = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(array[i] > max) {
				
				max = array[i];
			}
		}
		
		// 4.
		double sum = 0;

		for(int i = 0; i < n; i++) {
			
			array[i] = ((array[i] / max) * 100);
			
			sum += array[i];
		}
		
		double avg = sum / n;
		
		System.out.println(avg);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 새로운 평균을 구하는 논리에 오류가 있었음
		//             ▷ 배열을 int 가 아닌 double 로 선언할 것
		// [ 참고 1 ] https://st-lab.tistory.com/47
		 
		*/
	}
}
