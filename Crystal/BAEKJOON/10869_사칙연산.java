package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        
		int A = 0;
        int B = 0;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        if ((1 <= A && A <= 10000) && (1 <= B && B <= 10000)) {
           
            System.out.println(A + B);
            System.out.println(A - B);
            System.out.println(A * B);
            System.out.println(A / B);
            System.out.println(A % B);
        }     
        
	}

}
