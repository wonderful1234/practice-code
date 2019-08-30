package ÁªÏµ;
import java.util.*;
public class Mainll {
	public static void main(String[] args) {
		int n,i,j;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		char[]d;
		String[]s=new String[n];
		for(i=0;i<s.length;i++)
			s[i]=reader.next();
		for(i=0;i<s.length;i++)
		{
			d=s[i].toCharArray();
			for(j=0;j<d.length;j++)
			{
				if(j%2==0)
					System.out.print(d[j]);
			}
			System.out.println();
		}
	}

}
