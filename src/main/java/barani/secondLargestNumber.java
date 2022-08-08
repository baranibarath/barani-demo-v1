package barani;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNumber {
	public static void main(String [] args) {
	int i;
	int j;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[][] = new int[n][2];
	System.out.println("Enter");
	for(i = 0; i<n;i++)
	{
		for( j=0;j<2;j++)
		{
			arr [i][j] = sc.nextInt();
		}
		System.out.println(arr[i][0]);
		System.out.println(arr[i][1]);
		
		if(arr[i][0] < arr[i][1])
		{
			System.out.println("FIRST");	
		}
		if(arr[i][0] > arr[i][1]) 
		{
			System.out.println("SECOND");
		}
		if(arr[i][0] == arr[i][1])
		{
			System.out.println("Equal");
		}
			
	}
	
	}
}

	
//	int n = sc.nextInt();
//	
//	String n = sc.nextLine();
//	String arr [] =n.split(" ");
//	for(String w:arr)
//	{
//		System.out.println(w);
//	}
//	Arrays.sort(arr);
//	System.out.println("numbers are " + arr);

//	int arr[] = new int[100];
//	{
//	for (int i = 0;i<n;i++)
//	{
//		arr[i] = sc.nextInt();
//		System.out.println(arr[i]);
//	}
//	}

