package barani;

import java.util.Scanner;

public class twoDimensionArrayTest {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i,j;
        
        for(int k =0;k<n;k++)
        {
        int m = sc.nextInt();
        int array1[][] = new int[m][m];
		for(i=0;i<2;i++)
		{
		    for(j=0;j<m;j++)
		    {
		        array1[i][j] = sc.nextInt();  
		
		    }
//		    System.out.println(array1[1][2]);
		}
		int count=0;
		for(j=0;j<m;j++)
		{
		if(array1[0][j] == array1[1][j])
			count++;
	    }
		System.out.println(count);
	}
	}
}
