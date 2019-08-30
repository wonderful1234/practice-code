package ÁªÏµ;
import java.util.*;
public class Main7 {
	public static void main(String[] args) {
		long n,m,d,x,sum=1,s;
		Scanner reader=new Scanner(System.in);
		n=reader.nextLong();
		m=reader.nextLong();
		d=reader.nextLong();
		x=reader.nextLong();
		s=n;
		while(sum<=x)
		{
			n=n+d;
			s+=n;
			sum++;
			if(s>=m)
				break;
		}
		System.out.print(sum);
	}
}
