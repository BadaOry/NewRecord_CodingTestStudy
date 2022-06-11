package p1;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
		int[] win_nums=new int[]{31, 10, 45, 1, 6, 19};
		
		
		int result[]=solution.solution(lottos, win_nums);


		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}
}
