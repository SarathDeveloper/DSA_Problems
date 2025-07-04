package Arrays;

public class Largest_Element_in_Array {

	
	
	//Brute force Method
	public static int findLargestNumber(int arr[]) {
		for(int i=0; i < arr.length;i++) {
			boolean maxNum =true;
			for(int j=0; j < arr.length;j++) {
				if( arr[j] > arr[i]) {
					maxNum = false;
					break;
				}
			}
			if(maxNum) {
				return arr[i]; 
			}
		}
		
		return -1;
	}
	
    //Efficient solution
	public static int findLargestNum(int arr[]) {
		int res=0;
		for(int i=1; i < arr.length;i++) {
			if( arr[i] > arr[res]) {
				res = i;
			}
		}
		return arr[res];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 45, 2, 67, 34, 89, 23};
		System.out.println(findLargestNumber(arr));
		System.out.println(findLargestNum(arr));
	}

}
