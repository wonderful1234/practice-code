package ÁªÏµ;
import java.util.*;
public class Maingg {
	public static void main(String[] args) {
		int n,i,l,m;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		long[][]a=new long[n][4];
		
		for(i=0;i<a.length;i++)
		{
			a[i][0]=reader.nextLong();
			a[i][1]=reader.nextLong();
			a[i][2]=reader.nextLong();
			a[i][3]=reader.nextLong();
		}
		for(i=0;i<a.length;i++)
		{
			l=0;
			m=0;
			if(a[i][0]<=0)
				l++;
			if(a[i][0]>a[i][1])
				m++;
			if(a[i][2]<a[i][1])
				l++;
			if(a[i][2]<=a[i][3]&&a[i][1]>1)
				l++;
			if(a[i][2]-a[i][3]<a[i][1])
				l++;
			if(l==0||m>0)
				System.out.println("Yes");
			if(l>0)
				System.out.println("QAQ");
		}
		
		
	}

}
