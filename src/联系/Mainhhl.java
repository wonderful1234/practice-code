package ÁªÏµ;
import java.util.*;
public class Mainhhl {
	public static void main(String[] args) {
		int n,i=0,k,j,l=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		String str,s;
		boolean t=false;
		String[]b;
		String[]a=new String[n];
		String[]c=new String[n];
		reader.nextLine();
		for(i=0;i<c.length;i++)
			c[i]=reader.nextLine();
		i=0;
		while(i<n)
		{
			t=false;
			s=null;
			l=0;
			b=c[i].split(" ");
			for(j=0;j<b.length;j++)
			{
				if(b[i].contains("ong,")&&b[b.length-1].contains("ong."))
					l=2;	
			}
			if(l==2)
			{
				t=true;
				b[b.length-3]="qiao";
				b[b.length-2]="ben";
				b[b.length-3]="zhong";
			}
			for(k=0;k<b.length;k++)
				s=s+(b[k]+" ");
			if(t==true)
				a[i]=s;
			if(t==false)
				a[i]="Skipped";
			i++;
		}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
