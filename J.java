/*
	Example		==>		2.3 Lets C
	Consider a currency system in which there are notes of seven denominations, namely, Re.1, Rs.2, Rs.5 ,Rs.10 , Rs.50, Rs.100. If a sum of Rs. N is entered through 
	the keyboard, write a program to compute the smallest number of notes that will combine to give Rs. N.
*/
import java.util.Scanner;
class J
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int amount, nohun, nofifty, noten, nofive, notwo, noone, total;
		System.out.println("Enter the amount");
		amount = sc.nextInt();

		//Assending order
		nohun = amount / 100;
		amount = amount % 100;
		//System.out.println(nohun);
		//System.out.println(amount);
		nofifty = amount / 50;
		amount = amount % 50;
		//System.out.println(nofifty);
		//System.out.println(amount);
		noten = amount / 10;
		amount = amount % 10;
		//System.out.println(noten);
		//System.out.println(amount);
		nofive = amount / 5;
		amount = amount % 5;
		//System.out.println(nofive);
		//System.out.println(amount);
		notwo = amount / 2;
		amount = amount % 2;
		//System.out.println(notwo);
		//System.out.println(amount);
		noone = amount / 1;
		amount = amount % 1;
		//System.out.println(noone);
		//System.out.println(amount);

		//then total
		total = nohun + nofifty + noten + nofive + notwo + noone;
		System.out.println("Smallest numberr of notes " + total);
	}
}