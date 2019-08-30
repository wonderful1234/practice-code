package ÁªÏµ;
import java.util.*;
public class Mainmm {
	public static void main(String[] args) {
		int n,i,j=0,sum=0,h=0,l=0;
		boolean u=false;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		int[][]c=new int[n][2];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<a.length;i++)
		{
			u=false;
			sum=a[i];
			for(h=0;h<=j;h++)
			{
				if(sum+b[h]<=100)
				{
					c[l][0]=sum;
					b[j]+=sum;
					c[l][1]=h+1;
					l++;
					u=true;
					break;
				}	
			}
			if(u==false)
			{
				j++;
				c[l][0]=sum;
				b[j]+=sum;
				c[l][1]=j+1;
				l++;
			}	
		}
		for(i=0;i<c.length;i++)
			System.out.println(c[i][0]+":"+c[i][1]);
		System.out.println(j+1);
		
	}
}
