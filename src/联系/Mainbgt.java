package ÁªÏµ;
import java.util.*;
public class Mainbgt {
	public static void main(String[] args) {
		int n,i,v=0;
		double d;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		int[]a=new int[n];
		for(i=0;i<a.length;i++)
			a[i]=reader.nextInt();
		Arrays.sort(a);
		for(i=a.length-1;i>=0;i--)
		{
			d=Math.sqrt(a[i]);
			v=(int)d;
			if(d!=v) {
				v=a[i];
				break;
			}
		}
		System.out.println(v);
	}

}
