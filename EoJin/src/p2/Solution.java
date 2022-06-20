package p2;

public class Solution {
    public int solution(int[] prices) {
        int answer = 0;
        int result = 0;
        
//        for(int i=0;i<prices.length;i++) {
//        	for(int j=i+1;j<prices.length;j++) {
//        		if(result<prices[j]-prices[i]) {
//        			result=prices[j]-prices[i];
//        			System.out.println(result);
//        			answer = result;
//        		}
//        	}
//        }
        
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(prices[i], min);
            result=Math.max(result, prices[i]-min);
            answer=result;
        }
        
        
        return answer;
    }
}
