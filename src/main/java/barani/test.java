package barani;

import org.checkerframework.common.value.qual.StaticallyExecutable;

public class test {
	
	public static void main(String [] args)
	{
		String s1 = "Barath";
		int i;
		for(i =0; i< s1.length();i++)
		{
			int count = 0;
			for(int j= i+1; j< s1.length();j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
					count++;
				{
				if(count == 1) {
					System.out.println(s1.charAt(i));
					break;	
				}
				}
			}	
		}
	}

}
