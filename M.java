/*
	Exercise		==>		G		==>		b	 Lets C
	Write the program to receive Cartesian co-ordinates (x, y) of a point and convert them into polor co-orddinates (r, ). (Hint: r = sqrt(x*x + y*y) and = tan-1(y/x)). 
*/
import java.util.Scanner;
class M
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		int x, y;
		double r, phi, p, degree;

		//Take cartesian co-ordinates from user
		System.out.println("Enter the co-ordinate points (x, y): ");
		x = sc.nextInt();
		y = sc.nextInt();

		//calculate the value of r
		r = Math.sqrt(x*x + y*y);

		//calculate the value Phi
		//for tan inverse we use atan(value)
		phi = Math.atan(y/x);

		//Print polar co-ordinates on screen
		System.out.println("The polor co-ordinates of "  + "("+ x + ", " + y + ")" + " is " + "(" + r + ", " + phi + ")");
		
		//convert radian value into degree
		p = 3.14152;
		degree = phi * (180 / p);
		System.out.println("The co-orditate in Degree: " + " (" +r + ", " + (int) degree + ")");
	}
}

/*
Output

Enter the co-ordinate points (x, y):
1 1
The polor co-ordinates of (1, 1) is (1.4142135623730951, 0.7853981633974483)
The co-orditate in Degree:  (1.4142135623730951, 45)
*/