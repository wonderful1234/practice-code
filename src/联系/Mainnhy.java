package ÁªÏµ;
import java.util.*;
public class Mainnhy {
	public static void main(String[] args) {
		long a,b,r=1,base,c;
		int p;
		Scanner reader=new Scanner(System.in);
		a=reader.nextLong();
		b=reader.nextLong();
		p=reader.nextInt();
		base=a;
		while(b!=0)
		{
			c=b&1;
			if(c!=0)
				r*=base;
			if(r>=Long.MAX_VALUE/base)
				r=r%p;
			base*=base;
			b>>=1;
		}
		System.out.println(r%p);
		
	}

}
