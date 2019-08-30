package ÁªÏµ;
import java.util.*;
public class Main8 {
	public static void main(String[] args) {
		int i,sum=0;
		String str=new String();
		Scanner reader=new Scanner(System.in);
		str=reader.next();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				sum++;
		}
		System.out.print(sum);
		reader.close();
	}

}
