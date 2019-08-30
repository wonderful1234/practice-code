package ÁªÏµ;

import java.util.*;

public class Main4 {
	public static void main(String[] args) {
		int i, j, n, k, m;
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		int[] a = new int[n];
		for (i = 0; i < a.length; i++)
			a[i] = reader.nextInt();
		j = 0;
		while (j < n) {
			for (i = a[j]; i <= 1000000; i++) {
				m = 0;
				for (k = 2; k <= (i / 2); k++) {
					if (i % k == 0)
						m++;
				}
				if (m == a[j] - 2)
					break;
			}
			if(i>1000000)
				System.out.println(-1);
			else
				System.out.println(i);
			j++;
		}
	}

}
