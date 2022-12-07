/*
	Exercise		==>		[F]	==>	Q.b
	The length and breadth ofa a rectangle and radius of a circle are input through the keyboard. Write a program to calculate the area and perimeter of the 
	rectangle and the area circumference of the circle.
*/
import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the breath");
		int b = sc.nextInt();
		System.out.println("Enter the length");
		int l = sc.nextInt();
		System.out.println("Enter the radius");
		double r = sc.nextDouble();
		
		//Formula 
		int ar = b * l;		//Area of Rectangle
		int pr = 2*b + 2*l;	//Perimeter of Rectangle
		
		final double pi = 3.14159;
		double ac = pi * r * r;		//Area of circle
		double cc  = 2 * pi * r;
		System.out.println("Area of Rectangle = " + ar);
		System.out.println("Perimeter of Rectangle = " + pr);
		System.out.println("Area of circle = " + ac);
		System.out.println("Circumference of circle = " + cc);
	}
}