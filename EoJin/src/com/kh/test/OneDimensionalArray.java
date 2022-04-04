package com.kh.test;

import java.util.Scanner;

public class OneDimensionalArray {
	Scanner sc = new Scanner(System.in);
	// 1차원배열

	// (1차원배열) 1번 문제
	public void question1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int max = -1000000;
		int min = 1000000;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min + " " + max);

	}

	// (1차원배열) 2번 문제
	public void question2() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int min = 100;

		for (int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0 ; i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
//			}
			System.out.println(arr[i]);
		}

		for (int j : arr) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.print(min + " " + max);

	}

	// (1차원배열) 3번 문제
	// (1차원배열) 4번 문제
	// (1차원배열) 5번 문제
	// (1차원배열) 6번 문제
	// (1차원배열) 7번 문제

}
}
