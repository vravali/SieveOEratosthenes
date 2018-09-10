package edu.vvangala.jenkins.code;

import java.util.Scanner;

/**
 * @author VeenaRavali
 *
 *
 *try (Scanner sc = new Scanner(System.in)) {
    String msg = "Please, enter a positive Integer:";
    int n = 0;

    do {
        System.out.println(msg);
        // make the user keep entering the input until it's an Integer
        while (!sc.hasNextInt()) {
            System.out.println(msg);
            sc.next();
        }
        n = sc.nextInt();
    }
    while (n <= 0); // run until the input is a positive Integer

    return n;
}
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String A;
		int N = 0;
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Please Enter a postive integer greater than 0: ");
		//N = sc.nextInt();
	// sc.close();
	A= args[0];
	//	N = 50;
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
