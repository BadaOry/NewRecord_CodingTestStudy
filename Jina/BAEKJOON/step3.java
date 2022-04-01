package com.kh.baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class step3 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {			
			int A = Integer.parseInt(sc.next());
			int B = Integer.parseInt(sc.next());
			
			System.out.println(A + B);
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public void method4() {
		// Scanner, System.out.print 대신 BufferedReader, BufferedWriter 사용(입출력 속도 향상)
		// https://st-lab.tistory.com/16
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < T; i++) {
				String[] arr = br.readLine().split(" ");
				
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				bw.write(String.valueOf(A + B));
				bw.newLine();
			}			
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
					
	}
	
	public void method5() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= N; i++) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method6() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < N; i++) {
				bw.write(String.valueOf(N - i));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= T; i++) {

				String[] arr = br.readLine().split(" ");
				
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				bw.write("Case #" + String.valueOf(i) + ": " + String.valueOf(A + B));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void method8() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= T; i++) {
				String[] arr = br.readLine().split(" ");
				
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				bw.write("Case #" + String.valueOf(i) + ": " + arr[0] + " + " + arr[1] + " = " + String.valueOf(A + B));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void method9() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= N; i++) {
				for(int n = 1; n <= i; n++) {
					bw.write("*");
				}
				
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method10() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= N; i++) {
				
				for(int x = 1; x <= (N - i); x++) {
					bw.write(" "); 
				}
				
				for(int y = 1; y <= i; y++) {	
					bw.write("*"); 
				}
				
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method11() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] arr1 = br.readLine().split(" ");
			
			int N = Integer.parseInt(arr1[0]);
			int X = Integer.parseInt(arr1[1]);
			
			String[] arr2 = br.readLine().split(" ");
			
			for(int i = 0; i < arr2.length; i++) {
				int el = Integer.parseInt(arr2[i]);
				
				if(el < X) {
					bw.write(String.valueOf(el) + " ");
				}
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void method12() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			while(true) {			
				String[] arr = br.readLine().split(" ");
				
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);				
				
				if(A == 0 && B == 0) {
					br.close();
					
					break;
				}
				
				bw.write(String.valueOf(A + B));
				bw.newLine();
			}		
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// 복습 필요
	public void method13() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		String[] arr;
		
		try {
			while((str = br.readLine()) != null) {
				arr = str.split(" ");
				
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				bw.write(String.valueOf(A + B));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method14() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String N = br.readLine();
			int Number = Integer.parseInt(N);
			
			int x;
			int y;
			
			int num = 0;
			int count = 1;
			
			while(true) { // 26
				
				if(Number < 10) {
					x = 0;
					y = Number % 10;
				} else {
					x = Number / 10; // 2
					y = Number % 10; // 6
				}
				
				int first = y; // 6
				int second = (x + y) % 10; // 8
				
				num = first * 10 + second; // 68, 84, 42, 26
				
				if(Integer.parseInt(N) == num) {
					
					bw.write(String.valueOf(count));
					
					break;
				} else {
					Number = num;
					
					count++;
					
					continue;
				}
				
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
