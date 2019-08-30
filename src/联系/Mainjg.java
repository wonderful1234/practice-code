package ÁªÏµ;

import java.util.*;

public class Mainjg {
	public static void main(String[] args) {
		int t, i, sum,k=0;
		String str = new String();
		Scanner reader = new Scanner(System.in);
		t = reader.nextInt();
		String[]a=new String[t];
		while (t > 0) {
			str = reader.next();
			sum=0;
			if(str.length()%4!=0)
			{
				a[k]="No";
				k++;
				t--;
				continue;
				
			}
			for (i = 0; i <= str.length() - 4; i = i + 4) {
				if (str.substring(i, i + 4).equals("2050"))
					sum++;
			}
			if (sum == str.length() / 4)
				a[k]="Yes";
			else
				a[k]="No";
			t--;
			k++;
		}
		for(k=0;k<a.length;k++)
			System.out.println(a[k]);
	}

}
