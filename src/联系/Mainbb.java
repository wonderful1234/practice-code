package ÁªÏµ;
import java.util.*;
public class Mainbb {
	public static void main(String[] args) {
		int a,b,c,k,m,n,l;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextInt();
		m=a;
		n=b;
		l=c;
		do {
			k=a%b;
			a=b;
			b=k;
		}while(k!=0);
		a=m*n/a;
		m=a;
		do {
			k=a%c;
			a=c;
			c=k;
		}while(k!=0);
		System.out.print(m*l/a);
	}
}
