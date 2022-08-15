package com.uc_3;

public class LineIsEqualOrGreater {
	public static void main(String[] args) {
		
		int lengthLine1 = 2;
	    int lengthLine2= 5;
		if ((Double.compare(lengthLine1, lengthLine2)) == 0) 
			System.out.println("Length of Line 1 is equal to the length of Line 2.");
			else 
				if ((Double.compare(lengthLine1, lengthLine2)) < 0) 
					System.out.println("Length of Line 1 is less than the length of Line 2.");
				else
					if ((Double.compare(lengthLine1, lengthLine2)) > 0) 
						System.out.println("Length of Line 1 is greater than the length of Line 2.");


		
	}			

}
