package ÁªÏµ;
import java.util.*;
public class Maingf {
	public static void main(String[] args) {
		int n,i,sum=1;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(i=0;i<n;i++)
		{
			sum*=26;
			if(sum>1000000007)
				sum=sum%1000000007;
		}
		System.out.println((sum-n*(n-1)*(n-2))%1000000007);
			
	}
	

}
