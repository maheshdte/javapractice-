package Practice;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {20, 40, 30, 10, 90, 200, 500, 150, 250};
		
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1; i<number.length; i++)
		{
			if(number[i]>largest) {
				largest = number[i];
			}
			else if(number[i]<smallest) {
				smallest = number[i];
			}
		}
		
		System.out.println("Given array is:"+ Arrays.toString(number));
		System.out.println("Largest Number is::"+ largest);
		System.out.println("Smallest Number is::"+ smallest);
		

	}

}
