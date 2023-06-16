import java.util.*;

class hourglass {
static int findMaxSum(int [][]mat, int R, int C) {
	if (R < 3 || C < 3){
		System.out.println("Not possible");
		System.exit(0);
	}
	//loop runs (R-2)*(C-2)
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < R - 2; i++) {
		for (int j = 0; j < C - 2; j++) {
			int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1]) + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}
static public void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int R=sc.nextInt();
    int C=sc.nextInt();
    int mat[][]=new int[R][C];
    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            mat[i][j]=sc.nextInt();
        }
    }
	int res = findMaxSum(mat,R,C);
	System.out.println("Maximum sum of hour glass = "+ res);
	}
}