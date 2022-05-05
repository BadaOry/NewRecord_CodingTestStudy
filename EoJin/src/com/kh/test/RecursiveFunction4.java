package com.kh.test;

import java.util.Scanner;

public class RecursiveFunction4 {
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		arr = new char[num][num];
		star(0, 0, num, false);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<num;i++) {
			for(int j = 0;j<num;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	static void star(int x, int y, int N, boolean blank) {

}
