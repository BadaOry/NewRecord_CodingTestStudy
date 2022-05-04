package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// java를 다시 공부하고 있음 ^.^..
// 한달 노니까 다 까먹는 기적
// 문자열 1번 문제 푸는데 컴파일 오류만 10번남..
// 아좌좌 

// 11654번 
//public class Main {
//    public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
//      
//     	int ch = in.next().charAt(0);

//      System.out.println(ch);
//    }
//}

// 11720번
//public class Main {
//    public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
//    	
//    	int num = sc.nextInt();
//    	String st = sc.next();
//    	sc.close();
//    	
//    	int sum = 0;
//    	
//    	for(int i = 0; i < num; i++) {
//    		sum += st.charAt(i)-'0';
//    	
//    	}
//    	System.out.println(sum);
//    }
//}

// 10809번
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		
//		for(char c ='a' ; c <= 'z'; c++) {
//		System.out.println(input.indexOf(c));
//			
//		}
//
//	}
//}

// 2675번
//public class Main {
//	public static void main(String[] args) throws IOException   {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		int t = Integer.parseInt(br.readLine());
//		for(int i=0;i<t;i++) {
//			st = new StringTokenizer(br.readLine());
//			int n=Integer.parseInt(st.nextToken());
//			char[] test = st.nextToken().toCharArray();
//			int len = test.length;
//			for(int j=0;j<len;j++) {
//				for(int k=0;k<n;k++) {
//					System.out.print(test[j]);
//				}
//			}
//			System.out.println();
//		}
//	}
//}

// 1157번 
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int[] arr = new int[26];
//        int max = -1;
//        char result = '?';
//
//        String input = bufferedReader.readLine().toUpperCase(Locale.ROOT);
//
//        for (int i = 0; i < input.length(); i++) {
//            arr[input.charAt(i) - 'A']++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                result = (char) (i + 65);
//            } else if (arr[i] == max) {
//                result = '?';
//            }
//        }
//        System.out.println(result);
//    }
//}

// 1152번
//public class Main {
//	public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
//
//    System.out.println(st.countTokens());
//	}
//}

// 2908번 
//public class Main {
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//	
//
//		if(a > b)
//			System.out.print(a);
//		else
//			System.out.print(b);
//	}
//}

// 5622번
//public class Main {
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        byte[] byte_arr = br.readLine().getBytes();
//        int count = 0;
//
//        for (byte value : byte_arr) {
//            if ('A' <= value && value <= 'C') {
//                count += 3;
//            } else if ('D' <= value && value <= 'F') {
//                count += 4;
//            } else if ('G' <= value && value <= 'I') {
//                count += 5;
//            } else if ('J' <= value && value <= 'L') {
//                count += 6;
//            } else if ('M' <= value && value <= 'O') {
//                count += 7;
//            } else if ('P' <= value && value <= 'S') {
//                count += 8;
//            } else if ('T' <= value && value <= 'V') {
//                count += 9;
//            } else {
//                count += 10;
//            }
//        }
//
//        System.out.println(count);
//    }

// 2941번
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
//		String str = br.readLine();
//		
//		String[] ca = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
//
//		for(String c: ca) {
//			str = str.replace(c, "a");
//		}
//
//		System.out.print(str.length());
//	}
//}

// 1316번
class Main {  
  public static void main(String args[]) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int result = n;
    StringTokenizer st;
    for(int i=0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      int cnt = 0;
      for(char c='a'; c<='z'; c++){
        int first = s.indexOf(c);
        int last = s.lastIndexOf(c);
        if(first!=last){
          for(int j=first+1; j<last; j++){
            if(s.charAt(j)!=c){
              cnt++;  
              break;
            }
          }  
        } 
      }
      if(cnt!=0){
            result--;
            }
    }
    System.out.println(result);
  } 
}
