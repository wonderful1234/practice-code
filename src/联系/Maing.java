package ÁªÏµ;
import java.util.*;
public class Maing {
	public static void main(String[] args) {
		int n,i=0,k=0,y=0,sum=1,v=0,l=0,z=0;
		List<Integer>m=new ArrayList<>();
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		int[]c=new int[n];
		int[]d=new int[n];
		int[]x=new int[n];
		for(i=0;i<a.length;i++)
		{
			a[i]=reader.nextInt();
			b[i]=reader.nextInt();
		}
		c=a.clone();
		Arrays.sort(c);
		for(i=0;i<c.length;i++)
		{
			k=sun(c[i],a);
			m.add(k);
			for(y=0;y<a.length;y++)
			{
				if(a[k]<a[y]&&b[k]>b[y])
				{
					k=y;
					m.add(y);
					sum++;
				}	
			}
			d[v]=sum;
			v++;
			sum=1;
		}
		x=d.clone();
		Arrays.sort(x);
		l=sun(x[x.length-1],d);
		for(i=l-1;i>=0;i--)
			z+=d[i];
		System.out.println(x[x.length-1]);
		for(i=z-1;i<z+x[x.length-1];i++)
			System.out.println(m.get(i)+1);		
	}
	 static int sun(int f,int[]e)
	 {
		 int j=0;
		 for(j=0;j<e.length;j++)
		 {
			 if(e[j]==f)
				break;
		 }
		 return j;
	 }
}
