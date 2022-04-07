package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 05. 1546_평균
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
		첫째 줄에 시험 본 과목의 개수 N				3
		둘째 줄에 세준이의 현재 성적 점수들이 입력될 때	40 80 60
		성적 중 최댓값(M)을 고르고
		모든 점수를 <점수/M*100>으로 고쳤을 때
		새로운 평균을 구하시오 
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시험 본 과목의 개수 N
		int N = Integer.parseInt(br.readLine());
		// 성적 중 최댓값 M
		double M = 0;
		
		// 과목의 개수(N)를 기반으로 하는 크기를 가진 배열 생성
		double[] arr = new double[N];
		
		// 둘째 줄에 공백을 구분자로 한번에 입력하기 위해 StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 배열에 현재 성적들 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 최대값 찾기
		Arrays.sort(arr); // 오름차순 정렬		
		M = arr[N-1];
		
//		System.out.println("최댓값 M : " + M);
		
		// 점수 변경 : (현재점수/M)*100
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]/M) * 100;
		}
		
//		System.out.println(Arrays.toString(arr));
		
		double eva = 0;
		
		// 일단 변경된 점수를 모두 더하고
		for(int i = 0; i < arr.length; i++) {
			eva += + arr[i];
		}
		
		// 성적의 개수로 나누어 평균을 구한다.
		eva = eva/N;
		
		// String.format("%.나타낼 소수점 자리f", 값)을 사용해 
		// 소수 n번째 자리까지 출력 지정 가능
		System.out.println(eva); // 시간 : 124ms
	}
}
