/*
	Exercise		==>		G		==>		a	 Lets C
	If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits. (Hint: use the modulus operator '%')	
*/
import java.util.Scanner;
class L
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		int num, temp, sum;

		//user input
		System.out.println("Enter a five digit number ");
		num = sc.nextInt();

		//initillization
		temp = num;

		//loop the calculate the sum of each digit
		for(sum = 0; num != 0; num = num / 10){
			sum = sum + num % 10;
		}
		//Display
		System.out.println("Sum of digit of " + temp + " is " + sum);
	}
}

/*
Output

Enter a five digit number
12345
Sum of digit of 12345 is 15
*/