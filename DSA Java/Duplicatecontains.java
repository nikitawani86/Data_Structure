
	
public class contains {
	public static boolean  contains_duplicates1(int arr[]) {
		for(int i=0;i<5;i++) {
			int j=i+1;
			while(j<arr.length) {
				if(arr[i]==arr[j]) {
					return true;
				}
				j++;
				
			}
			
		}
		return false;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		if(contains_duplicates1(arr)) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
	}

}
