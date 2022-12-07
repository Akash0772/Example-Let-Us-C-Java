/*
	Exercise		==>		G		==>		c	 Lets C
	Write a program to recive values of latitude (L1, L2) and longitude (G1, G2), in degrees, of two places on the earth and output the distance (D) between them in nautical 
	miles. The formula for distance in nautical miles is:
	D = 3963 cos-1(sine L1 sin L2 + cos L1 + cos L2 * cos(G2 - G1))
*/
import java.util.Scanner;
class N
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		double L1, L2, G1, G2, distance, distance_km, distance_nm, dL, dG;

		//input two points (place) location (latitude and longitude) in degree form
		System.out.println("Enter the co-ordinate of first place: ");
		L1 = sc.nextDouble();
		G1 = sc.nextDouble();

		System.out.println("Enter the co-ordinate of second place: ");
		L2 = sc.nextDouble();
		G2 = sc.nextDouble();

		//find out the distance beteen two end points using formula
		dL = L2 - L1;
		dG = G2 - G1;

		distance = Math.sqrt((dL*dL) + (dG) * (dG));
		distance_km = distance*100;
		
		System.out.println("The distance between to place in kilometer: " + String.format("%.2f", distance_km));
		
		//convert kilomiter into nautical miles
		distance_nm = distance_km / 1.852;

		//Print polar co-ordinates on screen
		System.out.println("The distance between two place in nautical miles: " + String.format("%.2f", distance_nm));
		
		
	}
}

/*
Output

Enter the co-ordinate of first place:
29.3787077 78.1042091
Enter the co-ordinate of second place:
29.6070158 78.3266826
The distance beteen to place in kilometer: 31.88
The distance between two place in nautical miles: 17.21
*/