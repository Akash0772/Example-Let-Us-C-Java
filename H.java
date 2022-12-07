/*
	Example		==>		2.1 Lets C
	If length of three sides of a triangle are input through the keyboard, write a program to find the area of the triangle.
*/
import java.util.Scanner;
class H 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, s, area;
		System.out.println("Enter side of traiangle: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		//side of triangle
		s = (a + b + c) / 2;
		
		//Area of triangle
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle = " + area);
	}
}