/*
	Exercise		==>		G		==>		e	 Lets C
	Two numbers are input through the keyboard into two locations C and D. wite a program to interchange the contents of C and D.
*/
import java.util.Scanner;
class Q
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		int C, D, T;

		//input in user
		System.out.println("Enter the value of C: ");
		C = sc.nextInt();

		System.out.println("Enter the value of D: ");
		D = sc.nextInt();

		//calculate
		C = C + D; // c = 30, d = 20
		D = C - D; // d = 10, c = 30
		C = C - D; // c = 20

		
		//Display
		System.out.println("The value of C: " + C);
		System.out.println("The value of D: " + D);
	}
}

/*
Output

Enter the value of C:
10
Enter the value of D:
20
The value of C: 20
The value of D: 10
*/