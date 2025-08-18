package Arrays;

public class Remove_Duplicate_in_Sorted_Array {
	
	
	public static int removeDuplicate(int[] arr) {
		int[] tempArr = {};
		int pos =0;
		for(int i=0; i< arr.length;i++) {
			for(int j= i+1;i < arr.length;i++) {
				if(arr[i] != arr[j]) {
					tempArr[pos] =arr[i];
					pos++;
				}
			}
		}
		
		return tempArr.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,5,4,7};
		int res = removeDuplicate(arr);
		System.out.println(res);
	
	}

}
