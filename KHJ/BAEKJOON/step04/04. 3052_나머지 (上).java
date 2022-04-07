package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 04. 3052_나머지 (上)
	/*
	 	시간 제한 : 1초 / 메모리 제한 : 128MB
	 	
		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		그 다음 서로 다른 값이 몇 개 있는지 출력해라
		(첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다.)
		
		=> 참고 사이트 : https://st-lab.tistory.com/46
		   배열방법으로 생각했으나 boolean으로 할 생각을 못함..
		   HashSet은 생각도 못했음.. 기억하자
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		방법 1. 배열 사용
		
		// 나머지가 나올 수 있는 수는 0~41이므로 
		// 길이가 42인 boolean 배열 생성(boolean배열을 dafault값이 false)
		boolean[] arr = new boolean[42];
		// true로 변화한 배열값을 세기 위한 변수
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			// 입력받은 값의 나머지에 해당하는 인덱스를 true로 바꿔준다.
			arr[Integer.parseInt(br.readLine())%42] = true;
		}

		/* 
		 	for 반복문
		for(int i = 0; i < 10; i++) {
			if(arr[i] == true) {
				count++;
			}
		}
		 */

		// 향상된 for문
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count); // => 시간 : 124ms
		
// =============================================================================================
		
/*
		방법 2. Hashset 사용
		
		HashSet 사용(방법 2.)
			1. 중복되는 원소를 넣을 경우 하나만 저장(중복 허용X)
			2. Hashset은 순서 개념이 없다. 정렬을 하고 싶다면 리스트로 변환 후 정렬해야 한다.
 
 		HashSet.add() : HashSet에 저장하는 메소드이다.
 */
		// int형 값을 담을 수 있는 HashSet 생성
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			// 입력받은 값의 나미저 값을 HashSet에 저장
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		// 중복값은 저장되지 않으므로 HashSet.size()로 서로 다른 값이 몇 개 있는지 출력할 수 있다.
		// HashSet.size() : HashSet의 크기 = 저장되어 있는 원소의 크기
		System.out.println(h.size()); // => 시간 : 124ms
		
	}
}
