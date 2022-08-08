package barani;

import java.util.Scanner;

public class recentContest {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0 ; i< n ; i++)
		{
		    int m = sc.nextInt();
		    sc.nextLine();
		    String name = sc.nextLine();
//		    System.out.println(name);
		    String [] p = name.split("//s");
		    int count = 0;
		    int count1 = 0;
		    for(String q:p)
		    {
		    	
		    	if(q.equals("START38"))
		    	{
		    		System.out.println(q);
		    		count++;
		    	}
		    	if(q.equals("LTIME108"))
		    	{
		    		System.out.println(q);
		    		count1++;
		    	}
		    	System.out.print(count);
		    	System.out.print(" "+count1);
		    }
		}
	}

}
