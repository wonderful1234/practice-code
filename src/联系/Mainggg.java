package ÁªÏµ;
import java.util.*;
public class Mainggg {
	public static void main(String[] args) {
		int i,t;
		Scanner reader=new Scanner(System.in);
		t=reader.nextInt();
		String[]a=new String[t];
		for(i=0;i<a.length;i++)
			a[i]=reader.next();
		for(i=0;i<a.length;i++)
		{
			if(a[i].equals("Rock"))
				System.out.println("Paper");
			if(a[i].equals("Paper"))
				System.out.println("Scissors");
			if(a[i].equals("Scissors"))
				System.out.println("Rock");
		}
	}

}
