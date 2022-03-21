package programmers;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/64061
public class programmers64061 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers64061().solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[] {1,5,3,5,1,2,1,4}));
	}
	
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(Integer move : moves) {
            int index = move - 1;
            for(int i = 0; i < board.length; i++) {
                int k = board[i][index];

                if(k == 0) {
                    continue;
                } else if(!stack.empty() && stack.peek() == k) {
                    stack.pop();
                    answer++;
                } else {
                    stack.push(k);
                }

                board[i][index] = 0;
                break;
            }
        }
        return answer * 2;
    }
}