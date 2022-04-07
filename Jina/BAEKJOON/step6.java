package com.kh.baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class step6 {
	
	public void method1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			String[] arr = br.readLine().split(" ");
			List<Integer> list = new ArrayList<>();
			
			for (String str : arr) {
				list.add(Integer.parseInt(str));
			}
			
			list.sort(Comparator.naturalOrder());
			
			bw.write(String.valueOf(list.get(0)) + " " + String.valueOf(list.get(N-1)));
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	// 오답
	public void method2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {		
			int[] arr = new int[9];
			
			for(int i = 0; i < 9; i++) {			
				arr[i] = Integer.parseInt(br.readLine());			
			}
			int[] copy = Arrays.copyOf(arr, 9);
			
			Arrays.sort(arr);
			
			int max = arr[8];
			
			int index = Arrays.binarySearch(copy, max); // binarySearch는 sort 후에만 사용 가능, sort 전에 사용 시 undefined
			
			bw.write(String.valueOf(max));
			bw.newLine();
			bw.write(String.valueOf(index));
			
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void method2Retry() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		try {
			for(int i = 0; i < 9; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				
				if(arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			
			bw.write(String.valueOf(max));
			bw.newLine();
			bw.write(String.valueOf(index + 1));
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			
			String result = String.valueOf(A * B * C);
			
			int[] arr = new int[result.length()];
			
			for(int i = 0; i < result.length(); i++) {				
				arr[i] = result.charAt(i) - 48;
			}
			
			for(int n = 0; n < 10; n++) {
				int count = 0;
				
				for (int i : arr) {
					if(i == n) {
						count++;
					}
				}
				
				bw.write(String.valueOf(count));
				bw.newLine();
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[42]; 
		int rem = 0;
		int count = 0;
		
		try {
			for(int i = 0; i < 10; i++) {
				int N = Integer.parseInt(br.readLine());
				
				rem = N % 42;
				
				arr[rem]++;
			}
			
			for (int i : arr) {
				if(i != 0) {
					count++;
				}
			}
			
			bw.write(String.valueOf(count));
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void method5() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {			
			int max = 0;			
			int sum = 0;
			
			int N = Integer.parseInt(br.readLine());
			
			String[] arr = new String[N];
			int[] scores = new int[N];
			
			arr = br.readLine().split(" ");
			
			for (int i = 0; i < arr.length; i++) {
				scores[i] = Integer.parseInt(arr[i]);
			}
			
			Arrays.sort(scores);
			
			max = scores[N-1];
			
			for (int score : scores) {
				sum += score;
			}
			
			double result = ((double)sum / max * 100) / N;
			
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
			br.close();
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void method6() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			String[] result;
			int[] score;
			
			for (int i = 0; i < N; i++) {				
				int sum = 0;
				result = br.readLine().split("");
				
				score = new int[result.length];
				
				for (int j = 0; j < result.length; j++) {
					if(j == 0) {
						if(result[j].equals("O")) {
							score[j] = 1;
						} else {
							score[j] = 0;
						}
					} else {
						if(result[j].equals("O")) {
							score[j] = score[j-1] + 1;
						} else {
							score[j] = 0;
						}
					}
				}
				
				for (int n : score) {
					sum += n;
				}
				
				bw.write(String.valueOf(sum));
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
			int C = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < C; i++) {
				String[] arr = br.readLine().split(" ");
				
				int N = Integer.parseInt(arr[0]);
				int sum = 0;
				double avg = 0;
				
				for (int j = 1; j < arr.length; j++) {
					sum += Integer.parseInt(arr[j]);
				}
				
				avg = (double)sum / N;
				
				int count = 0;
				
				for (int j = 1; j < arr.length; j++) {
					if(Integer.parseInt(arr[j]) > avg) {
						count++;
					}
				}
				
				double result = (double)count / N;
				
				String.format("%.3f", result * 100);
				
				bw.write(String.format("%.3f", result * 100) + "%");
				bw.newLine();				
			}
			
			br.close();
			bw.flush();
			bw.close();			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
