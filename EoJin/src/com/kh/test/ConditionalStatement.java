package com.kh.test;

import java.util.Scanner;

public class ConditionalStatement {
	Scanner sc = new Scanner(System.in);

	// 조건문

	public void question1() {
		// (조건문)1번 문제
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
	}

	public void question2() {
		// (조건문)2번 문제
		int A = sc.nextInt();
		if (A >= 90 || A >= 100) {
			System.out.println("A");
		} else if (A >= 80 && A <= 89) {
			System.out.println("B");
		} else if (A >= 70 && A <= 79) {
			System.out.println("C");
		} else if (A >= 60 && A <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public void question3() {
		// (조건문)3번 문제
		int A = sc.nextInt();

		if ((A % 4 == 0 && A % 100 != 0) || A % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void question4() {
		// (조건문)4번 문제
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		if (X > 0 && Y > 0) {
			System.out.println("1");
		} else if (X < 0 && Y > 0) {
			System.out.println("2");
		} else if (X < 0 && Y < 0) {
			System.out.println("3");
		} else if (X > 0 && Y < 0) {
			System.out.println("4");
		}
	}

	public void question5() {
		// (조건문)5번 문제
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M = sc.nextInt();

		// 1. 시간을 분으로 변환
		int tm = T * 60;

		// 2. 분으로 된 시간을 더하고 거기에 -45분을 한다.
		int MinTime = (tm + M) - 45;

		int SetTime;
		int SetMinute;

		// 3. 분을 다시 시간으로 변환
		if (MinTime < 0) {
			SetTime = 23;
			SetMinute = 60 + MinTime;
		} else {
			SetTime = MinTime / 60;
			SetMinute = MinTime % 60;
		}
		System.out.println(SetTime + " " + SetMinute);
	}

	public void question6() {
		// (조건문)6번 문제
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M = sc.nextInt();
		int cookTime = sc.nextInt();

		int tm = T * 60;
		int TotalMin = (tm + M) + cookTime;

		int SetTime;
		int SetMinute;

		// 3. 분을 다시 시간으로 변환
		if (TotalMin >= 1440) {
			SetMinute = TotalMin % 60;
			SetTime = (TotalMin / 60) - 24;
		} else {
			SetTime = TotalMin / 60;
			SetMinute = TotalMin % 60;
		}
		System.out.println(SetTime + " " + SetMinute);
	}

	public void question7() {
		// (조건문)7번 문제
		Scanner sc = new Scanner(System.in);
		Integer Dice1 = sc.nextInt();
		Integer Dice2 = sc.nextInt();
		Integer Dice3 = sc.nextInt();

		int num = 0;

		if ((Dice1.equals(Dice2)) && Dice3.equals(Dice1)) {
			num = 10000 + (Dice1 * 1000);

		} else if (Dice1.equals(Dice3) || Dice2.equals(Dice3) || Dice1.equals(Dice2)) {

			if (Dice1.equals(Dice3)) {
				num = 1000 + (Dice1 * 100);
			} else if (Dice2.equals(Dice3)) {
				num = 1000 + (Dice2 * 100);
			} else if (Dice1.equals(Dice2)) {
				num = 1000 + (Dice1 * 100);
			}

		} else {
			int[] arr = new int[] { Dice1, Dice2, Dice3 };
			int max = arr[0];

			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			num = max * 100;
		}
		System.out.println(num);
	}

}
