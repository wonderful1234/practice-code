package ÁªÏµ;

import java.util.*;

public class Mainhg {
	public static void main(String[] args) {
		int t, i = 0, j = 0, k, m = 0, sum = 0, l = 0;
		Scanner reader = new Scanner(System.in);
		t = reader.nextInt();
		int[][] a = new int[t][2];
		for (i = 0; i < a.length; i++) {
			a[i][0] = reader.nextInt();
			a[i][1] = reader.nextInt();
		}
		i = 0;
		while (i < t) {
			l=0;
			for (k = a[i][0]; k <= a[i][1]; k++) {
				for (m = a[i][0]+1; m <= a[i][1]; m++) {
					sum = k ^ m;
					if (sum > l)
						l=sum;
				}
			}
			System.out.println(l);
			i++;
		}
	}
}
