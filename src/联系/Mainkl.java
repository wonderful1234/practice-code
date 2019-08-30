package ÁªÏµ;
import java.util.*;
public class Mainkl {
	public static void main(String[] args) {
		int n,j,i,sum=0,k;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<a.length;i++)
		{
			k=1;
			for(j=2;j<=a[i];j++)
				k*=j;
			sum+=k;
		}
		System.out.println(sum);
	}

}
