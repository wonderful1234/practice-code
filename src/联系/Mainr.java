package ÁªÏµ;
import java.util.*;
public class Mainr {
	public static void main(String[] args) {
		int n,count,k;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		count=0;
		k=1;
		while(n!=0)
		{
			count++;
			n=(n-1)&n;
		}
		System.out.print(count);
	}

}
