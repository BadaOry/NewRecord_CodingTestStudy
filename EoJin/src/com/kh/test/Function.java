package com.kh.test;

public class Function {

	long sum(int[] a) {
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	
	
	public void question2() {
		boolean[] notSelfNum = new boolean[10001];
		
		for(int i=1; i<10001;++i) {
			int result = d(i);
			if(result<10001) {
				notSelfNum[result] = true;
			}
		}
		
		for(int j=1;j<notSelfNum.length;++j) {
			if(!notSelfNum[j]) {
				System.out.println(j);
			}
		}
		
	}

	public static int d(int n) {
		int result = n;
		while(n>0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}
	
	public void question3() {
		// 문제 푸는중
		
	}
	
}
