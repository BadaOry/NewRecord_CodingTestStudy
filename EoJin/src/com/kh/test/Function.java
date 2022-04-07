package com.kh.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Function {

	long sum(int[] a) {
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public void question2() {
		boolean[] notSelfNum = new boolean[10001];

		for (int i = 1; i < 10001; ++i) {
			int result = d(i);
			if (result < 10001) {
				notSelfNum[result] = true;
			}
		}

		for (int j = 1; j < notSelfNum.length; ++j) {
			if (!notSelfNum[j]) {
				System.out.println(j);
			}
		}

	}

	public static int d(int n) {
		int result = n;
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
	

	public void question3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i < 100) {
				count += 1;
			} else if (i <= 999) {
				String number[] = Integer.toString(i).split("");

				// 백의자리
				int a = Integer.parseInt(number[0]);
				// 십의자리
				int b = Integer.parseInt(number[1]);
				// 일의자리
				int c = Integer.parseInt(number[2]);

				// 도저히 한수 판정을 모르겠어서 찾아봄
				if((b-a) == (c-b)) {
					count += 1;
				}
				
			}

		}
		System.out.println(count);
	}

}
