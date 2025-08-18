package Arrays;

public class Left_Rotate_Array_One_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
	
		int[] res = leftRotateByOnePlace(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(" "+res[i]);
		}
	}

	private static int[] leftRotateByOnePlace(int[] arr) {
		int firstElement = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = firstElement;
		return arr;
	}

}
