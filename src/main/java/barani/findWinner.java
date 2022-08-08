package barani;

import java.util.Arrays;
import java.util.Scanner;

public class findWinner {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int i,d,p=0;
//		int arr[] = new int[n];
		for(i =0;i<n;i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = (a-b);
		    {
		    if(c > 0 && m < c)
//		    if(m > c)
		    {
		    m = c ;
		    p = 1;
		    }
		    }
		    d = b - a ;
		    {
		    if (d > 0 && m < d)
		    {
		    	 m = d ;
				 p = 2;
		    }
		}
//		Arrays.sort(arr);
//		System.out.println(n-1);
	}
		 System.out.print(p);
		 System.out.print(" "+m);
	}
}


