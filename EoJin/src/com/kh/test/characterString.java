package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	
	public void question3() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] location = new int[26];
		
		for(int k=0;k<location.length;k++) {
			location[k] = -1;
		}
		
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<word.length();j++) {
				if(alphabet[i]==word.charAt(j) && location[i]==-1) {
					location[i] = j;
				}
			}
			System.out.print(location[i]+" ");
		}
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
	
	public void question6() {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String word[] = sentence.split(" ");
		int count = 0;
		
//		Arrays.stream(word).forEach((s)->System.out.print(s+" "));	
//		System.out.println(word.length);
		
		for(int i=0;i<word.length;i++) {
			if(!word[i].equals("")) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	// 답은 잘 나오는데 채점 시 런타임 에러 뜸. 나중에 다시 확인 필요
	public void question7() {
		Scanner sc = new Scanner(System.in);
		String[] num1 = sc.nextLine().split(""); 
		String[] num2 = sc.nextLine().split("");
		String pre1 = num1[0];
		String pre2 = num2[0];
		int num = 3;
		
		for(int i=0;i<num1.length;i++) {	
			num1[i] = num1[num-1];
			num--;
		}
		num1[2] = pre1;
		num = 3;
		
		for(int i=0;i<num2.length;i++) {	
			num2[i] = num2[num-1];
			num--;
		}
		num2[2] = pre2;
		
		String N1 = "";
		String N2 = "";
		
		for(String str:num1) {
			N1+=str;
		}
		
		for(String str:num2) {
			N2+=str;
		}
		
		int aNum = Integer.parseInt(N1);
		int bNum = Integer.parseInt(N2);
		
		System.out.println((aNum>bNum)? aNum: bNum);

		
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
