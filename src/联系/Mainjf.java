package ÁªÏµ;
import java.util.*;
public class Mainjf {
	public static void main(String[] args) {
		int x0,y0,r,x1,y1,y2;
		double d,m,p,q,b,l;
		Scanner reader=new Scanner(System.in);
		x0=reader.nextInt();
		y0=reader.nextInt();
		r=reader.nextInt();
		x1=reader.nextInt();
		y1=reader.nextInt();
		y2=reader.nextInt();
		d=Math.abs(((y1-y2)*x0-x1*y0+x1*y2)*1.0/Math.sqrt((Math.pow(y1-y2,2)+x1*x1)));
		m=Math.sqrt(r*r-d*d);
		p=Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2));
		q=Math.sqrt(p*p-d*d);
		b=q-m;
		l=(b+2*m)*b;
		System.out.println(Math.round(l));
		
	}
		

}
