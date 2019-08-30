
import java.math.*;
import java.util.Scanner;
public class Maain {
	public static void main(String[] args) {
		int s;
		double d;
        Scanner reader=new Scanner(System.in);
        s=reader.nextInt();
        d=2*Math.sqrt(s/Math.PI);
        System.out.println(String.format("%.3f", d));
	}

}
