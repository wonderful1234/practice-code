package ÁªÏµ;
import java.util.*;
 class Mainb {
	public static void main(String[] args) {
		int n,i,a,b,e=9,sum=0,m=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(i=10;i<=n;i++)
		{
			b=i;
			while(b>0)
			{
				a=b%10;
				b=b/10;
				if(a<=e)
					e=a;
				else
				{
					m=1;
					break;
				}
			}
			if(m!=1)
			{
				System.out.println(i);
				sum++;
			}
			m=0;
			e=9;
		}
		if(sum==0)
			System.out.println(-1);
	}
}
