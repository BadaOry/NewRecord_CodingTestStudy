package com.kh.test;

import java.util.Arrays;
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
	public void question4() {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int B = 42;
		int result[] = new int[10];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt() % B;
		}

		result = Arrays.stream(A).distinct().toArray();

		System.out.println(result.length);

	}

	// (1차원배열) 5번 문제
	public void question5() {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double average = 0;
		double sum = 0;
		int subject = sc.nextInt();
		double[] score = new double[subject];

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if (score[i] > max) {
				max = (int) score[i];
			}
		}

		for (int j = 0; j < score.length; j++) {
			score[j] = (score[j] / max) * 100;

			sum += score[j];
		}

		average = sum / subject;

		System.out.println(average);
	}

	// (1차원배열) 6번 문제
	public void question6() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String[] ox = new String[num];
		String[] O = null;
		int sum = 0;

		for (int i = 0; i < ox.length; i++) {
			ox[i] = sc.next();

			O = ox[i].toString().split("X");
			for (int j = 0; j < O.length; j++) {
				if (O[j].contains("O")) {
					long count = O[j].chars().filter(o -> o == 'O').count();

					for (int k = 0; k < count; k++) {
						sum += count - k;
					}
				}
			}
			System.out.println(sum);
			sum = 0;
		}
	}

	// (1차원배열) 7번 문제
	public void question7() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int caseArr[] = new int[num];

		for (int i = 0; i < caseArr.length; i++) {
			int num2 = sc.nextInt();
			int student[] = new int[num2];
			int sum = 0;
			double avg = 0;
			double count = 0;
			double result = 0;

			for (int j = 0; j < num2; j++) {
				student[j] = sc.nextInt();
				sum += student[j];
			}
			avg = sum / num2;

			for (int k = 0; k < student.length; k++) {
				if (student[k] > avg) {
					count++;
				}
			}

			result = count / num2 * 100;

			System.out.println(String.format("%.3f", result) + "%");
		}
	}

}
