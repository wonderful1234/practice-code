package ÁªÏµ;
import java.util.*;
public class Mainlo {
	public static void main(String[] args) {
		int n,i,j,sum,add=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		String str=new String();
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		for(i=0;i<a.length;i++) {
			sum=0;
			str=Integer.toBinaryString(a[i])+Integer.toBinaryString((-a[i]));
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='1')
					sum++;
			}
			str=null;
			if(sum<=32)
				add+=-1;
			if(sum>32)
				add+=1;
			
		}
		System.out.println(add);
			
		
		
	}

}
