package ÁªÏµ;
import java.util.*;
public class Maink {
	public static void main(String[] args) {
		int n,m,i,sum=0;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        m=reader.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(i=0;i<a.length;i++)
            a[i]=reader.nextInt();
        for(i=0;i<b.length;i++)
            b[i]=reader.nextInt();
        for(i=0;i<a.length;i++)
        {
             
             if(b[i]!=i+1)
             {
            	 a[b[i]-1]+=a[i];
                 a[i]=0;
             }
        }
        Arrays.sort(a);
        i=a.length-1;
        while(m>0)
        {
            sum+=a[i];
            i--;
            m--;
        }
        System.out.print(sum);
    }
}
	


