import java.util.*;
public class Fibonacci
{
	public static void main (String[] args) 
		{
			int a=0, b=1, fib=0, lim,i=0;
			Scanner nw = new Scanner(System.in);
			System.out.print("\nENTER LIMIT TILL YOU NEED FIBONACCI SERIES :");
			lim=nw.nextInt();
			System.out.print("\nTHE NEEDED FIBONACCI SERIES IS :\n\n");
			System.out.print(a+" "+b+" ");
			while( fib < lim )
			{
				fib=a+b;
				a=b;
				b=fib;
				if ( fib<=lim )
					System.out.print(fib+" ");
				i++;
			}
			System.out.print("\n\n\n  As simple as that....\n\n  Isn't it...?? :) :) :) \n\n");
		}
}
