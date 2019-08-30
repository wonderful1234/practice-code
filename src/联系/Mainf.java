package ÁªÏµ;
import java.util.*;
public class Mainf {
	public static void main(String[] args) {
		int a,b,i;
		Set<String>s=new HashSet<>();
		Scanner reader=new Scanner(System.in);
		a=reader.nextInt();
		b=reader.nextInt();
		String[]sr=new String[a];
		for(i=0;i<sr.length;i++)
		{
			sr[i]=reader.next();
			s.add(sr[i]);
		}
		System.out.println(s.size());
		
	}

}
