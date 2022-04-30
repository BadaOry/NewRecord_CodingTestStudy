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

	// 베르트랑 공준
	public void question5() {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[1000000];
		arr[0] = arr[1] = true;
		int count = 0;

		while (true) {
			int M = sc.nextInt();
			int N = M * 2;

			if (M == 0) {
				break;
			} else {
				for (int i = 2; i <= N; i++) {
					if (arr[i] == false) {
						if (i > M)
							count++;
						for (int j = i + i; j <= N; j += i)
							arr[j] = true;
					}
				}
				System.out.println(count);
				count = 0;
			}
		}
	}

	// 골드바흐의 추측
	public void question6() {
		Scanner sc = new Scanner(System.in);

		int zero = 0;
		int tNum = 0;

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			boolean[] arr = new boolean[n + 1];
			arr[0] = arr[1] = true;

			for (int j = 2; j <= n; j++) {
				if (arr[j] == false) {
					if (j > zero)
//						System.out.println(j);

						if (j + j == n) {
							System.out.println(j + " " + j);
							tNum = j;
							break;
						}

				}

				for (int k = j + j; k <= n; k += j)
					arr[k] = true;
			}

			if (tNum + tNum != n) {
				int a = n / 2;
				int b = n / 2;

				while (true) {

					// 두 파티션이 모두 소수일 경우
					if (!arr[a] && !arr[b]) {
						System.out.println(a + " " + b);
						break;
					}
					a--;
					b++;
				}
			}
		}

//			for(int l=0;l<arr.length;l++) {
//				int count = 0;
//				if(arr[l]==false) {
////					System.out.println(l);
//					
//					for(int o=0;o<arr.length;o++) {
//						if(arr[o]==false) {
//							if(l+o==n && l<o) {
//								System.out.println(l + " " + o);
//								break;
//							}
//						}
//					}
//					
//					
//				}
//			}

//			while (true) {
//				if (n % j == 0) {
//					n = n / j;
//					System.out.println(j);
//				} else if (n == 1) {
//					break;
//				} else {
//					i++;
//				}
//			}

	}

	// 직사각형에서 탈출
	public void question7() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int width = (w - x) < x ? (w - x) : x;
		int height = (h - y) < y ? (h - y) : y;

		if (width < height) {
			System.out.println(width);
		} else {
			System.out.println(height);
		}

	}

	// 네 번째 점
	public void question8() {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = 0;
		int y4 = 0;

		if (x1 == x2 && x1 != x3) {
			x4 = x3;
		} else if (x1 != x2 && x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}

		if (y1 == y2 && y1 != y3) {
			y4 = y3;
		} else if (y1 != y2 && y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}

		System.out.println("결과 : " + x4 + " " + y4);

	}

	
	// 직각삼각형
	public void question9() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			double x = Math.pow(sc.nextInt(), 2);
			double y = Math.pow(sc.nextInt(), 2);
			double z = Math.pow(sc.nextInt(), 2);

			if (x == y + z && x != 0) {
				System.out.println("right");
			} else if (y == x + z && y != 0) {
				System.out.println("right");
			} else if (z == x + y && z != 0) {
				System.out.println("right");
			} else if (x != 0 && y != 0 && z != 0) {
				System.out.println("wrong");
			}

			if (x == 0 && y == 0 && z == 0) {
				break;
			}
		}
	}

	// 택시 기하학
	public void question10() {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		// 유클리드 기하학에서의 원의 넓이(r의 제곱 * 𝜋)
		System.out.println(r * r * Math.PI);
		// 택시기하학(맨하튼 거리)에서의 원의 넓이(2 * r의 제곱)
		System.out.println(2 * r * r);
	}
	
	// 터렛
	public void question11() {
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt(); 
		
		for(int t=0; t<T; t++){ 
			int x[]=new int[3]; 
			int y[]=new int[3]; 
			int r[]=new int[3]; 
			for(int i=1; i<=2; i++){ 
				x[i] = sc.nextInt(); 
				y[i] = sc.nextInt(); 
				r[i] = sc.nextInt(); 	
			}
			double dotDistance = Math.sqrt(Math.pow(x[1]-x[2],2) + Math.pow(y[1]-y[2],2)); 
			int circleSum = r[1]+r[2]; 
		}

	}

}
