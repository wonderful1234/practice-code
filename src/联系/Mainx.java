package ÁªÏµ;
import java.util.*;
public class Mainx {
	public static void main(String[] args) {
		int n,i=0,b=0,c=0,m=0,j=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length-1;i++)
			a[i]=reader.nextInt();
		Arrays.sort(a);
		for(i=0;i<a.length;i++)
		{
			if(a[i]<=n)
			{
				b=a[i];
				c=i;
			}
			break;	
		}
		j=b;
		for(i=c+1;i<a.length;i++)
		{
			if(a[i]<=n)
			{
				b=b^a[i];
				j+=a[i];
				if(j>=100000007)
					j=j%100000007;
			}
			else
				m=1;
			if(m==1)
				break;
		}
		System.out.print((j+b)%100000007);
	}
}
