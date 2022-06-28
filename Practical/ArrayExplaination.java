package ROHIT;

public class ArrayExplaination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			copyArray();

	}
	public static void copyArray(){
	int arr[] = {12,34,23,67,23};
	int arr2[] = new int[arr.length];
	System.out.println("this is the first array :");
	for(int i = 0 ; i < arr.length ; i++) {
		arr2[i]= arr[i];
		System.out.println(arr[i]);
	}
	System.out.println("this is the second array :");
	for(int i : arr2)System.out.println(i);
	}

}

