import java.util.*;

class reverse{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	
	//Input
	System.out.println("enter 5 integer");
	for(int i=0;i<a.length;i++)//Row
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("reversing the array");
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
		
			
	}
}
}