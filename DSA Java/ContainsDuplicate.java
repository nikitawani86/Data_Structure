import java.util.*;
class result{
	
boolean  contains_duplicates(int arr[]) {
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
	int arr[]= {1,2,3,1};
	result obj = new result();
	obj.contains_duplicates(arr);
	
	}}
