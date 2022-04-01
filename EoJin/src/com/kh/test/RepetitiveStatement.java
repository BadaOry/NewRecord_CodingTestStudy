package com.kh.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class RepetitiveStatement {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 반복문

	// (반복문)1번 문제
	public void question1() {
		int num = sc.nextInt();

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : arr) {
			System.out.println(num + " * " + i + " = " + num * arr[i - 1]);
		}
	}

	// (반복문)2번 문제
	public void question2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int loop = Integer.parseInt(br.readLine());

			for (int i = 0; i < loop; i++) {
				String[] num = br.readLine().split(" ");

				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);

				System.out.println(num1 + num2);
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// (반복문)3번 문제
	public void question3() {
		int num = sc.nextInt();
		int result = num;

		for (int i = 0; i < num; i++) {
			result += i;
		}
		System.out.println(result);
	}

	// (반복문)4번 문제
	public void question4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int loop = Integer.parseInt(br.readLine());

			for (int i = 0; i < loop; i++) {
				String[] num = br.readLine().split(" ");

				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);

				bw.write(num1 + num2 + "\n");
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// (반복문)5번 문제
	public void question5() {
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}
	}

	// (반복문)6번 문제
	public void question6() {
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(num - i);
		}
	}

	// (반복문)7번 문제
	public void question7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int loop = Integer.parseInt(br.readLine());

			for (int i = 0; i < loop; i++) {
				String[] num = br.readLine().split(" ");

				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);
				int result = num1 + num2;

				bw.write("Case #" + (i + 1) + ": " + result + "\n");
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// (반복문)8번 문제
	public void question8() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int loop = Integer.parseInt(br.readLine());

			for (int i = 0; i < loop; i++) {
				String[] num = br.readLine().split(" ");

				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);
				int result = num1 + num2;

				bw.write("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = " + result + "\n");
			}
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// (반복문)9번 문제
	public void question9() {
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			String star = "*";

			System.out.println(star.repeat(i + 1));
		}
	}

	// (반복문)10번 문제
	public void question10() {
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			String star = "*";
			String space = " ";

			System.out.println(space.repeat(num - (i + 1)) + star.repeat(i + 1));
		}
	}

	// (반복문)11번 문제 : 남들은 이게 쉬웠다는데 난 여기서 삽질함.
	// 이유1 : BufferedReader로 한 줄 입력 후 처리하려 했으나 런타임 에러
	// 이유2 : 에러가 혹시 출력 시 뒤쪽 공백문자 때문인가 싶어서 Trim으로 처리하다가 또 시간 소요(아니었음)
	// 이유3 : 결국 지우고 sc로 다 바꾸니 된다.. 속도는 빠를지 모르겠는데 br은 진짜..ㅠ.ㅠ
	public void question11() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] strArr = new int[N];

		for (int i = 0; i < N; i++) {
			strArr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			if (strArr[i] < X) {
				System.out.print(strArr[i] + " ");
			}
		}
	}

	// (반복문)12번 문제
	public void question12() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num1;
			int num2;

			while (true) {
				String[] arr = br.readLine().split(" ");
				num1 = Integer.parseInt(arr[0]);
				num2 = Integer.parseInt(arr[1]);

				if (num1 == 0 && num1 == num2) {
					break;
				} else {
					System.out.println(num1 + num2);
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// (반복문)13번 문제
	// 문제가 종료되는 조건을 몰라서 검색했음. (EOF)
	public void question13() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}

		// br로 어떻게든 해보려했던 흔적
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			int num1 = 0;
//			int num2 = 0;
//			String str = br.readLine();
//
//			while (str != null) {
//				String[] arr = str.split(" ");
//				num1 = Integer.parseInt(arr[0]);
//				num2 = Integer.parseInt(arr[1]);
//			}
//			System.out.println(num1 + num2);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	// (반복문)14번 문제
	public void question14() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int result2 = 1;
		int num1;
		int num2;

		Integer num = sc.nextInt();
		String str = num.toString();

		if (num < 10) {
			num1 = 0;
			num2 = Integer.parseInt(str);
		} else {
			String[] str2 = str.split("");
			num1 = Integer.parseInt(str2[0]);
			num2 = Integer.parseInt(str2[1]);
		}

//		System.out.println("처음 숫자로 변환 : " + num1 + " " + num2);

		do {

			result = num1 + num2;

			if (result >= 10) {
				String[] a = Integer.toString(result).split("");
				result = Integer.parseInt(a[1]);
//				System.out.println("result값 : " + result);
			}

			String cal = (Integer.toString(num2)) + (Integer.toString(result));
//			System.out.println("2차 더한 값 : " + cal);

			if (Integer.parseInt(cal) == num) {
				break;
			} else {
				String[] cal2 = cal.split("");
				num1 = Integer.parseInt(cal2[0]);
				num2 = Integer.parseInt(cal2[1]);
//				System.out.println(num1 + "   " + num2);

				result2 += 1;
				continue;
			}

		} while (true);

		System.out.println(result2);
	}

}
