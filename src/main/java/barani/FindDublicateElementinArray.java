package barani;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindDublicateElementinArray {
	
	public static void main(String [] args)
	{
		
		List<String> list = new ArrayList<String>();
		for(int i =0 ; i< 10 ; i++)
		{
			list.add(String.valueOf(i));
		}
		
		for(int j =0 ; j< 20 ; j++)
		{
			list.add(String.valueOf(j));
		}
		
		System.out.println(list);
		System.out.println(processList(list));
	}
	
	public static Set<String> processList(List<String> process)
	{
		final Set<String> duplicate = new HashSet<String>();
		final Set<String> orginal = new HashSet<String>();
		
		for(String value : process)
		{
			if(!orginal.add(value))
			{
				duplicate.add(value) ;
			}
		}
		return orginal;
		
		
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int arr[] = new int [m];
//		for(int i = 0; i<m ; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
		
	}

}
