package Test;


import java.util.Scanner;

public class step3 {
	public static void main(String[] args) {

		// 1. 구구단
		
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
		// 2. A+B - 3
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    for(int i=1; i<=n; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    	}
	}
		// 3. 합
	Scanner in = new Scanner(System.in);
	
	int a = in.nextInt();
	in.close();
	int sum = 0;
	
	for (int i = 1; i <= a; i++) {
		sum += i;
	}
	System.out.println(sum);
	}
		// 4. 빠른 A+B
	
	
		// 5. N 찍기
	Scanner in = new Scanner(System.in);
	
	int N = in.nextInt();
	in.close();
    
	int i = 1;
    
	while(i<= N) {
		System.out.println(i);
		i++;
	}
	
		// 6. 기찍N
	Scanner in = new Scanner(System.in);
	
	int N = in.nextInt();
	in.close();
    
	
    
	while(N > 0) {
		System.out.println(N);
		N--;
	}
}

		// 7. A+B -7
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	
	for(int i=0;i<A;i++) {
	 int B = sc.nextInt();
	 int C = sc.nextInt();      
	    System.out.println("Case #"+(i+1)+": "+(B+C));
	}
	     sc.close();     
}

	
}