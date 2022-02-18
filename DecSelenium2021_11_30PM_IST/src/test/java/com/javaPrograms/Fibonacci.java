package com.javaPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		{
			//fibonacci series : 0 1 1 2 3 5 8 13 21 34 55
			int n1 = 0, n2 = 1, n3, count = 15;
			System.out.print(n1 + " " + n2);// printing 0 and 1

			for (int i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are// already printed
			{
				n3 = n1 + n2;//step 1
				System.out.print(" " + n3);
				n1 = n2; // step 2
				n2 = n3;// step 3
			}

		}
	}
}
