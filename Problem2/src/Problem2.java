/**
 * @(#)Problem2.java
 *
 * Problem2 application
 *
 * @author 
 * @version 1.00 2011/12/16
 */
 
public class Problem2 
{
    
    public static void main(String[] args) 
    {
    	int sum=0;
   		int fibNums[]=new int[34];
   		fibNums[0]=1;
   		fibNums[1]=1;
   		for (int k=1; k<33; k++)
   		{
   			fibNums[k+1]=fibNums[k]+fibNums[k-1];
   			if (fibNums[k]%2==0)
   			{
   				sum=sum+fibNums[k];
   			}
   		}
   		System.out.println(sum);
    }
}
