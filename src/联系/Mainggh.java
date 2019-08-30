package ÁªÏµ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Mainggh {
	public static void main(String[] args) throws ParseException {
		int t,i=0;
		String date = new String();
		Scanner reader = new Scanner(System.in);
		String s = "2050-01-01 00:00:00";
		long tim1, tim2;
		t=reader.nextInt();
		String[]a=new String[t];
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat simpleDateFormau = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		tim1 = simpleDateFormat.parse(s).getTime();
		reader.nextLine();
		for(i=0;i<a.length;i++)
			a[i]=reader.nextLine();
		for(i=0;i<a.length;i++)
		{
			tim2=simpleDateFormau.parse(a[i]).getTime();
			System.out.println(((tim1-tim2)/1000)%100);
		}
		
		

	}

}
