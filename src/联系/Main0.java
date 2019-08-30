package ÁªÏµ;
import java.util.*;
public class Main0 {
	public static void main(String[] args) {
		int n,i,c,max,j=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		int[]b=new int[a[n-1]-a[0]+1];
		c=a[0];
		for(i=0;i<a.length;i++)
			b[a[i]-(c)]++;
		max=b[0];
		for(i=1;i<b.length;i++)
		{
			if(max<b[i])
			{
				max=b[i];
				j=i;
			}
		}
		System.out.print(j+a[0]);
		
	}

}
