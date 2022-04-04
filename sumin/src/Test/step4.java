package Test;


import java.util.Scanner;

public class step4 {
	public static void main(String[] args) {

	// 1. 두 수 비교하기
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else if(A == B) {
			System.out.println("==");
		}
		
	// 2. 시험성적
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else if (score >= 0 && score < 60) {
			System.out.println("F");
		}
	
	// 3. 윤년
	Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}		
	
	// 4. 사분면 고르기
	Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}	
	
	// 5. 알람 시계
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); // 시
		int M = in.nextInt(); // 분
		in.close();
		
		if(M < 45) {
			H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(min) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
	}
	
	// 6. 오븐 시계
	Scanner sc = new Scanner(System.in); 
	int hour = sc.nextInt();
	int minute = sc.nextInt() + sc.nextInt();
	while (minute > 59) { 
		hour++; 
		minute -= 60;
		} 
	while (hour > 23) 
		hour -= 24;
	System.out.printf("%d %d", hour, minute);
	
	}

}
	 // 7. 주사위 세계
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a == b && a == c && b == c)
	{
		System.out.print(10000+(a*1000));
	}
	else if(a == b || a == c)
	{
		System.out.print(1000+(a*100));
	}
	else if(b == c)
	{
		System.out.print(1000+(b*100));
	}
	else
	{
		System.out.print((Math.max(a, Math.max(b, c))*100));
	}
}

}