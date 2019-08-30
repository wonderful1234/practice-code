package ÁªÏµ;
import java.util.*;
public class Mainj {
	public static void main(String[] args) {
		int i,sum=0;
		String str=new String();
		Scanner reader=new Scanner(System.in);
		str=reader.nextLine();
		str.trim();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' '&&str.charAt(i)!='\n')
				sum++;
		}
		System.out.print(sum);
		
	}

}
