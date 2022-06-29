package ROHIT;

public class CopyTwoDErrayIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][3];
		arr[0][0] = 21;
		arr[0][1] = 1;
		arr[0][2] = 121;
		arr[1][0] = 11;
		arr[1][1] = 21;
		arr[1][2] = 921;
		
		int arr2[][] = new int[2][3];
		
		for(int i = 0 ; i< arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr2[i][j] = arr[i][j];
				
			}
			}
		
		System.out.println("after copying now the second array is : ");
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length  ; j++ ) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		}

}
