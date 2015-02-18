/**
 * @(#)Problem6.java
 *
 * Problem6 application
 *
 * @author 
 * @version 1.00 2011/12/16
 */
 
public class Problem6 
{
    
    public static void main(String[] args) 
    {
    	int sumSquares=0;
    	int squareSums=0;
    	int diff=0;    	
    
   		for(int i=1; i<=100;i++)
   		{
   			sumSquares=sumSquares+(i*i);
   		}
   		for(int k=1; k<=100;k++)
   		{
   			squareSums=squareSums+k;
   		}
   		squareSums=squareSums*squareSums;
   		
   		diff=squareSums-sumSquares;
   		System.out.println(diff);
    }
}
