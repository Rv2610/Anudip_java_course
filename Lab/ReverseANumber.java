package ROHIT;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int rem = 0; 
		int result = 0;
		
		while(a>0) {
			rem = a%10;
			result = result*10 + rem;
			a=a/10;
		}
		System.out.println(result);
		
		

	}

}
