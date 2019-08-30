package ÁªÏµ;
import java.util.*;
public class Mainjjk {
	public static void main(String[] args) {
		int a,b,i,j,k,m,sum=0;
		boolean h=false;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		String[]str=new String[a];
		String[]s=new String[b];
		for(i=0;i<str.length;i++)
			str[i]=reader.next();
		for(i=0;i<s.length;i++)
			s[i]=reader.next();
		for(i=0;i<str.length;i++)
		{
			sum=0;
			for(j=0;j<s.length;j++)
			{
				h=false;
				for(k=0;k<s[j].length();k++) {
					m=str[i].indexOf(s[j].charAt(k));
					if(m<0)
					{
						h=true;
						break;
					}	
				}
				if(h==false)
					sum++;
			}
			System.out.println(sum);
		}	
	}
}
