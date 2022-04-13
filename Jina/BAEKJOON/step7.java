package com.kh.baekjoon.step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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
	
	public void method2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			String number = br.readLine();
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				sum += Character.getNumericValue(number.charAt(i));
			}
			
			bw.write(String.valueOf(sum));
			bw.flush();			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			char[] alphabets = new char[('z' - 'a' + 1)];
			char a = 'a';
			String[] str = br.readLine().split("");
			
			for (int i = 0; i < alphabets.length; i++) {
				alphabets[i] = a;
				
				for(int j = 0; j < str.length; j++) {
					if(alphabets[i] == str[j].charAt(0)) {
						bw.write(String.valueOf(j) + " ");
						
						break;
					} else {
						if(j == str.length - 1) {
							bw.write(String.valueOf(-1) + " ");
						}
					}
				}				
				
				a++;				
			}
			
			bw.flush();	
			
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
	
	public void method5() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine().toUpperCase();
			int[] alphabets = new int['Z' - 'A' + 1];
			char A = 'A';
			int maxIndex = 0;
			int count = 0;
			
			for (int i = 0; i < alphabets.length; i++) {							
				
				for (int j = 0; j < str.length(); j++) {
					if(str.charAt(j) == A) {
						alphabets[i]++; 
					}					
				}
				
				if(alphabets[i] > alphabets[maxIndex]) {
					maxIndex = i;
				} 
				
				A++;
			}
			
			for (int i = 0; i < alphabets.length; i++) {
				if (alphabets[i] == alphabets[maxIndex]) {
					count++;
				}
			}
			
			if(count > 1) {
				bw.write("?");
			} else {				
				bw.write(String.valueOf((char)(maxIndex + 65)));
			}
			
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void method6() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] words = br.readLine().split(" ");
			int count = words.length;
			
			for (int i = 0; i < words.length; i++) {
				if(words[i].trim().isEmpty()) {
					count--;
				}
			}
			
			bw.write(String.valueOf(count));
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] numbers = br.readLine().split(" ");
			
			int[] reversedNumbers = new int[2];
			
			for (int i = 0; i < numbers.length; i++) {
				String number = numbers[i]; // "734"
				String reversed = "";
				
				for (int j = 0; j < number.length(); j++) { 
					reversed += number.charAt(number.length() - 1 - j); // 4 3 7
				}
				
				reversedNumbers[i] = Integer.parseInt(reversed);
			}
			
			Arrays.sort(reversedNumbers);
			
			bw.write(String.valueOf(reversedNumbers[1]));
			bw.flush();			
			
		} catch (IOException e) {
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
	
	public void method9() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			String[] croatians = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
			int count = 0;
			
			for (int i = 1; i < str.length(); i++) {
				String alphabet = String.valueOf(str.charAt(i - 1)) + String.valueOf(str.charAt(i));

				if(alphabet.equals("dz") && i != str.length() - 1) { 
					
					if(str.charAt(i + 1) == '=') {
						count = count + 2;
						i++;
						
						continue;
					}					
				}
				
				if(Arrays.asList(croatians).contains(alphabet)) { 
					count++; 
				};
			}
			
			bw.write(String.valueOf(str.length() - count));
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
