package Arrays;

public class Leaders_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,2,6,4,5,4,3};
		leaders(arr);
		leadersInArray(arr);
	
		
	}

	// Efficient Solution
	private static void leadersInArray(int[] arr) {
		int n =arr.length;
		int leader = arr[ n -1];
		System.out.print(" "+leader);
		for(int i= (n-2);i >=0;i--) {
			if(arr[i] > leader) {
				leader = arr[i];
				System.out.print(" "+leader);
			}
		}
	}
	//Naive solution
	private static void leaders(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] <= arr[j]) {
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.print(" "+arr[i]);
		}
	}

}
