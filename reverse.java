import java.util.*;
import java.io.*;
class reverse
{
	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			int ar=s1.length();
			char a[]=s1.toCharArray();
			int l,r=0;
			r=a.length-1;
			for(l=0;l<r;l++,r--)
				{
					
					if (!Character.isAlphabetic(a[l])) 
					{
                      l++;
                    } 
            else if(!Character.isAlphabetic(a[r])) 
            	{
               		 r--; 
				}
				else
				{
					char temp=a[l];
					a[l]=a[r];
					a[r]=temp;
				}}
				for(int i=0;i<a.length;i++)
					{
					 System.out.print(a[i]+" ");
					}
		}
		
}