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
		
	// 2022.04.12 문제풀이
	// 3.알파벳 찾기
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char[] charr=str.toCharArray();  //입력받은 String타입을 char배열에 알파벳 한개 한개 저장
		int result=-1; 	//-1로 가정
		for(int j='a';j<='z';j++) {
			result=-1;
			for(int i=0;i<str.length();i++) {	
				if(charr[i]==j){	
					result=i;
                   	break;
				}
			}
			System.out.print(result+" ");
		}
		
	}	
		
		
	// 6. 단어의 개수
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	System.out.print(st.countTokens());
	
	}
		
		
	// 7. 상수
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int A = Integer.parseInt(st.nextToken());
	int B = Integer.parseInt(st.nextToken());
	int reA = (A%10)*100 + ((A/10)%10)*10 + (A/100); //백의자리와 일의자리를 교환
	int reB = (B%10)*100 + ((B/10)%10)*10 + (B/100);
	if(reA > reB)
		System.out.println(reA);
	else
		System.out.println(reB);
}
		
		
	// 2022.04.13 문제풀이
	// 10. 그룹 단어 체커
	
	//BufferedReader 선언 및 반복변수 N 선언 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	int N = Integer.parseInt(br.readLine()); 
	int count =0;
	
	// 반복문
	for(int i= 0; i<N; i++)
	{
		// 그룹단어체크 메서드 호출 -> 그룹단어의 경우 count++;
		if(isGroup(br.readLine()))
			count++;
	}
	
		System.out.print(count);
	}
	//그룹 단어 체크 메서드 선언
	static boolean isGroup(String str) {
		//그룹단어체크 변수 선언
		boolean check = true; 
		int[] alphabet = new int[26]; //중복체크용 배열
		int pre = -1, cur = -1;	//이전단어,현재단어
		
		//단어갯수만큼 반복시작
		for(int i=0; i<str.length(); i++)
		{
			// 현재단어
			cur = str.charAt(i) -97;
			
			// 현재단어,이전단어가 다를 경우 -> 이전단어가 -1 아니면 알파벳 배열 -1로 변경
			
			if(cur != pre) {
				if(pre != -1) 
					alphabet[pre] = 01;
				
				// 이전단어를 현재단어로 변경
				pre = cur;
			}
			
			// 현재단어의 알파벳배열의 -1로 나오면 이전에 한번 변경이 됬으므로 그룹단어가 아님
			
			if(alphabet[cur] ==-1) {
				check = false;
				break;
			}
		}
			
			return check;
		}
			
	}