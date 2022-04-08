package com.kh.baekjoon.step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class step7 {
	public void method1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			
			bw.write(String.valueOf((int)str.charAt(0)));
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int T = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < T; i++) {
				String[] arr = br.readLine().split(" ");
				
				int R = Integer.parseInt(arr[0]);
				String str = arr[1];
				
				for (int j = 0; j < str.length(); j++) {
					int count = 0;
					
					while(count < R) {
						bw.write(str.charAt(j));
						
						count++;
					}
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
	
	public void method8() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			int time = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int n = 0;
				
				if(ch >= 'A' && ch <= 'C') {
					n = 2;
				} else if(ch <= 'F') {
					n = 3;
				} else if(ch <= 'I') {
					n = 4;
				} else if(ch <= 'L') {
					n = 5;
				} else if(ch <= 'O') {
					n = 6;
				} else if(ch <= 'S') {
					n = 7;
				} else if(ch <= 'V') {
					n = 8;
				} else {
					n = 9;
				}
				
				time += n + 1;
			}
			
			bw.write(String.valueOf(time));
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
