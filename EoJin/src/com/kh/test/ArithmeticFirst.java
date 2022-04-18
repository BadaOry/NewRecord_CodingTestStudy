package com.kh.test;

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

	// 아니 여기선 답 나오는데 백준은 왜 안나오는건데..?? 뭔가 틀렸나?
	public void question6() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[][] apt = new int[15][15];
		int result[] = new int[testCase];

		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}

		for (int i = 0; i < testCase; i++) {
			int floor = sc.nextInt();
			int room = sc.nextInt();

			for (int j = 1; j <= floor; j++) {
				for (int k = 2; k <= room; k++) {
					apt[j][k] = apt[j][k - 1] + apt[j - 1][k];
					result[i] = apt[j][k];
				}
			}
		}
		for(int i:result) {
			System.out.println(i);
		}
	}

}
