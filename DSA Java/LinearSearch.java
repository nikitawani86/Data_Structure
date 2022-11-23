public class LinearSearch{

	public static int search(int arr[],int key){
	for(int i=0;i<arr.length;i++){
	if(arr[i]==key)
	{
	return i+1;
	}
}
	return -1;
	
}
	public static void main(String args[])
{
		int arr[]={56,45,23,12,45,78};
		int key = 12;
		int  result = search(arr,key);
		if(result==-1)
{	
		System.out.println("Key is  not found");
	
}
		else
{
		System.out.println("Key is found");
}
	
	
}
}