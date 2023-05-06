import java.util.*;
public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		char ch ='\0';
		String s = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ch) {
				ch=str.charAt(i);
				s+=ch;
				
			}
		}
		System.out.print(s);
		
	}

}
