package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] timeArray = br.readLine().split(" ");
		int hour = Integer.parseInt(timeArray[0]);
		int minute = Integer.parseInt(timeArray[1]);
		
		int oventime = Integer.parseInt(br.readLine());
		
		hour += oventime / 60;
		minute += oventime % 60;
		
		
		if(minute > 59) {
			hour += 1;
			minute -= 60;
		} 
		
		if(hour > 23) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + minute);
		
		// 도전 횟수 : 2
		// [ 참고 1 ] https://dalconbox.tistory.com/261 
		// [ 참고 2 ] https://comain.tistory.com/10
	}
}
