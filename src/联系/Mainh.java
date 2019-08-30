package ÁªÏµ;
import java.util.*;
public class Mainh {
	public static void main(String[] args) {
		int t,i,j,m,n,sum,l=0;
		Scanner reader=new Scanner(System.in);
		t=reader.nextInt();
		int[]b=new int[t];
		int[][]a=new int[52][52];
		while(t>0)
		{
			sum=0;
			m=reader.nextInt();
			n=reader.nextInt();
			for(i=1;i<=m;i++)
			{
				for(j=1;j<=n;j++)
					a[i][j]=reader.nextInt();
			}
			for(i=1;i<=m;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(a[i][j]==1)
					{
						if(a[i-1][j]==1||a[i+1][j]==1||a[i][j-1]==1||a[i][j+1]==1)
							sum++;
					}
				}
			}
			for(i=1;i<=m;i++)
			{
				for(j=1;j<=n;j++)
					a[i][j]=0;
			}
			b[l]=sum;
			l++;
			t--;
			
		
		
		}
	}

}
