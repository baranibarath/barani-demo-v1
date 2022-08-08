package barani;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
// 		int arr1[] = new int[4];
		for(int i=0;i<4;i++)
		{
		    int count =0;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    if (a> 10)
		    {
		        count++;
		    }
		    if(b>10)
		    {
		        count++;
		    }
		    if(c>10)
		    {
		        count++;
		    }
		    if(d>10)
		    {
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
