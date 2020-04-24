package com.synechron.wfh.assignment;


/* Write code to move all zeros of an input array of integers towards the end of the array. 
 * The order of the non-zero numbers should not be altered.
    e.g. Input:  {6,0,-3,0,0,4}
         Output: {6,-3,4,0,0,0}
 */
// O(n)

public class Move_AllZero_ToEnd 
{
	public static void main(String[] args) 
	{   
		//Input only positive values.
		//int[] arr = { 2, 9, 0, 3, 0, 4, 5, 0 };  // o/p - {2 9 3 4 5 0 0 0}.
		
		//Input both values 
		int[] arr = {6,0,-3,0,0,4};                // o/p - {6,-3,4,0,0,0};
		int add = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[add++] = arr[i];
			}
		}
		while (add < arr.length) {
			arr[add++] = 0;
		}
		for (int j = 0; j < add; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
