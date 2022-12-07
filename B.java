/*
	Example		==>		1.1 Lets C
	Ramesh basic salary is input through the keyboard. His dearness allowwance is 40% of basic sallary, and house rent allowance is 20% of basic sallary. 
	Write a programe to calculate his gross salary. 
*/
import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary Of Ramesh");
		double bp, da, hra, grpay;
		bp = sc.nextFloat();
		da = 0.4 * bp;
		hra = 0.2 * bp;
		grpay = bp + da + hra;
		System.out.println("Basic Salary of Ramesh = " + bp);
		System.out.println("Dearness Allowance = " + da);
		System.out.println("House Rent Allowance = " + hra);
		System.out.println("Gross Pay of Ramesh is = " + grpay);
	}
}
