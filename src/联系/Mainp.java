package ÁªÏµ;
import java.util.*;
public class Mainp {
	public static void main(String[] args) {
		int n,m,i,j,c=0,d=0,sum=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		sum=a[0];
		m=reader.nextInt();
		int[]b=new int[m];
		for(j=0;j<b.length;j++)
			b[j]=reader.nextInt();
		for(j=0;j<b.length;j++)
		{
			c=Math.abs(b[j]-a[0]);
			for(i=1;i<a.length;i++)
			{
				d=Math.abs(b[j]-a[i]);
				if(c>d)
				{
					c=d;
					sum=a[i];
				}	
			}
			System.out.println(sum);
		}
	}
}
