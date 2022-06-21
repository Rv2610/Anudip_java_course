package ROHIT;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int n = 9;
		int fact = 1;
		for (int i = n ; i>0; i--) {
			fact = fact * i;
			
		}
		System.out.println("factorial of 3 is = "
				+ fact);


	}

}
