package BAEKJOON.step.step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int size;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		// 18258
//		int N = 0;
//		
//		N = Integer.parseInt(br.readLine());
//		LinkedList<Integer> q = new LinkedList<>();
//		StringBuilder sb = new StringBuilder();
//		
//		arr = new int[N];
//		
//		while(N-- > 0) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			switch (st.nextToken()) {
//			case "push":
//				q.offer(Integer.parseInt(st.nextToken()));
//				break;
//			case "pop":
//				Integer it = q.poll();
//				if (it == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(it).append('\n');
//				}
//				break;
//			case "size":
//				sb.append(q.size()).append('\n');
//				break;
//			case "empty":
//				Integer It = q.size();
//				if(It == 0) {
//					sb.append(1).append('\n');
//				} else {
//					sb.append(0).append('\n');
//				}
//				break;
//			case "front":
//				Integer IT = q.peek();
//				if (IT == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(IT).append('\n');
//				}
//				break;
//			case "back":
//				Integer ite = q.peekLast();
//				if(ite == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(ite).append('\n');
//				}
//				break;
//			}
//		}
//		
//		System.out.println(sb);
		
//		// 2164
//		int N = 0;
//		LinkedList<Integer> q = new LinkedList<Integer>();
//		
//		N = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= N; i++) {
//			q.offer(i);
//		}
//		
//		while(q.size() > 1) {
//			q.poll();
//			
//			q.offer(q.poll());
//		}
//		
//		System.out.println(q.poll());
		
//		// 11866
//		int N = 0;
//		int K = 0;
//		LinkedList<Integer> q = new LinkedList<Integer>();
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		
//		N = Integer.parseInt(st.nextToken());
//		K = Integer.parseInt(st.nextToken());
//		
//		sb.append("<");
//		
//		for(int i = 1; i <= N; i++) {
//			q.offer(i);
//		}
//		
//		while(true) {
//			if(q.size() == 1) {
//				sb.append(q.poll() + ">");
//				
//				break;
//			}
//			
//			for(int i = 0; i < K - 1; i++) {
//				q.offer(q.poll());
//			}
//			
//			sb.append(q.poll() + ", ");
//		}
//		
//		System.out.println(sb);
		
//		// 1966
//		int T = 0;
//		
//		StringBuilder sb = new StringBuilder();
//		
//		T = Integer.parseInt(br.readLine());
//		
//		while(T-- > 0) {
//			int N = 0;
//			int M = 0;
//			int count = 0;
//			LinkedList<int[]> q = new LinkedList<>();
//			
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			N = Integer.parseInt(st.nextToken());
//			M = Integer.parseInt(st.nextToken());
//			
//			st = new StringTokenizer(br.readLine());
//			
//			for(int i = 0; i < N; i++) {
//				q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
//			}
//			
//			while(!q.isEmpty()) {
//				boolean isMax = true;				
//				int[] front = q.poll();
//				
//				for(int i = 0; i < q.size(); i++) {
//					if(front[1] < q.get(i)[1]) {
//						q.offer(front);
//						
//						for(int j = 0; j < i; j++) {
//							q.offer(q.poll());
//						}
//						
//						isMax = false;
//						break;
//					}
//				}
//				
//				if(isMax == false) {
//					continue;
//				} else {
//					count++;
//				}
//				
//				if(front[0] == M) break;
//			}
//			
//			sb.append(count).append('\n');
//		}
//		
//		System.out.println(sb);
		
		// 10866
		Deque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		int N = 0;
		
		N = Integer.parseInt(br.readLine());
		
		Integer x = 0;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			case "push_front":
				dq.offerFirst(Integer.parseInt(st.nextToken()));
				
				break;
			case "push_back":
				dq.offer(Integer.parseInt(st.nextToken()));
				
				break;
			case "pop_front":
				x = dq.pollFirst();
				if(x == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(x).append('\n');
				}
				
				break;
			case "pop_back":
				x = dq.pollLast();
				if(x == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(x).append('\n');
				}
				
				break;
			case "size":
				sb.append(dq.size()).append('\n');
				break;
			case "empty":
				boolean k = dq.isEmpty();
				if(k == true) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				
				break;
			case "front":
				x = dq.peekFirst();
				if(x == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(x).append('\n');
				}
				
				break;
			case "back":
				x = dq.peekLast();
				if(x == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(x).append('\n');
				}
				
				break;
			}
			
		}
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
