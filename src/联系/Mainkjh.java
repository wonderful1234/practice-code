package ÁªÏµ;

import java.util.Scanner;

public class Mainkjh {
	public static void main(String[] args) {
		int i,t=0,c=0;
		Scanner reader=new Scanner(System.in);
		int[]a=new int[3];
		int[]b=new int[3];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<b.length;i++)
			b[i]=reader.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]>b[i])
			{
				t++;
				break;
			}
			if(a[i]==b[i])
				c++;
			
		}
		if(t==0&&c<3)
			System.out.println(2);
		if(t>0)
			System.out.println(1);
		if(t==0&&c==3)
			System.out.println("God");
		
		
	}

}
