package ÁªÏµ;
import java.util.*;
public class Mainyy {
	public static void main(String[] args) {
		int i;
		String str=new String();
		Scanner reader=new Scanner(System.in);
		str=reader.nextLine();
		String[]a;
		a=str.split(" ");
		for(i=0;i<a.length;i++) {
			if(a[i].contains("6"))
			{
				if(a[i].length()>3&&a[i].length()<=9)
					a[i]="9";
				if(a[i].length()>9)
					a[i]="27";
			}
		}
		for(i=0;i<a.length-1;i++)
			System.out.print(a[i]+" ");
		System.out.print(a[i]);
	}

}
