package ÁªÏµ;
import java.util.*;
public class Main2 {
	public static void main(String[] args) {
		int n,i,j=0,sum=0,add=0,m,k,h;
		Scanner reader =new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
		{
			a[i]=reader.nextInt();
		}
		i=0;
		m=a.length-1;
		while(j<n)
		{
			k=Math.max(a[i],a[m]);
			sum+=k;
			j++;
			if(k==a[i])
				i++;
			if(k==a[m])
				m--;
			h=Math.max(a[i],a[m]);
			add+=h;
			j++;
			if(h==a[i])
				i++;
			if(h==a[m])
				m--;
		}
		if(sum>add)
			System.out.print("Applese");
		else
			System.out.print("Bpplese");	
	}
}
