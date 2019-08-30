package ÁªÏµ;
import java.util.*;
public class Main9
{

    public static void main(String[]args)
    {
        int n,i,m=0;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        int []a=new int[n];
        for(i=0;i<a.length;i++)
            a[i]=reader.nextInt();
        Arrays.sort(a);
        for(i=0;i<a.length;i++)
        {
        	if(a[i]>=60)
        		break;
        	m++;
        }
        System.out.print(m*400);
    }
}
