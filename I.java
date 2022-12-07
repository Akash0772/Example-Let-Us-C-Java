/*
	Example		==>		2.2 Lets C
	If a five-digit number is input through the keyboard, write a program to reverse the number.	
*/
import java.util.Scanner;
class I
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter a five digit number ");
		for(int i = 0; i < 5; i++){
			arr[i] = sc.nextInt();
			//System.out.print(arr[i] + " ");
		}
		System.out.println("The Reverse number is ");
		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}