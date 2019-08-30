package ÁªÏµ;
import java.util.*;
public class Maino {
	public static void main(String[] args) {
		int n,i,j,sum=0;
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
			for(j=0;j<a.length;j++)
			{
				if(a[i][0]<a[j][0]&&a[i][1]<a[j][1])
					sum++;
			}
			System.out.println(sum);
			sum=0;
		}
	}

}
