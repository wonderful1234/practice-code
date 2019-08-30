package ÁªÏµ;
import java.util.*;
public class Mainy {
	public static void main(String[] args) {
		int t,i,j,k=1,sum=0;
		Scanner reader=new Scanner(System.in);
		t=reader.nextInt();
		int[]a=new int[t];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		i=0;
		while(i<t)
		{
			if(a[i]<0) {
				System.out.println(-1);
				i++;
			}
			
			if(a[i]==0) {
				System.out.println(0+""+0);
				i++;
			}
			if(a[i]>0)
			{
				sum=a[i];
				for(j=2;j<a[i]/2;j++)
				{
					if(a[i]%(j*j)==0) {
						k=k*j;
						sum=a[i]/(j*j);
						a[i]=sum;
						continue;
					}
				}
				System.out.println(k+" "+sum);
				j++;
				k=1;
			}
			i++;
		}
	}		
}
