package com.kh.test;

import java.util.Scanner;

public class ArithmeticSecond {

	// 소수 찾기
	public void question1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		boolean[] arr = new boolean[1001];

		for (int i = 0; i < num; i++) {
			int nums = sc.nextInt();

			for (int j = 2; j < nums; j++) {
				if (nums % j == 0) {
					arr[nums] = true;
				}
			}

			if (arr[nums] == false && nums != 1)
				count++;
		}
		System.out.println(count);

	}

	// 소수
	public void question2() {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[10001];
		int sum = 0;
		int min = 10000;
		int M = sc.nextInt();
		int N = sc.nextInt();

		for (int i = M; i <= N; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 2) {
					arr[i] = true;
				}
			}
			if (arr[i] == false && i != 1) {
				sum += i;
				if (i < min) {
					min = i;
				}
			}

		}
		if(min==10000) {			
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
