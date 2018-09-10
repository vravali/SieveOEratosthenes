package edu.vvangala.jenkins.code;

import java.util.Scanner;

/**
 * @author VeenaRavali
 *
 */
public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A;
		int N;
	//	Scanner sc= new Scanner(System.in);
	//	System.out.print("enter the prime number ceiling: ");
	//	N = sc.nextInt();
	// sc.close();
	A= args[0];
		N = 50;
	N= Integer.parseInt(A);
		//
		boolean[] isPrime = new boolean[N];
		isPrime[0] = false;
		for (int c =1; c< N; c++){
			isPrime[c] = true;
			
		}
//
		for (int i=2;  i<=N; i++){
			//
			if (isPrime[i-1]) {
				// print out prime number
				System.out.println(i);
				
				for (int j =i*i; j<=N; j += i) {
					isPrime[j-1] = false;
				}
			}
		}
	}


}
