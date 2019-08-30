package ÁªÏµ;
import java.util.*;
public class Mainhj {
	public static void main(String[] args) {
		Set<String>s=new HashSet<>();
		int i,j;
		String str=new String();
		Scanner reader=new Scanner(System.in);
		str=reader.next();
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<=str.length();j++)
			{
				s.add(str.substring(i,j));
			}
		}
		System.out.println(s.size());
			
	}

}
