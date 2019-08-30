package ÁªÏµ;
import java.util.*;
public class Mainhh {
	public static void main(String[] args) {
		int i=0,j,e;
		String[]str=new String[1000];
		Scanner reader=new Scanner(System.in);
		String s;
		while(true)
		{
			s=reader.next();
			if(s.contains("#")==true)
			{
				j=s.indexOf('#');
				s=s.substring(0,j);
				str[i]=s;
				break;
			}
			if(s.contains("#")==false)
			{
				str[i]=s;
				i++;
			}
		}
		e=i;
		for(i=0;i<=e;i++)
			System.out.println(str[i]);
	}

}
