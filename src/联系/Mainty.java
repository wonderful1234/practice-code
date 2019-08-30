package ÁªÏµ;
import java.util.*;
public class Mainty {
	public static void main(String[] args) {
		int n,i,b=0,j=0,c=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[][]a=new int[n][4];
		for(i=0;i<a.length;i++)
		{
			a[i][0]=reader.nextInt();
			a[i][1]=reader.nextInt();
			a[i][2]=reader.nextInt();
			a[i][3]=reader.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			j=0;
			b=a[i][0]%a[i][1];
			while(j<a[i][3])
			{
				b=b*10;
				c=b/a[i][1];
				b=b%a[i][1];
				j++;
				if(j>=a[i][2])
					System.out.print(c);
			}
			System.out.println();
			
		}
	}
}
