package ÁªÏµ;
import java.util.*;
public class Mainkk {
	public static void main(String[] args) {
		int n,m,i,j,e,b,c,d,f,sum=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		m=reader.nextInt();
		int[][]a=new int[n][m];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				a[i][j]=reader.nextInt();
		}
		for(i=1;i<a.length-1;i++)
		{
			for(j=1;j<a[i].length-1;j++)
			{
				e=a[i-1][j];
				b=a[i+1][j];
				c=a[i][j-1];
				d=a[i][j+1];
				if(a[i][j]<e&&a[i][j]<b&&a[i][j]<c&&a[i][j]<d)
				{
					f=Math.min(Math.min(c, d),Math.min(e,b));
					sum+=(f-a[i][j]);
				}
			}
		}
		System.out.print(sum);
	}
}
