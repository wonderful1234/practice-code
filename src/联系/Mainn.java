package ÁªÏµ;
import java.util.*;
public class Mainn {
	public static void main(String[] args) {
		int i,n,sum=0,s=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n+1];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=1;i<=n;i++)
			sum=sum^i;
		for(i=0;i<a.length;i++)
			s=s^a[i];
		System.out.print(sum^s);
	}

}
