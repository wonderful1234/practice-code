package ÁªÏµ;
import java.util.*;
public class Mainkh {
	public static void main(String[] args) {
		int n,m,i,j,k=0,l=0,o=0,sum=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		m=reader.nextInt();
		int[]a=new int[n];
		int[]b=new int[m];
		int[]c=new int[m+n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(j=0;j<b.length;j++)
			b[j]=reader.nextInt();
			i=0;
			j=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]>b[j]) {
				c[k]=a[i];
				k++;
				c[k]=b[j];
			}
			if(a[i]<b[j])
			{
				c[k]=b[j];
				k++;
				c[k]=a[i];
			}
			i++;
			j++;
			k++;
		}
		if(i==a.length&&j<b.length)
		{
			l=j;
			while(k<c.length)
			{
				c[k]=b[l];
				l++;
				k++;
			}
		}
		if(j==b.length&&i<a.length)
		{
			o=i;
			while(k<c.length)
			{
				c[k]=a[o];
				k++;
				o++;
			}
		}
		for(k=0;k<c.length;k++)
			sum+=(c[k]*k);
		System.out.println(sum);	
	}

}
