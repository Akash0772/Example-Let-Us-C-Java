/*
	Exercise		==>		[F]	==>	Q.a
	Tempreture of a city in Fahrenheit degrees is input through the keyboard. Write a program to convert this tempreture into Centigrade degrees.
*/
import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fahrenheiet degrees");
		double far;
		far = sc.nextFloat();		
		final double cen = (far - 32) * 5 / 9;
		System.out.println("Centigrade degrees = " + cen);		
	}
}