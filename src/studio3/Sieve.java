package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the nth term");

		int nthTerm = in.nextInt(); 
		int [] number = new int [nthTerm]; 
		nthTerm = number.length;
		for (int i = 2; i < nthTerm; i++)
		{ 
			
					
			
			
			number[i] = i;
			System.out.println(i);
		}
		//for (int j = 2; j < nthTerm; j *= 2) 
		//{
			//System.out.println(number[j]);
		//}



	}

	
	}


