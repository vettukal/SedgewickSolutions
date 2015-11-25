/**
Write a code fragment to print the transposition(rows and columns changed) 
of a two-dimensional array with Mrows and N columns.

 **/

public class Ex_1_1_13{
    public static void main(String[] args){
	int[][] arr = Utils.getRandIntMatrix(10,20);
	Utils.printMatrix(arr);
	int a = arr.length;
	int b = arr[0].length;
	int[][] res = new int[b][a];
	for(int i = 0;i<a;i++){
	    for(int j =0;j<b;j++){
		res[j][i] = arr[i][j];
	    }
	}
	System.out.println("Hello World");
	Utils.printMatrix(res);
    }
}
