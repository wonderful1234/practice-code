package ÁªÏµ;
import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		int t, m, n, i = 1, j = 1, sum,k=0;
		Scanner reader = new Scanner(System.in);
		t = reader.nextInt();
		int[]a=new int[t];
		while (t > 0) {
			m = reader.nextInt();
			n = reader.nextInt();
			sum=0;
			i=1;
			j=1;
			while (i>0) {
				while (i < m) {
					i++;
					sum++;
				}
				if(i==m&&j==n)
					break;
				j++;
				sum++;
				if(i==m&&j==n)
					break;
				while (i > 1)
				{
					i--;
					sum++;
				}
				j++;
				sum++;
			}
			a[k]=sum-1;
			k++;
			t--;
		}
		for(k=0;k<a.length;k++)
			System.out.println(a[k]);
	}

}
