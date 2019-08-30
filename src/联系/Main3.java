package ÁªÏµ;
import java.util.*;
public class Main3 {
	public static void main(String[] args) {
		int a,b;
		double d,c;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextDouble();
		d=a*a+b*b-2*a*b*Math.cos(Math.toRadians(180-c));
		System.out.print(Math.sqrt(d));
	}
}
