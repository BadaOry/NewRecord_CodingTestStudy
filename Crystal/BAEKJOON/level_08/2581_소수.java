package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean prime[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		prime = new boolean[n + 1];
		get_prime();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = m; i <= n; i++) {
			
			if(prime[i] == false) {
				
				sum += i;
				
				if(min == Integer.MAX_VALUE) {
					
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			
			System.out.println(-1);
		}
		else {
			
			System.out.println(sum);
			System.out.println(min);
		}
		
		/* 오리 버전
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int min = 0;		// 최소 소수
		int sum = 0;		// 소수들의 합
		
		
		for(int i = m; i <= n; i++) {
			
			boolean isPrime = true;
			
			if(i == 1) {
				
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(i); j++) {
				
				if(i % j == 0) {
					
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 소수 중 최솟값 출력하는 것을 못함
		// [ 참고 ] https://st-lab.tistory.com/83
		*/		
	}
	
	public static void get_prime() {
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			
			if(prime[i]) {
				
				continue;
			}
			
			for(int j = i * i; j < prime.length; j += i) {
				
				prime[j] = true;
			}
		}
	}

}

