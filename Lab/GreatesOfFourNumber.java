package ROHIT;

public class GreatesOfFourNumber {

	public static void main(String[] args) {
		int n1 = 2660 , n2 = 340 , n3 = 0 ,n4 = 100;
		
	/*	if(n1 > n2) {
			if(n1 > n3) {
				if(n1 > n4) {
					System.out.println(n1 + "is greatest");
				}
			}
			
		}
		if(n2 > n) {
			if(n1 > n3) {
				if(n1 > n4) {
					System.out.println(n1 + "is greatest");
				}
			}
			
		}
		*/
		
		if(n1 > n2 && n1 > n3 && n1 > n4) {
			System.out.println(n1 + " is greatest");
		}
		else if(n2 > n3 && n2 > n4) {
			System.out.println(n2 + " is greatest");
		}
		else if(n3 > n4) {
			System.out.println(n3 + " is greatest");
		}
		else {
			System.out.println(n4 + " is greatest");
		}

	}

}
