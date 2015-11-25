/**
Write a code fragment that prints the contents of a two-dimensional boolean 
array, using *to represent trueand a space to represent false. Include row and column numbers.
**/

public class Ex_1_1_11{
    public static void main(String[] args){
	boolean[][] arr = new boolean[10][10];
	for(int i =0;i<10;i++){
	    for(int j=0;j<10;j++){
		if(Math.random()>0.5) // does this give real Head and Tails probab. Should I use >=0.5
		    arr[i][j]=true;
		else
		    arr[i][j]=false;
	    }
	}// after putting some random values, printing with rows and colums.
	for(int i =0;i<10;i++){
	    for(int j=0;j<10;j++){
	    	System.out.println("row "+i+" col: "+j+" : "+arr[i][j]);
	    }
	}
    }
}
