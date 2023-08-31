package leetcode;

//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
//1155. Number of Dice Rolls With Target Sum
public class leetcode1155 {
	public static void main(String[] args) {
		System.out.println(new leetcode1155().numRollsToTarget(1, 6, 3)); //1
		System.out.println(new leetcode1155().numRollsToTarget(2, 6, 7)); //6
		System.out.println(new leetcode1155().numRollsToTarget(30, 30, 500)); //222616187
	}

	public int numRollsToTarget(int n, int k, int target) {
		double modulo = Math.pow(10, 9) + 7;
		double[][] arr = new double[n+1][target + k] ;
		double sum = 0;
		arr[0][0] = 1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=target; j++){
				sum = 0;
				for (int l = Math.max(0, j-k); l < j; l++) {
					sum += arr[i-1][l];
				}
				arr[i][j] = sum % modulo;
			}
		}
		return (int) arr[n][target];
	}
}