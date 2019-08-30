package ÁªÏµ;
import java.util.*;
public class Mainiu {
	public static void main(String[] args) {
		int t,i;
		Scanner reader=new Scanner(System.in);
		t=reader.nextInt();
		int[][]a=new int[t][2];
		for(i=0;i<a.length;i++)
		{
			a[i][0]=reader.nextInt();
			a[i][1]=reader.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i][0]%(a[i][1]+1)==0)
				System.out.println("Mio");
			else
				System.out.println("Yui");
		}
	}

}
