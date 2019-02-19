/**
 * @(#)Problem1.java
 *
 * Problem1 application
 *
 * @author
 * @version 1.00 2011/12/9
 */

 //import java.util.Scanner;

public class Problem1
{

    public static void main(String[] args)
    {

    	//Scaner keyboard = new Scanner(System.in);
    	int sum3 = 0, sum5 = 0;
		int sumx = 0;

		for(int n=1; 3*n<1000; n++)
		{
			sum3 = sum3+3*n;
		}
		System.out.println(sum3);

		for(int n=1; 5*n<1000; n++)
		{
			sum5 = sum5+5*n;
		}

		System.out.println(sum5);
		System.out.println(sum3+sum5);

		for(int n=5; 3*n<1000; n+=5)
		{
			sumx = sumx+3*n;
		}
		System.out.println((sum3+sum5)-sumx);

    }
}
