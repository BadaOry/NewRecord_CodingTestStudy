package Test;


import java.util.Scanner;

// 04.05 백준 STEP 6 문제풀이

public class step6 {
	public static void main(String[] args) {
		
		// 1. 최소, 최대
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] data = new int[N];
		
		for(int i=0; i<N; i++) {
			data[i] = sc.nextInt();
		}
		
		int min = data[0]; //가장 큰 수
		int max = data[0];

		for(int i=0; i<N; i++) {
			if(min>data[i]) {
				min = data[i];
			}
		} //최솟값
		
		for(int i=0; i<N; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
	
		System.out.println(min+" "+max);
}
	
	// 2. 최댓값
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];		
		
		for(int i = 0 ; i < arr.length ; i ++)			
		{
			arr[i]=sc.nextInt();	
		}
		
		int max = arr[0];			
		int index = 0 ;			// 최대값의 위치를 알아낼 변수 생성
		
		for(int i = 1 ; i < arr.length ; i ++)
		{
			if(arr[i] > max) 			
			{							
				max = arr[i];
				index = i+1;			// max가 된 값의 위치를 index에 저장
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
	
	// 3. 숫자의 개수
		public void method3() {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			sc.close();
		      
			int[] counts = new int[10];
			int t = a * b * c;
			while (t > 0) {
				counts[t % 10]++;
				t /= 10;
			}
			for (int i=0; i < counts.length; ++i) {
				System.out.println(counts[i]);
			}
		}
			
	// 4. 나머지
	// 배열 이용 (나머지 0-41이므로 boolean 배열 생성-길이 42)
	
		public void method4() {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashSet<Integer> h = new HashSet<Integer>();
	 
			
			for (int i = 0; i < 10; i++) {
				h.add(Integer.parseInt(br.readLine()) % 42);
			}
			
			System.out.print(h.size());
		}	
	}

	// 5. 평균
	//

	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ar[] = new double[n]; //소수가 생겨서 double로 선언
		
		int max = 0;
		double sum=0; maxScore;
		for(int i=0; i<ar.length; i++) { // 배열원소 초기화 -if문으로 비교해서 큰값을 가진 위치를 max에 저장
			ar[i] = sc.nextInt();
			if(ar[max] < ar[i])
				max = i;
		}
		
		maxScore = ar[max]; //maxScore변수에 최댓값을 옮김
		for(int i=0; i<ar.length; i++) { // 배열 크기만큼 반복해 배열 전체를 수식으로 줘 값 변경
			ar[i] = ar[i]/maxScore*100;
			sum += ar[i];
		}
		System.out.println(sum/n);	//평균값 출력
		}


	// 6. O/X 퀴즈
	//

	public void method6() {	
		  Scanner sc = new Scanner(System.in);

	        String arr[] = new String[sc.nextInt()];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.next();
	        }
	        sc.close();

	        for (int i = 0; i < arr.length; i++) {
	            int resultNum = 0;
	            int tempNum = 0;
	            for(int j = 0; j < arr[i].length(); j++) {
	                char tempChar = arr[i].charAt(j);
	                if(tempChar == 'O') {
	                    tempNum++;
	                } else if(tempChar == 'X') {
	                    tempNum = 0;
	                }
	                resultNum += tempNum;
	            }
	            System.out.println(resultNum);
	        }

	    }
	
	// 7. 평균은 넘겠지
		//

		public void method7() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt(); //몇 개의 배열을 받을 지

			for (int i = 0; i < n; i++) {
				int sum = 0;
				double max = 0;
				int[] array;
				int number = sc.nextInt(); //배열의 길이
				array = new int[number];
				for (int j = 0; j < number; j++) {
					int num = sc.nextInt(); //배열 속에 들어갈 정수
					array[j] = num; //배열에 넣기
					sum += array[j];
				}
				for (int j = 0; j < number; j++) {
					if (sum / number < array[j])
						max += 1; //평균보다 큰 학생수
				}
				System.out.printf("%.3f", max / number * 100); //소수점 세 자리까지 출력
				System.out.println("%");

			}
			sc.close();
		}
}