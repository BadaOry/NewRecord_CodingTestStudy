package com.kh.test;

import java.util.Scanner;

// 재귀함수가 뭔가요?
public class RecursiveFunction3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

		answer(num);

	}

	static String underbar = "";

	
	
	public static void answer(int num) {
		String bar = underbar;
		String line2 = "\"재귀함수가 뭔가요?\"";
		String line3 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		String line4 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		String line5 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		String line6 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		String line7 = "라고 답변하였지.";

		if (num == 0) {
			System.out.println(bar + line2 + "\n" + bar + line6 + "\n" + bar + line7);
			return;
		}

		String statement = bar + line2 + "\n" + bar + line3 + "\n" + bar + line4 + "\n" + bar + line5;
		System.out.println(statement);

		underbar += "____";

		answer(num - 1);

		System.out.println(bar + line7);

	}

}
