package ÁªÏµ;
import java.util.*;
public class Mainm {
	public static void main(String[] args) {
		String str=new String();
		int i=1,n;
		boolean m=false;
		Scanner reader=new Scanner(System.in);
		str=reader.next();
		n=str.length();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				m=str.substring(0,i).equals(str.substring(i,i+i));
				if(m==true)
					break;
			}
		}
		if(i==n/2+1)
			System.out.print(str.length());
		else
			System.out.print(i);
	}

}
