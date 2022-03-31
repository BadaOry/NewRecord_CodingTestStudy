package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] timeArray;
		timeArray = br.readLine().split(" ");
		int hour = Integer.parseInt(timeArray[0]);
		int minute = Integer.parseInt(timeArray[1]);
		
		int originalTime = 0;
		int alarmTime = 0;
		int alarmTimeHour;
		int alarmTimeMinute;
		
		
		if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
		
			originalTime = hour * 60 + minute;
			alarmTime = originalTime - 45;
			
			alarmTimeHour = alarmTime / 60;
			alarmTimeMinute = alarmTime % 60;
			
			if(alarmTimeHour == 0 && alarmTimeMinute < 0) {
				if (alarmTimeMinute < 0) {
					
					alarmTimeHour = 23;
					alarmTimeMinute = 60 + alarmTimeMinute;
					
					System.out.println(alarmTimeHour + " " + alarmTimeMinute);	
				} if (alarmTimeMinute == 0) {	
					
					System.out.println("23 15");				
				}
				
			} else {
				
				System.out.println(alarmTimeHour + " " + alarmTimeMinute);
			}
		
		}  else {
			
			System.out.println("시간을 잘못 입력함");
		}
		
		// 도전 횟수 : 6
		// [ cause 1 ] numberFormatException : 배열로 받아서 split 을 해야하는데 그냥 readLine 을 사용함
		// [ cause 2 ] minute 가 45보다 적으면 알람 시간이 - 로 출력됨
		// [ cause 3 ] 수학적 논리 오류 : atm -= atm 이라고 씀
		// [ cause 4 ] 수학적 논리 오류 : 24시간 표현을 빠트림
	}
}
