package ROHIT;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int arr[] = {12,3,67,23,6};
		int arr2[] = {64,68,36,24,4};
		int arr3[] = new int[arr.length];
		for(int i = 0 ; i< arr.length ; i++) {
			arr3[i] = arr[i] + arr2[i];
			System.out.println("sum of "+i+" st "+ "elements of arr1 and arr2 is = "+ arr3[i]);
			
		}

	}

}
