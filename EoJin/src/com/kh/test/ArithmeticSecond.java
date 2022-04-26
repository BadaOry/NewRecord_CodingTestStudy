package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		if (min == 10000) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

	// 소인수분해
	public void question3() {
		Scanner sc = new Scanner(System.in);
		int i = 2;
		int num = sc.nextInt();

		while (true) {
			if (num % i == 0) {
				num = num / i;
				System.out.println(i);
			} else if (num == 1) {
				break;
			} else {
				i++;
			}
		}
	}

	// 소수 구하기(에라토스테네스의 체) - 1)sc로 하니 시간초과, 2)br로 해도 시간초과, 3) 에라토스테네스의 체
	public void question4() {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[1000001];
		arr[0] = arr[1] = true;
		int M = sc.nextInt();
		int N = sc.nextInt();

		for (int i = 2; i <= N; i++) {
			if (arr[i] == false) {
				if (i >= M)
					System.out.println(i);
				for (int j = i + i; j <= N; j += i)
					arr[j] = true;
			}
		}

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//	        String[] str = br.readLine().split(" ");
//			int M = Integer.parseInt(str[0]);
//			int N = Integer.parseInt(str[1]);
//			
//			for (int i = M; i <= N; i++) {
//				for (int j = 2; j < i; j++) {
//					if (i % j == 0 && i != 2) {
//						arr[i] = true;
//					}
//				}
//				if (arr[i] == false && i != 1) {
//					System.out.println(i);
//				}
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
