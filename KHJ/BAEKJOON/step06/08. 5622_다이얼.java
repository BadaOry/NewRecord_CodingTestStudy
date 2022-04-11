package BAEKJOON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 08. 5622_다이얼
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		다이얼에서 
		숫자 1을 걸려면 총 2초가 필요하다.
		숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고(돌아가는 시간은 제외한다.)
		한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
		
		2번부터 각 숫자에 해당하는 문자가 있다.
		2 : ABC  |	3 : DEF  |	4 : GHI
		5 : JKL  |  6 : MNO  |  7 : PQRS
		8 : TUV  |  9 : WXYZ |  0 :  
		
		단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		ex)
			WA => 13초
			UNUCIC => 36초
		
		
		=> 참고 사이트 : https://st-lab.tistory.com/67
		
			1. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
			 	 = 이게 무슨 말임..? => 그냥 내가 알아서 예시보고 생각함 ㅋㅋㅋㅋ
			 	 
			2. 코드가 너무 더러운데..?
				=> if-else문을 써도 상관은 없지만 가독성을 생각하면 switch-case로 작성하는 것이 좋다 
				= switch-case 사용법도 기억할 것
	 */

			
// ===================================================================================================================		
	
	/*
	 	내 풀이(if-else + 배열사용)
	 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시간 : n번다이얼 + 1 = n+1초 (1번 제외)
		
		// 문자열 입력 : s
		String s = br.readLine();
//		System.out.println("입력받은 문자열의 글자수 : " + s.length());
		
		// 최소시간 t
		int t = 0;
		
	// ---------------------------------------------
	 // 배열을 사용하지 않고 바로 s.charAt(i)을 사용해도 됐을듯..	
		char[] arr = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
	// ---------------------------------------------	
		
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < s.length(); i++) {
			
			if(arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C') {
				t += 3;
			} else if(arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F') {
				t += 4;
			} else if(arr[i] == 'G' || arr[i] == 'H' || arr[i] == 'I') {
				t += 5;
			} else if(arr[i] == 'J' || arr[i] == 'K' || arr[i] == 'L') {
				t += 6;
			} else if(arr[i] == 'M' || arr[i] == 'N' || arr[i] == 'O') {
				t += 7;
			} else if(arr[i] == 'P' || arr[i] == 'Q' || arr[i] == 'R' || arr[i] == 'S') {
				t += 8;
			} else if(arr[i] == 'T' || arr[i] == 'U' || arr[i] == 'V') {
				t += 9;
			} else if(arr[i] == 'W' || arr[i] == 'X' || arr[i] == 'Y' || arr[i] == 'Z') {
				t += 10;
			}
			
		}
//		System.out.println("최소 시간 : " + t);
		System.out.println(t); // 시간 = 124ms
		
// ===================================================================================================================	
	
	/*
	 	참고 사이트(switch-case + 배열사용X)
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int count = 0;
		int k = s.length();
		
		for(int i = 0; i < k; i++) {
			
			switch (s.charAt(i)) {
			
			case 'A' : case 'B' : case 'C' :
				count += 3;
				break;

			case 'D' : case 'E' : case 'F' :
				count += 4;
				break;
				
			case 'G' : case 'H' : case 'I' :
				count += 5;
				break;
				
			case 'J' : case 'K' : case 'L' :
				count += 6;
				break;

			case 'M' : case 'N' : case 'O' :
				count += 7;
				break;
				
			case 'P' : case 'Q' : case 'R' : case 'S' :
				count += 8;
				break;
				
			case 'T' : case 'U' : case 'V' :
				count += 9;
				break;

			case 'W' : case 'X' : case 'Y' : case 'Z' :
				count += 10;
				break;
				
			}
			
		}
		
		System.out.println(count); // 시간 = 200ms
	 */
		
	}

}
