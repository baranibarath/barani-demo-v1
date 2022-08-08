package barani;

import java.util.Scanner;

public class stringTest {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int m = 2 * n;
		int i,j;
		String l = "";
		String o = "";
		
		for(i =0 ; i<n; i++)
		{
			 l = sc.next();
			 o = sc.next();
			 String a = "";
			 for(j=0;j<l.length();j++)
			 {
				 if(l.charAt(j) == o.charAt(j))
					 a=a+"G";
				 else
					 a=a+"B";
			 }
			 System.out.println(a);
		}
		
//		String a [][] = new String [m-1][10];
//		for(i =0 ; i<m-1; i++)
//		{
//			System.out.println(i);
//		    for( j = 0; j < 5 ; j++)
//		    {
////		    	sc.nextLine();
//		    	a[i][j] = sc.next();
//		    	System.out.println(a[i][0]);
//		    }
//		    
//		}
//		System.out.println(a[3][0]);
		}

}
