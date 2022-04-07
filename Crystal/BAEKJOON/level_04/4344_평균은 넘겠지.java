package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < testcase; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			array = new int[n];
			
			double sum = 0;
			
			for(int j = 0; j < n; j++) {
				
				int score = Integer.parseInt(st.nextToken());
				array[j] = score;
				sum += score;
			}
			
			double avg = sum / n;
			double count = 0;
			
			for(int j = 0; j < n; j++) {
				
				if(array[j] > avg) {
					
					count++;
				}
			}
				
			System.out.printf("%.3f%%\n", (count / n) * 100);
			
		}
		
		/* 망한 오리 버전
		// [ 설계 ]
		// 1. c, 배열 입력받기
		// 2. 배열의 i 번째 내용의 double avg 구하기
		// 3. double avg 를 넘는 인원수 체크
		// 4. avg 넘는 인원수 / 총 인원수 출력 
		
		// 1.
		int c = Integer.parseInt(br.readLine());
		
		String[] array = new String[c];
		
		for(int i = 0; i < c; i++) {
			
			array[i] = br.readLine();
		}
		
		double sum = 0;
		double avg = 0;
		
		// 2.
		for(int i = 0; i < c; i++) {
			
			int num = Integer.parseInt(String.valueOf(array[i].charAt(0)));
			
			for(int j = 0; j < num; j++) {
				
				StringTokenizer st = new StringTokenizer(array[i], " ");
				
				System.out.println("sum 에 더할 놈 : " + Double.parseDouble(st.nextToken()));
				
				sum += Double.parseDouble(st.nextToken());
			}
			
			sum -= num;
			avg = sum / array[i].charAt(0);
		}
		
		System.out.println(avg);
		
		// 3.
		double count = 0;
		
		for(int i = 0; i < c; i++) {
			
			int num = Integer.parseInt(String.valueOf(array[i].charAt(0)));
			
			for(int j = 1; j < num + 1; j++) {
				
				StringTokenizer st = new StringTokenizer(array[i], " ");
				
				if(Double.parseDouble(st.nextToken()) > avg) {
					
					count++;
					System.out.println("반복문 count : " + count);
				}
				
			}

		}
		
		System.out.println("최종 count : " + count);
		
		// 4.
		for(int i = 0; i < c; i++) {
			
			System.out.printf("%.3f", count / array[i].charAt(0));
		}
		
     	// 도전 횟수 : 4
		// [ cause 1 ] StringTokenizer 를 제대로 활용하지 못함
		// [ 참고 1 ] https://st-lab.tistory.com/51
		 
		*/
	}
}
