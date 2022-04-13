package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {     
		
	
		int count = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			if(check() == true) {
				
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	
	
	public static boolean check() throws IOException {
		
		boolean[] check = new boolean[26];
		int comp = 0;
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			
			int nowletter = word.charAt(i);
			
			if(comp != nowletter) {
				
				if(check[nowletter - 'a'] == false) {
					
					check[nowletter - 'a'] = true;
					comp = nowletter;
				}
				else {
					
					return false;
				}
			}
			
			else {
				
				continue;
			}
		}
		
		
		return true;
	}
	
}

