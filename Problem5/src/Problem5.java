/**
 * @(#)Problem5.java
 *
 * Problem5 application
 *
 * @author
 * @version 1.00 2011/12/16
 */

public class Problem5
{
//REQUIRES BACKTRACKING!!!!!
    public static void main(String[] args)
    {
    	int remainder=0;
    	int sum=0;
    	int count=0;
    	boolean test=false;


    	for(int n=1; test==false; n++)
    	{
    		count++;
    		//System.out.println(count);

//    		for(int k=1;k<=20;k++)
//    		{
    			//System.out.println(k);
//    			System.out.println(n);
//    			remainder=k%n;
//    			sum=sum+remainder;
				for(int i=20;i>=1;i--)
				{
					System.out.println(i);
					if((i%n)==0)
					{
						test=false;
					}
				}
////    		}
//    		System.out.println(sum);
//    		if(sum==0)
//    			test=false;
//    		else
//    			test=true;
    	}
    	System.out.println(count);
    }
}
