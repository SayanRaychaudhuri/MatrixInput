import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
	 	static int m1 = 0;
		static int m2 = 0;
		static int n2 = 0;
	 public static void main(String args[])throws Exception{
	        BufferedReader in = new BufferedReader(new FileReader("MatrixData.txt"));
	        String str;
	        List<String> list = new ArrayList<String>();
	        while((str =in.readLine()) != null ){
	            list.add(str);
	        }
	        in.close();
	        String[] outString = list.toArray(new String[0]);
	      
			boolean matrix = true;
			for (int i=0;i<outString.length;i++) {
				if(outString[i].equals("matrix")) {
					matrix = !matrix;
				}
				if (outString[i].equals("row") && !matrix) {
					m1++;
				} 
				if (outString[i].equals("row") && matrix) {
					m2++;
				}
				if (!outString[i].equals("row") && matrix) {
					n2++;
				}
			}
			n2 /= m2;
			
			int a[][] = new int [m1][m2];
			int i=0,j=0,k=0;
			while(i<m1) {
				if (!outString[k].equals("matrix")&&!outString[k].equals("row")) {
					a[i][j] = Integer.valueOf(outString[k]);
					j++;
				} 
				if (j==m2) {
					i++;
					j=0;
				}
					k++;
				}
			
			int b[][] = new int [m2][n2]; 
			int d=0,e=0,f=0;
			while(d<m2) {
				if (!outString[k].equals("matrix")&&!outString[k].equals("row")) {
					b[d][e] = Integer.valueOf(outString[k]);
					e++;
				} 
				if (e==n2) {
					d++;
					e=0;
				}
					k++;
				}
			
			System.out.println(Arrays.deepToString(MatrixMultiplication.multiply(a,b)));
			
	    }
			
}