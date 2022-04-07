package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 07. 4344_평균은 넘겠지 (中)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 256MB
	 	
		첫째 줄에 테스트 케이스의 개수 C가 주어진다.
		둘째 줄부터 
			각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수
			이어서 N명의 점수가 주어진다.
			(점수는 0보다 크거나 같고, 100보다 작거나 같은 정수)
		
		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 
		소수점 셋째 자리까지 출력하시오
		
		=>  
			1. 평균을 넘는 학생들의 비율이 0이 나옴..? 
			2. int를 double로 형변환하는데에서 시간걸림
			(1, 2) => 총합, 평균, 평균을 넘는 학생의 수의 타입을 double로 변경
			3. 소수점 자릿수(printf) 다시 한번 확인
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스의 개수 C 입력
		int C = Integer.parseInt(br.readLine());
			
		// 테스크 케이스 수 만큼 반복 진행
		for(int i = 1; i <= C; i++) {
			
			// 학생의 수 N과 N명의 점수를 한 줄에 힙력
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			// 학생의 수 N
			int N = Integer.parseInt(st.nextToken());
			// N명의 점수를 저장할 배열 생성
			int[] arr = new int[N];
			
			// 입력한 점수를 배열에 주입 
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
//			System.out.println(Arrays.toString(arr));
			
			// 총합
			double sum = 0;
			
			for(int j = 0; j < N; j++) {
				sum += arr[j];
			}
			
//			System.out.println("점수 총합 : " + sum);
			
			// 평균 점수(ave)
			double ave = sum/N;
//			System.out.println("평균 점수 : " + ave);
			
			// 평균을 넘는 학생들의 수(count)
			double count = 0;
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > ave) {
					count++;
				}
			}
			
//			System.out.println("평균을 넘는 학생 수 : " + count);
//			System.out.println("전체 학생 수 : " + N);
//			
//			System.out.println(count/N);
			
			// 평균을 넘는 학생들의 비율
			double ratio = ((count/N)*100);
//			System.out.println("평균을 넘는 학생의 비율 : " + ratio);
			
			/*
			 	prinftf로 소수점 자리 3까지 표현 : %.나타낼소수점자리수f
			 	% 표시 : %%
			 	줄 바꿈 : \n , 입력창의 줄을 바꿈
			 */
			System.out.printf("%.3f%%\n", ratio); // 시간 = 172ms
		}
		
	}
}
