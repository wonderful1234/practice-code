package ÁªÏµ;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i,c=1,n=1,b;
		String str=new String();
		String s;
		Scanner reader=new Scanner(System.in);
		str=reader.next();
		for(i=0;i<str.length();i++)
		{
			s=str.substring(i, i+1);
			if(Integer.parseInt(s)!=0)
				n=n*Integer.parseInt(s);
		}
		while(n>=10)
		{
			while(n!=0)
			{
				b=n%10;
				n=n/10;
				if(b!=0)
					c=c*b;
			}
			n=c;
			c=1;
		}
		if(str.length()==1&&str.charAt(0)-'0'==0)
			System.out.print(0);
		else
			System.out.print(n);
		reader.close();
	}
}

