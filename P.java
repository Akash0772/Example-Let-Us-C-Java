/*
	Exercise		==>		G		==>		e	 Lets C
	If value of an anggle is input through the keyboard, write a program to print all its Trigonometric ratios.
*/
import java.util.Scanner;
class P
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		double degree, radian;
		final double PI = 3.14159;

		//input in user
		System.out.println("Enter angle in degree: ");
		degree = sc.nextDouble();

		//calculate
		radian = degree * (PI / 180.0);

		 // method to get the tignometry value
          double sinValue = Math.cos(radian);
          double cosValue = Math.cos(radian);
          double tanValue = Math.cos(radian);
          double secValue = 1/Math.cos(radian);
          double cosecValue = 1/Math.sin(radian);
          double cotValue = 1/Math.tan(radian);

		//Display
		System.out.println("sin(" + degree + ") = " + sinValue);
		System.out.println("cos(" + degree + ") = " + cosValue);
		System.out.println("tan(" + degree + ") = " + tanValue);
		System.out.println("sec(" + degree + ") = " + secValue);
		System.out.println("cosec(" + degree + ") = " + cosecValue);
		System.out.println("cot(" + degree + ") = " + cotValue);
		
	}
}

/*
Output

Enter angle in degree:
30
sin(30.0) = 0.8660256249168368
cos(30.0) = 0.8660256249168368
tan(30.0) = 0.8660256249168368
sec(30.0) = 1.1547002435361293
cosec(30.0) = 2.000001532052151
cot(30.0) = 1.732052576630095
*/