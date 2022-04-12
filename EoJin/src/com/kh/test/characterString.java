package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class characterString {

	public void question1() {
		Scanner sc = new Scanner(System.in);
		String chr = sc.nextLine();

		// getBytes()를 이용해 ASCII 출력
//		byte[] result = chr.getBytes(StandardCharsets.US_ASCII);
//		System.out.println(result[0]);

		// chars()를 이용해 ASCII 출력
		IntStream re = chr.chars();
		re.forEach(i -> System.out.println(i));
	}

	public void question2() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = sc.nextInt();
		sc.nextLine();
		String num = sc.nextLine();

		for (int i = 0; i < count; i++) {
			// 1. getNumericValue를 사용하여 정수변환
			int n = Character.getNumericValue(num.charAt(i));

			// 2. char에서 0(아스키코드 값 : 48)빼기
			// int n = num.charAt(i)-'0';
			sum += n;
		}
		System.out.println(sum);

	}

	public void question4() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		int repeat;
		String str;
		String result = "";

		for (int i = 0; i < testCase; i++) {
			str = sc.nextLine();
			String strArr[] = str.split(" ");

			repeat = Integer.parseInt(strArr[0]);
			String chr[] = strArr[1].split("");

			for (int j = 0; j < chr.length; j++) {
				result += chr[j].repeat(repeat);
			}
			System.out.println(result);
			result = "";
		}

	}

	// 문제는 해결되는데 자꾸 메모리초과뜸..... 뭐지??? sc때문인가 싶어서 br썼는데도 그런데..
	// map써서 그런가?? map때문에 그런거면 넘 쪼잔하다ㅠ 아님 uppercase때문?
	public void question5() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String upperStr = "";
		int num = 0;
		String str[];

		try {
			upperStr = br.readLine().toUpperCase();

		} catch (IOException e) {
			e.printStackTrace();
		}
		str = upperStr.split("");
		num = str.length;

		int count = 0;
		int max = 0;
		String maxstr = "";

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				if (str[i].equals(str[j])) {
					count++;
					map.put(str[i], count);
				}
			}
			count = 0;
		}

		for (String key : map.keySet()) {

			if (map.get(key) >= max) {
				if (map.get(key) == max) {
					maxstr = "?";
				} else {
					max = map.get(key);
					maxstr = key;
				}
			}
		}

		System.out.println(maxstr);

	}

	public void question8() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String str = sc.nextLine();
		char[] chr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			chr[i] = str.charAt(i);

			switch (chr[i]) {
			case 'A':
			case 'B':
			case 'C':
				sum += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				sum += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				sum += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				sum += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				sum += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				sum += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				sum += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				sum += 10;
				break;
			}

		}
		System.out.println(sum);

	}

	public void question9() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = str.length();
		int count = 0;

		for (int i = 0; i < num; i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'c':
				if (i < num - 1 && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
					count -= 1;
				}
				break;
			case 'd':
				if (i < num - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					count -= 1;
				} else if (i < num - 1 && str.charAt(i + 1) == '-') {
					count -= 1;
				}
				break;
			case 'l':
			case 'n':
				if (i < num - 1 && str.charAt(i + 1) == 'j') {
					count -= 1;
				}
				break;
			case 's':
			case 'z':
				if (i < num - 1 && str.charAt(i + 1) == '=') {
					count -= 1;
				}
				break;
			}

			count++;

		}
		System.out.println(count);
	}

}
