package ÁªÏµ;
import java.util.*;
public class Mainhy {
	public static void main(String[] args) {
		int n,i,m=0,sum=0,k=1;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0) {
				sum+=(a[i]*k);
				k++;
			}
			
			if(a[i]<0)
			{
				if(sum>m)
					m=sum;
				sum=0;
				k=1;
			}
		}
		if(sum>m)
			System.out.println(sum);
		else
			System.out.println(m);
	}
}
