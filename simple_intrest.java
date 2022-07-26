//program-3

 import java.util.Scanner;


public class simple_intrest
{
	
public static void main(String args[])
{
	float i,p,r,n;

	Scanner scanner = new Scanner(System.in);
 	System.out.println("enter p:");
	p=scanner.nextFloat();
	System.out.println("enter r:");
	r=scanner.nextFloat();
	System.out.println("enter n:");
	n=scanner.nextFloat();

	i=(p*r*n)/100;
	System.out.println("your simple intrest is: "+i);
}
}
