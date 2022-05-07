package com.kh.test;

import java.util.Scanner;

public class BruteForce {

	// 블랙잭
	public void question1() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		int tmp = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];

					if (tmp < sum && sum <= M) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
	}
	
	
	public void question2() {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
        
		int result = 0;
 
		
		for(int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 변수 
			
			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}
};
