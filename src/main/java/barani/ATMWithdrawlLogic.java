package barani;

import java.util.Scanner;

public class ATMWithdrawlLogic {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		if(d1%5 == 0)
		{
			for(int i =0;i<2;i++)
			{
//				double d1 = sc.nextDouble();
//				double d2 = sc.nextDouble();
//				double d3 = d2 - d1;
				if(d1<d2)
				{
				double d3 = (d2-d1) - 0.50;
				String str = String.format("%.2f", d3);
				System.out.println(str);
			    }
				if(d1>d2)
				{
				System.out.println(d2);
			    }
			
		}

		}
		else
		{
			System.out.println(d2);
		}
		
}
}
