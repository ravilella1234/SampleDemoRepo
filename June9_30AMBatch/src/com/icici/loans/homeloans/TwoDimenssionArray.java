package com.icici.loans.homeloans;

public class TwoDimenssionArray 
{

	public static void main(String[] args) 
	{
		int p[] = {10,20,30};
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		
		int a[][] = {
						{1,2,3,4},
						{5,6},
						{8,9,10,11,12}
				    };
		
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				System.out.print(a[x][y]+"  ");
			}
			System.out.println("");
		}
		

		for(int a1[] : a)
		{
			for(int a0: a1)
			{
				System.out.print(a0 + " ");
			}
			System.out.println("");
		}
		
	}

}
