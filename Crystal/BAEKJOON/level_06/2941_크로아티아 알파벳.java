package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {     
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int count = 0;
		
		for(int i = 0; i < word.length(); i++) {
			
			char letter = word.charAt(i);
			
			if(letter == 'c' ) {
				if(i < word.length() - 1) {
					if(word.charAt(i + 1) == '=') { // c= 일 경우
						
						i++;
					}
					else if(word.charAt(i + 1) == '-') { // c- 일 경우
						
						i++;
					}	
				}
			}
			
			else if(letter == 'd') {
				if(i < word.length() - 1) {
					if(word.charAt(i + 1) == 'z') {
						if(i < word.length() -2) {
							if(word.charAt(i + 2) == '=') {	// dz= 일 경우
								
								i += 2;
							}
						}
					}
					
					else if(word.charAt(i + 1) == '-') {	// d- 일 경우
						i++;
					}
				}
			}
		    
			else if(letter == 'l') {
				if(i < word.length() - 1) {
					if(word.charAt(i + 1) == 'j') {	// lj 일 경우
						
						i++;
					}
				}
			}
		    
			else if(letter == 'n') {
				if(i < word.length() - 1) {
					if(word.charAt(i + 1) == 'j') {	// nj 일 경우
						
						i++;
					}				
				}
			}
		 
			else if(letter == 's') {
				if(i < word.length() - 1) { 
					if(word.charAt(i + 1) == '=') {	// s= 일 경우
						
						i++;
					}
				}
		    }
		 
			else if(letter == 'z') {
				if(i < word.length() - 1) {
					if(word.charAt(i + 1) == '=') {	// z= 일 경우

						i++;
					}
				}
			}
		    
			count++;
		
		}
		
		System.out.println(count);
		
	}
	
}

