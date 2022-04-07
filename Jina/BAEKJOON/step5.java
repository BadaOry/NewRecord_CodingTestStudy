package com.kh.baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class step5 {
	
	public long sum(int[] a) {
		long sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		
		return sum;
	}
	
	public void method2() {
		int[] arr = new int[10000];
		
		for (int i = 1; i <= 10000; i++) {
			int n = i;
			String number = String.valueOf(i); 
			int[] temp = new int[number.length()];
			
			for (int j = 0; j < temp.length; j++) {
				temp[j] = number.charAt(j) - 48;
				
				n += temp[j];
			}
			
			arr[i-1] = n;
		}
		
		Arrays.sort(arr); // 2 4 6 8 10 11 12 13 14 15 16 17 18 19 21 ...
		
		for (int i = 1; i <= 10000; i++) {
			if(!(Arrays.binarySearch(arr, i) >= 0)) {
				System.out.println(i);
			}
		}	
	}
	
	public void method3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			
			for (int i = 1; i <= N; i++) {
				if(i < 100) {
					count++;
				} else {
					String number = String.valueOf(i);
					int[] arr = new int[number.length()];
					
					for (int j = 0; j < number.length(); j++) {
						arr[j] = number.charAt(j); // 100 -> 1 0 0, 123 -> 1 2 3
					}
					
					int idx = 1;
					
					while(idx < arr.length) {
						if(idx == arr.length - 1) {
							count++;
							
							break;
						}
						
						if(arr[idx] - arr[idx-1] != arr[idx+1] - arr[idx]) {
							break;
						}
						
						idx++;
					}
					
				}
			}
			
			bw.write(String.valueOf(count));
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
