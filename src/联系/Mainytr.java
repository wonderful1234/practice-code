package ÁªÏµ;
import java.util.*;
public class Mainytr {
	public static void main(String[] args) {
		int n,sum,m;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		String[]s=new String[n];
		for(int i=0;i<s.length;i++) {
			m=reader.nextInt();
			s[i]=reader.next();
		}
			
		
		for(int j=0;j<s.length;j++)
		{
			sum=0;
			while(s[j].contains("mrnb")) {
				s[j]=s[j].replaceAll("mrnb","");
				sum++;
			}
			System.out.println(sum);
		}
			
		
		
	}

}
