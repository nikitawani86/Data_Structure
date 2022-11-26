package daa;

public class BinarySearch {
	
	 int binarysearch(int arr[],int key,int low , int high) {
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(key==arr[mid]) {
				return mid;
			}
			if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int arr[]= {67,78,98,45,23};
		int key = 98;
		int n = arr.length;
		int result = bs.binarysearch(arr, key, 0, n-1);
		if(result == -1) {
			System.out.println("Key is not found");
			
		}else {
			System.out.println("Key is found "+result);
		}
		
		

	}

}
