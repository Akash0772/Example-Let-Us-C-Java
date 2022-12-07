/*
	Exercise		==>		G		==>		d	 Lets C
	Wind chill factor is the felt air temperature on exposed skin due to wind. The wind chill temperature is alwas lower than the air temperature, and is calculated as per 
	the following formula
	wcf = 35.74 + 0.6215t + (0.4275t - 35.75) * v0.16
	Where t is the temperature an v is the wind velocity. write a program to receive values of t and v and calculate wind chill factor(wcf).
*/
import java.util.Scanner;
class O
{
	public static void main(String[] args) 
	{
		//decallaration
		Scanner sc = new Scanner(System.in);
		double temp, wind, wcf;

		//input temperature in fahrenheit
		System.out.println("Enter air temperature in Fahrenheit: ");
		temp = sc.nextDouble();
		
		//input wind velocity (speed) in miles per hours (mph)
		System.out.println("Enter the wind speed in mph: ");
		wind = sc.nextDouble();

		//calculate
		wcf = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind,0.16);

		//Display
		System.out.println("Wind Chill Factor in Fahrenheit: " + String.format("%.2f", wcf));
	}
}

/*
Output

Enter air temperature in Fahrenheit:
23.45
Enter the wind speed in mph:
2
Wind Chill Factor in Fahrenheit: 21.57
*/