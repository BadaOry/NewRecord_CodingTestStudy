package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 10. 1316_그룹 단어 체커 (上)_Algo
	/*
	 	시간 제한 : 2초 / 메모리 제한 : 128MB
	 	
	 	그룹 단어란 
	 	단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
	 	(ccazzzzbb, kin)
	 	
		첫째 줄에 단어의 개수 N(N<= 100)
		둘째 줄부터 N개의 줄에 단어가 들어온다.
		(단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.)
		
		단어 N개를 입력으로 받아(한줄에 하나씩) 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		
		=> 참고 사이트	 : https://st-lab.tistory.com/69
		
			1. 그룹단어를 체크할 코드 작성을 못함..
			2. 배열을 사용하려고 했음 		
				=> 별도 함수내에서 입력하도록 하면 배열 없이도 가능
				
			=> 알고리즘 이해가 갈랑말랑...
				* boolean배열 사용법 숙지하기!!
			

	 */

// ===================================================================================================================		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 단어의 개수 N
	int N = Integer.parseInt(br.readLine());
	// 단어를 저장할 배열 생성
	String[] arr = new String[N];
	int count  = 0;
	
	// 단어의 개수(N)만큼 배열에 단어 입력
	for(int i = 0; i < N; i++) {
		arr[i] = br.readLine();
	}
	
	// 각 단어가 그릅 단어인지 체크하는 코드
	for(int i = 0; i < N; i++) {
		if(check(arr[i]) == true) {
			count++;
		}
	}
	
	System.out.println(count);	// 시간 = 124ms
	
// ===================================================================================================================	
	
	}
	
	public static boolean check(String arr) {
		
		// 26개의 알파벳을 체크 할 길이 26의 boolean 배열을 선언
		// default값 = false
		boolean[] check = new boolean[26];
		
		// 앞선 문자와 연속되는지 판별하기 위한 변수
		int prev = 0;
		
		for(int i = 0; i < arr.length(); i++) {
			
			int now = arr.charAt(i); // i 번째 문자 저장(현재문자)
			
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if(prev != now) {
				
				// 해당 문자가 처음 나오는 경우(false => true)
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now; // 다음 턴을 위해 prev도 바꿔준다.
				}
				// 해당 문자가 이미 나온 적이 있는 경우(그룹 단어가 아니게 된다)
				else {
					
					return false; // 함수 종료
					
				}
			} 
			
			// 앞선 문자와 i번째 문자가 같다면?(연속된 문자)
			// else문은 안적어도 됨
			else {
				continue;
			}
			
		}
		
		return true;
	}

}
