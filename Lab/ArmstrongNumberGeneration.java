/*
 * @Author rohit rathod
 */

package ROHIT;
import java.lang.Math;

public class ArmstrongNumberGeneration {

	public static void main(String[] args) {
		        int number = 371, orignal, rem, r = 0;

		        orignal = number;

		        while (orignal != 0)
		        {
		            rem = orignal % 10;
		            r +=(Math.pow(rem, 3));
		            orignal = orignal/10;
		        }

		        if(r == number)
		            System.out.println(number + " is an Armstrong number.");
		        else
		            System.out.println(number + " is not an Armstrong number.");
		    }
		
		
			
		}
		
		

	

