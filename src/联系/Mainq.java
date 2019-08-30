package ÁªÏµ;
import java.util.*;
public class Mainq {
	public static void main(String[] args) {
		int a, b, i,e,f, sum = 0,j=0;
		char c;
		boolean d=false;
		String str = new String();
		Scanner reader = new Scanner(System.in);
		a = reader.nextInt();
		b = reader.nextInt();
		str = reader.next();
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(str.length()==1)
			{
				
				System.out.print((c-'0')*a);
				break;
			}
			
			if (c >= '0' && c <= '9') {
				sum = sum * 10 + c - '0';
				if(sum==0)
					d=true;
			}
			if (c == '-')
				j=1;
			if (c==','||c==')') {
				if(j==1)
					sum=-sum;
				if(d==true&&sum==0)
					s.push(sum);
				if(sum!=0)
					s.push(sum);
				sum=0;
				d=false;
				j=0;
			}
			if(c==')')
			{
				e=s.pop();
				f=s.pop();
				s.push(e*b+f*a);
			}
		}
		if(str.length()>1)
			System.out.print(s.pop());
	}
}
