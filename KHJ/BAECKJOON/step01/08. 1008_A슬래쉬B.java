
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 8. 1008_A/B
		// 소수점자리까지 표현해주기 위해 int로 입력받은 값을 double로 형변환 시켜 출력
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > 0 && B < 10) {			
			System.out.println((double)A/(double)B);
		}		
		
	}

}
