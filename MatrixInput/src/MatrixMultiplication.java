
public class MatrixMultiplication extends Tester{
	public static int[][] multiply(int a[][], int b[][]) {
		int c[][] = new int[m1][n2]; 
		for (int h = 0; h < m1; h++) {
	        for (int i = 0; i < n2; i++) {
	            for (int j = 0; j < m2; j++) {
	                c[h][i] += a[h][j] * b[j][i];
	            }
	        }
		}
			return c;
		}
}
