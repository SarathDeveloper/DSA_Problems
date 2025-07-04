package Arrays;

public class Second_Largest_Number_in_Array {

	//Naive approach
	public static int secondLargestNumber(int[] arr) {
		
		// 1.find Largest number
		int largest = 0;
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > arr[largest]) {
				largest = i;
			}
		}
		
		// 2. find second largest
		int res = -1;
		 for(int i = 0; i < arr.length;i++ ) {
			 if(arr[i] != arr[largest]) {
				 if( res == -1) {
					 res = i;
				 }else if( arr[i] > arr[res]){
					 res = i;
				 }
			 }
		 };
		return res;
	}
	
	
	//Efficeint Approach
	public static int secondLargestNumber2(int arr[]) {
		if(arr == null || arr.length < 2) return -1;
		int largest =0;
		int res= -1;
		for(int i=1; i< arr.length; i++) {
			if(arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			}else if( arr[i] != arr[largest]) {
				if(res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,1,5,8,9}; 
		int secondLargest = secondLargestNumber(arr); // Naive
		int secondLargest2 = secondLargestNumber2(arr); // Efficent
		if(secondLargest == -1) {
			System.out.println(" there is no second largestelemet");
		}else {
		System.out.println(arr[secondLargest2]);
		}
	}

}
