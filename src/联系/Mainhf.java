package ÁªÏµ;
import java.util.*;
public class Mainhf {
	public static void main(String[] args) {
		int n,i,j,b=0,c=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[][]a=new int[n][2];
		for(i=0;i<a.length;i++)
		{
			a[i][0]=reader.nextInt();
			a[i][1]=reader.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			b=a[i][0]+a[i][1];
			for(j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					if(a[j][0]==b) {
						c=1;
						break;
					}
					
				}
			}
			if(c==1)
				break;
			
		}
		if(c==1)
			System.out.println("YE5");
		else
			System.out.println("N0");
	}

}
