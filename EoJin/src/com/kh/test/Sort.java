package com.kh.test;

import java.util.Scanner;

public class Sort {
	
	// 수 정렬하기
	public void question1() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int temp;
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void question2() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int temp;
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
