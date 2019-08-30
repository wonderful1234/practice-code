package ÁªÏµ;
import java.util.*;
public class Maini {
	public static void main(String[] args) {
		int i,count=0;
		String str=new String();
		String s=new String();
		Scanner reader=new Scanner(System.in);
		str=reader.next();
		s=reader.next();
		String c=str.toLowerCase();
		String d=s.toLowerCase();
		int[]a=new int[26];
		int[]b=new int[26];
		if(str.length()!=s.length())
			System.out.print("no");
		else
		{
			for(i=0;i<c.length();i++)
			{
				a[c.charAt(i)-'a']++;
				b[d.charAt(i)-'a']++;
			}
			for(i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					count++;
			}
			if(count==a.length)
				System.out.print("yes");
			else
				System.out.print("no");
		}
		
	}

}
