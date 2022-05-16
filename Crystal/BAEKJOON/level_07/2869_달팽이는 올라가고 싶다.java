package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());	// climb upwards
		int b = Integer.parseInt(st.nextToken());	// sliding back down
		int v = Integer.parseInt(st.nextToken());	// height of wooden pole
		
		int day = (v - b) / (a - b);
		
		if((v - b) % (a - b) != 0) {
			
			day++;
		}
		
		System.out.println(day);
		
		
		/* 오리 버전 (답은 잘 나오는데 당당히 시간 초과)
		int a = Integer.parseInt(st.nextToken());	// climb upwards
		int b = Integer.parseInt(st.nextToken());	// sliding back down
		int v = Integer.parseInt(st.nextToken());	// height of wooden pole
		int days = 1;
		int meters = 0;
		
		while(true) {
			
			
			meters += a;
			
			if(meters >= v) {
				
				System.out.println(days);
				break; 
			}
			else {
				
				meters -= b;
				days += 1;
			}	
		}
			
		// 도전 횟수 : 3
		// [ cause 1, 2 ] 시간 초과		
		 
		*/
	}	

}

