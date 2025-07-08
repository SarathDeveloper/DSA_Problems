package Arrays;

public class Move_Zeros_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,5,7,0,0,5,4,0,2,0,1,6};
		
		int[] res = moveZerosEnd(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(" "+res[i]);
		}
	}

	//Efficient Solution
	public static int[] moveZerosEnd(int[] arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0 ) {
				int temp=arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		
		
		return arr;
	}
	
	// Naive Solution
	public static int[] moveZerosToEnd(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j] != 0) {
						int temp= arr[j];
						arr[j] =arr[i];
						arr[i] =temp;
					}
				}
			}
		}
		
		return arr;
		
	}
	
}
