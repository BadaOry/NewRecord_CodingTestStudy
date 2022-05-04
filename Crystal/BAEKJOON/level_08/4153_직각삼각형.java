package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// [ 설계 ]
		// 1. 0 0 0 나올때까지 입력받고
		// 2. for 문 돌려서 a*a + b*b = c*c 인지 확인
		
		while(true) {
			
			String numbers = br.readLine();
			
			if(numbers.equals("0 0 0")) {
				
				break;
			}
			else {
				StringTokenizer st = new StringTokenizer(numbers," ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				// 이 if else 문을 더 간단하게 줄일 수 있음
				if(a >= b && a >= c) {
					
					if(b * b + c * c == a * a) {
						
						sb.append("right").append('\n');
					}
					else {
						
						sb.append("wrong").append('\n');
					}
				}
				else if(b >= a && b >= c) {
					
					if(a * a + c * c == b * b) {
						
						sb.append("right").append('\n');
					}
					else {
						
						sb.append("wrong").append('\n');
					}
				}
				else if(c >= a && c >= b) {
					
					if(a * a + b * b == c * c) {
						
						sb.append("right").append('\n');
					}
					else {
						
						sb.append("wrong").append('\n');
					}
				}
				

			}
			
		}
		
		System.out.println(sb);
		
		// 도전 횟수 : 2
		// [ cause 1 ] 예제 입출력 똑같이 잘나오는데 틀렸다고 함
		//             ▷ 아마 a, b, c 의 크기 순서가 다를 때를 고려하지 않아서 인듯 함 (귀찮)
		// [ 클린 코드 버전 ] https://st-lab.tistory.com/88
		//                ▶ 역시 어느놈이 제일 긴 지를 체크 안해서 그런것이었다
	}	

}

