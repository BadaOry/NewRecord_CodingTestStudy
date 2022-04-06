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
		
		// 1. 10818_최소, 최대
	/*
	 	시간 제한 : 1초
	 	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하기
	 	첫째 줄에 정수의 개수 N(1 <= N <= 1,000,000)
	 	둘째 줄에 N개의 정수를 공백으로 구분해서 주어진다.
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		// 오름차순을 사용하기 위해 int형 배열 선언 및 초기화
		int[] s =  new int[N];
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");;

		// 배열에 입력한 값을 인덱스에 따라 주입
		for(int i = 0; i < N; i++) {
			// 오름차순을 사용하기 위해 int형으로 형변환
			s[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬
		Arrays.sort(s);
		
		bw.write(s[0] + " " + s[N-1]);
		
		br.close();
		
		bw.flush();
		bw.close();		
		
	}
}
