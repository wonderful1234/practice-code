package ÁªÏµ;

import java.util.*;

public class Mainjj {
	public static void main(String[] args) {
		int n, m, t, k,g, i, j = 0;
		double a, b = 0, sum = 0;
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		m = reader.nextInt();
		t = reader.nextInt();
		k = reader.nextInt();
		g=n;
		double[] c = new double[m - n + 1];
		for (i = 1; i <= t; i++) {
			if (n < m) {
				n += 1;
				a = (1.0 * t) * (t / (i + 1));
				c[j] = a;
				j++;
			}
		}

		for (j = 0; j < c.length; j++) {
			if (c[j] > 0)
				sum += (c[j] * (t-j-1));
		}
		System.out.print(sum+g*t);

	}

}
