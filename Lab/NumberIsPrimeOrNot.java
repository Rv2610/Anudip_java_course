package ROHIT;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		int number = 1;
		if(number == 1) {
			System.out.println("not a prime number");
		}
		else if(number == 2) {
			System.out.println("it is a prime number");
		}
		else if(number % 2 != 0) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
