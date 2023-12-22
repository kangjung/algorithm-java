package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/72413
public class programmers72413 {
	public static void main(String[] args) throws Exception {
		System.out.println(new programmers72413().solution(6,4,6,2,new int[][] { {4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25} }));
		System.out.println(new programmers72413().solution(7,3,4,1,new int[][] { {5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6} }));
		System.out.println(new programmers72413().solution(6,4,5,6,new int[][] { {2,6,6}, {6,3,7}, {4,6,7}, {6,5,11}, {2,5,12}, {5,3,20}, {2,4,8}, {4,3,9} }));
	}

	public int solution(int n, int s, int a, int b, int[][] fares) {
		int answer = Integer.MAX_VALUE;
		int[][] map = new int[n][n];
		int x, y, z;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					map[i][j] = 0;
					continue;
				}
				map[i][j] = 1000001 * n;
			}
		}

		for (int[] arr : fares) {
			x = arr[0] - 1;
			y = arr[1] - 1;
			z = arr[2];
			map[x][y] = z;
			map[y][x] = z;
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					if(map[j][k] > map[j][i] + map[i][k]){
						map[j][k] = map[j][i] + map[i][k];
					}
				}
			}
		}
		for(int i = 0; i < n; i++){
			answer = Math.min(answer, map[s-1][i] + map[i][a-1] + map[i][b-1]);
		}
		answer = Math.min(answer, map[s-1][a-1] + map[s-1][b-1]);
		return answer;
	}
}