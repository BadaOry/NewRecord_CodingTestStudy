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
}
