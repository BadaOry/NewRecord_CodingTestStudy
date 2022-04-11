package Test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class step7(string) {
	public static void main(String[] args) throws IOException {
		// 2022.04.11 문제풀이
		
		// 2. 숫자의 합
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine(); // 입력만 받는다
//		
//		int sum = 0;
//		
//		for(byte value : br.readLine().getBytes()) {
//			
//			sum += (value - '0');
//		}
//		System.out.println(sum);
//		
		
		// 5. 단어 공부 - 구글링도움 ㅜㅜ 이해 100% 안됨
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[26]; // 영문자의 개수
//		String s = br.readLine();
//		
// 
//		for (int i = 0; i < s.length(); i++) {
//			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
//				arr[s.charAt(i) - 97]++;
//			} else {
//				arr[s.charAt(i) - 65]++;
//			}
//		}
//		int max = -1;
//		char ch = '?';
//		for (int i = 0; i < 26; i++) {
// 
//			if (arr[i] > max) {
//				max = arr[i];
//				ch = (char) (i + 65);
//			} 
//			else if (arr[i] == max) {
//				ch = '?';
//			}
//		}
//		System.out.print(ch);
//	}
		
		// 9. 크로아티아 알파벳
//		
//		Scanner input = new Scanner(System.in);
//        String str = input.next();
//        int cnt=0;
//        for(int i=0; i<str.length(); i++){
//            if(i != str.length()-1){ // 마지막 단어가 아니면 크로아티아어일 가능성이 있음
//                if(str.charAt(i) == 'c'){ // c= 또는 c-인지 확인
//                    if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){
//                        i++; // 크로아티아어이므로 뒷 문자까지가 한단어
//                    }
//                }
//                else if(str.charAt(i) == 's' || str.charAt(i) == 'z'){ // s= 또는 z=인지 확인
//                    if(str.charAt(i+1) == '='){
//                        i++;
//                    }
//                }
//                else if(str.charAt(i) == 'd'){ // d- 또는 dz=인지 확인
//                    if(str.charAt(i+1) == '-'){
//                        i++;
//                    }
//                    else if(str.charAt(i+1) == 'z'){
//                        if(i+1 == str.length()-1){
//                            cnt++;
//                        }
//                        else if(str.charAt(i+2) == '='){
//                            i++;
//                        }
//                        else{
//                            cnt++;
//                        }
//                        i++;
//                    }
//                }
//                else if(str.charAt(i) == 'l' || str.charAt(i) == 'n'){ // lj 또는 nj인지 확인
//                    if(str.charAt(i+1) == 'j'){
//                        i++;
//                    }
//                }
//            }
//            cnt++; // 글자가 시작해서 루프가 돈 것이므로 카운팅
//        }
//        System.out.println(cnt);
//    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}