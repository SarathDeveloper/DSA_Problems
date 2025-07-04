package Arrays;

public class Check_Array_is_Sorted {

	
	
	
	//Efficient Solution
	public static boolean checkArrayIsSorted(int[] arr) {
		
		for(int i=1; i < arr.length	;i++) {
			if(arr[i] < arr[i-1]) 
				return false;
		}
		return true;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,7,20,20,50,64};
		System.out.println(checkArrayIsSorted(arr));

	}

}
