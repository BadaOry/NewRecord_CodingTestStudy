package p4;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
//		String[] bishops=new String[] {"C6"};
		String[] bishops=new String[] {"C6", "A4", "E5"};

		int result = solution.solution(bishops);
		
		System.out.println("결과 : "+result);

	}

}
