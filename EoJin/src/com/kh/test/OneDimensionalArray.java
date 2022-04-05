package com.kh.test;

import java.util.Scanner;
import java.util.stream.Stream;

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
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(maxIndex);
	}

	// (1차원배열) 3번 문제
	public void question3() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int count[] = new int[10];

		Integer multiply = A * B * C;

		String[] arr1 = multiply.toString().split("");
		Stream<String> stream = Stream.of(arr1);
		int[] result = stream.mapToInt(Integer::parseInt).toArray();

		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (result[i] == arr[j]) {
					count[j] += 1;
				}
			}
		}

		for (int k = 0; k < count.length; k++) {
			System.out.println(count[k]);
		}
	}

	// (1차원배열) 4번 문제
	// (1차원배열) 5번 문제
	// (1차원배열) 6번 문제
	// (1차원배열) 7번 문제
}
