package com.kh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class ArithmeticFirst {

	public void question1() {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int result = 0;

		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);

		if (B >= C) {
			System.out.println(-1);
		} else {
			result = A / (C - B);
			System.out.println(result + 1);
		}

		// for문으로 돌리다가 21억에서 도저히 답이 안나와서 변경함
//		System.out.println(A+" "+B+" "+C);	
//		for(int i=1;i<2100000000;i++) {
//			int sell = C * i;
//			if((A+(B*i))<sell) {
//				result = i;
//				break;
//			}else {
//				result=-1; 
//				continue;
//			}
//		}
//		
//		System.out.println(result);	
	}

	// 벌집
	public void question2() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int floor = 1;
		int count = 1;
		int tmp = 1;

		while (true) {
			if (floor >= num) {
				break;
			}
			tmp = 6 * (count++);
			floor += tmp;
		}
		System.out.println(count);

	}

	// 분수찾기
	public void question3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int line = 0;

		// 1. 입력받은 num이 몇 번째 라인에 있는지 찾기(등차수열)
		while (cnt < num) {
			line++;
			cnt = line * (line + 1) / 2;
		}
		// System.out.println(line);

		// 2. 라인이 짝수라면 분자↑ 분모↓, 홀수라면 분자↓ 분모↑
		if (line % 2 == 0) {
			int top = line - (cnt - num);
			int bottom = 1 + (cnt - num);

			System.out.println(top + "/" + bottom);
		} else {
			int top = 1 + (cnt - num);
			int bottom = line - (cnt - num);

			System.out.println(top + "/" + bottom);
		}

	}

	// 달팽이는 올라가고 싶다.(시간초과때문에 bf로 바꿈)
	public void question4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());

			int day = (V - B) / (A - B);
			if ((V - B) % (A - B) != 0) {
				day++;
			}
			System.out.println(day);

		} catch (IOException e) {
			e.printStackTrace();
		}

//		시간초과1
//		int result = A - B;
//		int count = 1;
//
//		while (result < V && V < 1000000001) {
//			result = result + A;
//
//			if (result != V) {
//				result -= B;
//			}
//
//			count++;
//		}
//		System.out.println(count);

//		시간초과2
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int V = sc.nextInt();
//		
//		int day = (V - B) / (A - B);
//        
//		if ((V - B) % (A - B) != 0) {
//			day++;
//		}
//		System.out.println(day);
//		
	}

	// ACM 호텔
	public void question5() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int H = 0;
		int W = 0;
		int N = 0;

		for (int i = 0; i < num; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();

			int floor = N % H, room = N / H + 1;

			if (N % H == 0) {
				room = N / H;
				floor = H;
			}
			System.out.println(floor * 100 + room);

//			for (int j = 0; j < H; j++) {
//				for (int k = 0; k < W; k++) {
//					room[j][k] = roomNum++;
//				}
//			}
//			
//			
//			for(int l=0;l<H;l++) {
//				for(int j=0;j<W;j++) {
//					System.out.print(room[l][j]+" ");
//				}
//			}

		}

	}

	// 부녀회장
	public void question6() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[][] apart = new int[15][14];

		for (int i = 0; i < 14; i++) {
			apart[0][i] = i + 1;
		}

		for (int i = 1; i <= 14; i++) {
			for (int j = 0; j < 14; j++) {
				for (int q = 0; q <= j; q++) {
					apart[i][j] += apart[i - 1][q];
				}
			}
		}

		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			System.out.println(apart[k][n - 1]);
		}
//		Scanner sc = new Scanner(System.in);
//		int testCase = sc.nextInt();
//		int[][] apt = new int[15][15];
//		int result[] = new int[testCase];
//
//		for (int i = 0; i < 15; i++) {
//			apt[i][1] = 1;
//			apt[0][i] = i;
//		}
//
//		for (int i = 0; i < testCase; i++) {
//			int floor = sc.nextInt();
//			int room = sc.nextInt();
//
//			for (int j = 1; j <= floor; j++) {
//				for (int k = 2; k <= room; k++) {
//					apt[j][k] = apt[j][k - 1] + apt[j - 1][k];
//					result[i] = apt[j][k];
//				}
//			}
//		}
//		for(int i:result) {
//			System.out.println(i);
//		}
	}

	// 설탕 배달
	public void question7() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		int left = 0;
		int n = 0;

		if (num % 5 == 0) {
			System.out.println(num / 5);
		} else if (num % 5 != 0 && (num % 5) % 3 == 0) {
			result = num / 5;
			left = num % 5;

			if (left % 3 == 0) {
				result += left / 3;
				System.out.println(result);
			} else {
				System.out.println(-1);
			}

		} else if (num % 5 != 0 && (num % 5) % 3 != 0) {
			while (true) {
				if (num % 5 == 0) {
					System.out.println(num / 5 + n);
					break;
				} else if (num < 0) {
					System.out.println(-1);
					break;
				}
				num = num - 3;
				n++;
			}
		}

	}
	
	// 큰 수 A+B(모든 문제가 이렇게 쉽다면 얼마나 좋을까.. )
	public void question8() {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();

		System.out.println(A.add(B));
	}

}
