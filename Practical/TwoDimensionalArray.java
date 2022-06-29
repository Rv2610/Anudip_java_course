package ROHIT;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		arr[0][0] = 21;
		arr[0][1] = 1;
		arr[0][2] = 121;
		arr[1][0] = 11;
		arr[1][1] = 21;
		arr[1][2] = 921;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < 3 ; j++ ) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
