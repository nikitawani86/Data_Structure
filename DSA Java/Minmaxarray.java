import java.util.*;
public class Minmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how mant value you have to enter");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max= 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				max= arr[i];
			}
		}
		System.out.println("Maximum value of array is "+max);
		
		int min =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minumum value of array is : "+min);
	}

}
