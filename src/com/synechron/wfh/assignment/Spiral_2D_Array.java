package com.synechron.wfh.assignment;

/* Given a 2D array, print it in spiral form. See the following examples
		Input:
		1  2   3  4
		5  6   7  8
		9  10  11 12
		13 14  15 16
		Output:
		1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

public class Spiral_2D_Array 
{
	  
    static void spiralPrint(int row, int column, int input[][]) 
    { 
        int i, k = 0, l = 0; 
        /* 
        k - starting row index 
        row - ending row index 
        l - starting column index 
        column - ending column index 
        i - iterator 
        */
  
        // 1) (k=0 < row=4) && (l=0 < column=4) = true. 
        // 2) (k=1 < row=3) && (l=1 < column=3) = true.
        // 3) (k=2 < row=2) && (l=2 < column=2) = false
        while (k < row && l < column) {  
            for (i = l; i < column; ++i) { 
                System.out.print(input[k][i] + " ");  
                //print =  First_Time = 1 2 3 4 , Second_Time = 6 7
            } 
            k++;   // 1)k=1  2)k=2

            for (i = k; i < row; ++i) { 
                System.out.print(input[i][column - 1] + " ");  
                //print =  First_Time = 8 12 16 , Second_Time = 11
            } 
            column--;  //column = 3 , column = 2   
           
            if (k < row) { 
            	//FirstTime = column = 2, l=0
            	//SecondTIme = column = 1 l=1
                for (i = column - 1; i >= l; --i) { 
                	  //FirstTime = row=row-1, 4=4-1 row=3[2][1][0]
                	  //SecondTime = row=row-1, 3=3-1 row=2[1]
                    System.out.print(input[row - 1][i] + " "); 
                    //print =  First_Time = 15,14,13 , Second_Time = 10
                } 
                row--;  //row = 3, row = 2
            } 
            
            if (l < column) { 
            			//3-1=2 row[2]=[0]=9, row[1]=[0]=5
                for (i = row - 1; i >= k; --i) { 
                    System.out.print(input[i][l] + " "); //9,5
                } 
                l++; // l=1
            } 
        } 
    } 
	public static void main(String[] args) 
	{
		int row=4,column=4;
		int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[i].length;j++)
				System.out.print(input[i][j]+"  ");
		    System.out.println("\n");
		}	
		System.out.println("2D Array print in Spiral Model....:- ");
		spiralPrint(row, column, input);
	}
}
