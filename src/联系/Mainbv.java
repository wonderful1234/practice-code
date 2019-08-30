package ÁªÏµ;
import java.util.*;
public class Mainbv {
	public static void main(String[] args) {
		int a,b,c,i,j=0,k=0;
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		c=reader.nextInt();
		int[]d=new int[c+2];
		a=a%b;
		for(i=0;i<c+2;i++) {
			a=a*10;
			j=a/b;
			a=a%b;
			if(i>=c-1)
				System.out.print(j);
		}
	}
}
