package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Sort {

	// 수 정렬하기
	public void question1() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int temp;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

	public void question2() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int temp;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

	}

	public void question3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N;
		try {
			N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);

			for (int i = 0; i < N; i++) {
				sb.append(arr[i]).append('\n');
			}

			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}

	}

	// 통계학
	public void question4() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] num = new double[N];

		for (int i = 0; i < N; i++)
			num[i] = sc.nextDouble();
		sc.close(); // 산술평균

		double sum = 0;

		for (double d : num)
			sum += d;
		System.out.println((int) Math.round(sum / N)); // 중앙값

		Arrays.sort(num);
		System.out.println((int) num[N / 2]); // 최빈값

		int[] freq = new int[8001];

		for (double d : num)
			freq[(int) d + 4000]++;

		int maxFrequency = 0; // 최대 빈도
		int maxIndex = 0;
		for (int i = 0; i < 8001; i++)
			if (freq[i] > maxFrequency)
				maxFrequency = freq[i];

		boolean twice = false;
		for (int i = 0; i < 8001; i++) {
			if (freq[i] == maxFrequency) {
				if (twice) {
					maxIndex = i - 4000;
					break;
				}
				maxIndex = i - 4000;
				twice = true;
			}
		}
		System.out.println(N == 1 ? (int) num[0] : maxIndex); // 범위
		System.out.println((int) (num[N - 1] - num[0]));
	}

	public void question5() {
		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();

		String[] arr = num.split("");

		Arrays.sort(arr, Comparator.reverseOrder());
		for (String string : arr) {
			System.out.print(string);
		}
	}

	public void question6() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}

	}

	public void question7() {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] arr = new int[num][2];

		for (int i = 0; i < num; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}

		Arrays.sort(arr, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		for (int i = 0; i < num; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}

	public void question8() {
		Scanner sc = new Scanner(System.in);
		String temp = "";
		int N = sc.nextInt();
		sc.nextLine();

		String arr[] = new String[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}

		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparing(String::length));

		for (int i = 0; i < arr.length; i++) {
			if (temp.equals(arr[i])) {
				continue;
			} else {
				System.out.println(arr[i]);
				temp = arr[i];
			}
		}
	}

	public void question9() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[][] arr = new String[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.next(); // 나이
			arr[i][1] = sc.next(); // 이름
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}

		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}

		System.out.println(sb);

	}

	// 집합과 맵 - 2. 문자열 집합
	static HashMap<String, Integer> map;
	public void question22() {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int num= 0;
			map = new HashMap();
			for( int i = 0 ; i < a ; i++ ) {
				map.put(sc.next(), 1);
			}
			for( int i = 0 ; i < b ; i++ ) {
				String str = sc.next();
				if( map.get(str) != null) num++;
			}
			System.out.println(num);
		}
	
}
