package p2;

public class Main {

	public static void main(String[] args) {
			Solution solution = new Solution();
			
			int[] prices=new int[]{3, 2, 4, 8, 7};
//			int[] prices=new int[]{3, 4, 1, 5, 4};
//			int[] prices=new int[]{3, 3, 3, 3, 3};
			
			int result = solution.solution(prices);
			
			System.out.println("결과 : "+result);
		}

}
