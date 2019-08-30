package ÁªÏµ;
import java.util.*;
public class Main6
{
    public static void main(String[]args)
    {
        int n,X,i,j;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        X=reader.nextInt();
        int[][]a=new int[n][2];
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<2;j++)
                a[i][j]=reader.nextInt();
        }
        for(i=a.length-1;i>=0;i--)
        {
            if(a[i][0]==1)
                X-=a[i][1];
            if(a[i][0]==2)
                X+=a[i][1];
            if(a[i][0]==3)
                X=X/a[i][1];
            if(a[i][0]==4)
                X=X*a[i][1];
        }
        System.out.print(X);
	}
}