package ÁªÏµ;
import java.util.*;
public class Mainyt {
	public static void main(String[] args) {
		int n;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		if(n>=3)
			System.out.print("BigBoLang");
		if(n==2)
			System.out.print("YingHuaTang");
		if(n==1)
			System.out.print("XiZhiTang");
		if(n==0)
			System.out.print("None");
	}

}
