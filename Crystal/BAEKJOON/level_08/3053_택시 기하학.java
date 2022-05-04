package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(br.readLine());
		
		System.out.println(r * r * Math.PI);
		System.out.println(2 * r * r);
		
		// [ 참고 ] https://st-lab.tistory.com/89
		//         ▷ 택시 기하학을 문제에서 이해하지 못했다...........
	}	

}

