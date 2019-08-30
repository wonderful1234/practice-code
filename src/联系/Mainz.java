package ÁªÏµ;
import java.util.*;
public class Mainz {
	public static void main(String[] args) {
		int n,i,l=10,s=0;
		String m="0";
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		String[]str=new String[n];
		for(i=0;i<str.length;i++)
			str[i]=reader.nextLine();
		    str[i].trim();
		for(i=0;i<str.length;i++)
		{
			if(str[i]=="CLEAR")
				m="0";
			if(str[i].charAt(0)=='N')
			{
					m=str[i].substring(4);
			}
				
			if(str[i].charAt(0)=='C')
			{
				if(l==10)
				{
					if(str[i].charAt(7)-'0'==2) {
						m=Integer.toBinaryString(Integer.parseInt(m));
						s=2;
					}
					if(str[i].charAt(7)-'0'==8) {
						m=Integer.toOctalString(Integer.parseInt(m));
						s=8;
					}
					if(str[i].substring(7,9)=="16") {
						m=Integer.toHexString(Integer.parseInt(m));
						s=16;
					}
				}
				if(l==2)
				{
					if(str[i].charAt(7)-'0'==8)
					{
						m=Integer.valueOf(m,2).toString();
						m=Integer.toOctalString(Integer.parseInt(m));
						s=8;
					}
					if(str[i].charAt(7)-'0'==10)
					{
						m=Integer.valueOf(m,2).toString();
						s=10;
					}
					if(str[i].substring(7,9)=="16")
					{
						m=Integer.valueOf(m,2).toString();
						m=Integer.toHexString(Integer.parseInt(m));
						s=16;
					}
				}
				if(l==8)
				{
					if(str[i].charAt(7)-'0'==2)
					{
						m=Integer.valueOf(m,8).toString();
						m=Integer.toBinaryString(Integer.parseInt(m));
						s=2;
					}
					if(str[i].charAt(7)-'0'==10)
					{
						m=Integer.valueOf(m,8).toString();
						s=10;
					}
					if(str[i].substring(7,9)=="16")
					{
						m=Integer.valueOf(m,8).toString();
						m=Integer.toHexString(Integer.parseInt(m));
						s=16;
					}
				}
				if(l==16)
				{
					if(str[i].charAt(7)-'0'==2)
					{
						m=Integer.valueOf(m,16).toString();
						m=Integer.toBinaryString(Integer.parseInt(m));
						s=2;
					}
					if(str[i].charAt(7)-'0'==8)
					{
						m=Integer.valueOf(m,16).toString();
						m=Integer.toOctalString(Integer.parseInt(m));
						s=8;
					}
					if(str[i].charAt(7)-'0'==10)
					{
						m=Integer.valueOf(m,16).toString();
						s=10;
					}
				}
				l=s;
			}
			if(str[i]=="EQUAL")
				System.out.print(m);
			else
			{
				if(str[i]=="ADD")
				{
					m=Integer.valueOf(m,l).toString();
					m=String.valueOf((Integer.parseInt(m)+Integer.parseInt(str[i+1].substring(4),l)));
				}
				if(str[i]=="SUB")
				{
					m=Integer.valueOf(m,l).toString();
					m=String.valueOf((Integer.parseInt(m)-Integer.parseInt(str[i+1].substring(4),l)));
				}
				if(str[i]=="MUL")
				{
					m=Integer.valueOf(m,l).toString();
					m=String.valueOf((Integer.parseInt(m)*Integer.parseInt(str[i+1].substring(4),l)));
				}
				if(str[i]=="DIV")
				{
					m=Integer.valueOf(m,l).toString();
					m=String.valueOf((Integer.parseInt(m)/Integer.parseInt(str[i+1].substring(4),l)));
				}
				if(str[i]=="MOD")
				{
					m=Integer.valueOf(m,l).toString();
					m=String.valueOf((Integer.parseInt(m)%Integer.parseInt(str[i+1].substring(4),l)));
				}
				i++;
				l=10;
			}
		}
	}
}
				
