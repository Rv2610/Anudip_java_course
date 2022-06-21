package ROHIT;

import java.util.Scanner;

public class PalandromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 121;
		int rem = 0;
		int sum = 0;
		int temp = s;
		while(s>0) {
			rem = s%10;
			sum = (sum * 10) + rem;
			s=s/10;
		}
		if(sum == temp) {
			System.out.println(sum + " it is palandrom");
		}
		else{
			System.out.println(sum +" not palandrom");
			}
		}

}
