package com.nit.Arrays;

public class Sum_of_digits_In_Array {

	public static void main(String[] args) {
		int sum=0;
		/*
		 * while (sum<3) { sum=sum++; System.out.println(sum);
		 * 
		 * }
		 */
		int[] ints = {123,234,345};
		
		for (int i = 0; i < ints.length; i++) {
			//System.out.println(ints[i]);
			int rem= ints[i]%10;
			sum=sum+rem;
			//System.out.println(sum);
			int[] no=new int[3];
			int largest=no[0];
			for (int j = 0; j < no.length; j++) {
				no[j]=sum;
				System.out.println(no[j]);
//				for (int m : no) {
//					System.out.println(m);
//				}
				for (int k = 0; k < no.length; k++) {
					if (largest>no[k]) {
						largest=no[k];
					}
				}
			}
			//System.out.println(largest);
		}

	}

}
