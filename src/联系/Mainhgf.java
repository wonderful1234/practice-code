package ÁªÏµ;
import java.util.*;
public class Mainhgf {
	public static void main(String[] args) {
		int n,sum,s=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(int i=3;i<=n;i++) {
			sum=0;
			for(int j=1;j<0.5*i;j++) {
				if(i%j==0)
					sum+=2;
			}
			s=s+sum;
		}
		if(n==1)
			System.out.println(1);
		if(n==2)
			System.out.println(3);
		if(n>2)
			System.out.println(s+3);
	}
}
