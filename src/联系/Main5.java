package ÁªÏµ;
import java.util.*;
public class Main5 {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int n=reader.nextInt();
		int[] a = new int[n];
		int i;
		for(i=1;i<a.length;i++)
		{
		 a[i]=reader.nextInt();
		}
		for(i=1;i<a.length;i++)
		{
			if(a[i]%i!=0)
				break;
		}
		System.out.print(i);
	}
}
