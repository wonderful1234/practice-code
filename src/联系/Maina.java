package ÁªÏµ;
import java.util.*;
public class Maina {
	public static void main(String[] args) {
		int n,a,b,c,d,sum,s;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextInt();
		d=reader.nextInt();
		if(d>b)
		{
			sum=d-b;
			s=c-a-sum;
		}
		else
		{
			sum=b-d;
			s=c-a-sum;
		}
		System.out.print(sum+s);
	}

}
