/*
	Example		==>		1.2 Lets C
	The distance between two cities (in km.) is input through the keyboard. Write a program to convert and print this distance in meters, feet, inches and 
	centimeters.
*/
import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Killometer");
		double km, m, ft, cm, inch;
		km = sc.nextDouble();
		m = km * 1000;
		cm = m * 100;
		inch = cm / 2.54;
		ft = inch / 12;
		System.out.println("Distance in meters = " + m);
		System.out.println("Distance in centimeters = " + cm);
		System.out.println("Distance in inch = " + inch);
		System.out.println("Distance in feet = " + ft);
	}
}
 