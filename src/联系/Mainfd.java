package ÁªÏµ;
import java.util.*;
public class Mainfd {
	public static void main(String[] args) {
		int n,c;
		double m;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		m=Math.log(n)*1.0/Math.log(2);
		c=(int)m;
		if(c==m)
			System.out.println(c);
		else
			System.out.println(c+1);
		
		
	}

}
