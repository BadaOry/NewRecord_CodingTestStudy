package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 02. 2562_최댓값 (上)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	9개의 서로 다른 자연수가 주어질 때, 
	 	이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하기
	 	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력
	 	=> 1. 코드가 너무 더럽고 복잡해서 검색함...
	 	   2. 최댓값은 구할 수 있지만 위치를 구하는게 안됨..(bw를 사용하여 출력하고 싶기 때문에)
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] s =  new int[9];
		
		// 배열에 int형 값 주입
		for(int i = 0; i <s.length; i++) {
			s[i] = Integer.parseInt(br.readLine());
		}
		
		int max =0;		// 최댓값
		int index =0;	
		int count = 0;	// 위치값
		
		// 향상된 for문 사용
		for(int value : s) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
		// bw를 사용한 출력 => 메모리 더 잡아먹고 시간은 똑같음(124ms)
		bw.write(Integer.toString(max)+"\n");
		bw.write(Integer.toString(index));
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}
