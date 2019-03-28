
// Array Reverse

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arrtemp[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			arrtemp[count++]=arr[i];
		}
		
		System.out.println(arrtemp);

		
		
	}
	/*
	 * void invertUsingFor(int[] array) { for (int i = 0; i < array.length / 2; i++)
	 * { Object temp = array[i]; array[i] = array[array.length - 1 - i];
	 * array[array.length - 1 - i] = (int) temp; } }
	 */

	
	@Override
	public String toString() {
		return "dh";
	}
	
	
}
