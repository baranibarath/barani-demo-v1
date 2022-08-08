package barani;

import java.util.Scanner;

public class factorial {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++)
		{
			int number = sc.nextInt();
			int fact = 1;
			
			for(int j = number ; j>=1;j--)
			{
				fact = fact*j;
			}
			System.out.println(fact);
			
		}
				}
}
