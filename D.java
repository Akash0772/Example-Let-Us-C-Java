/*
	Example		==>		1.3 Lets C
	If the marks obtained b a student in five different subjects are input through the keyboards, write a program to find out the aggregate marks 
	and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100.
*/
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance the marks in 5 subject");
		int m1, m2, m3, m4, m5, aggr;
		double per;
		m1 = sc.nextInt();		
		m2 = sc.nextInt();		
		m3 = sc.nextInt();		
		m4 = sc.nextInt();		
		m5 = sc.nextInt();		
		aggr = m1 + m2 + m3 + m4 + m5;
		per = aggr / 5;
		System.out.println("Aggregate Marks = " + aggr);
		System.out.println("Percentage Marks = " + per);
		
	}
}
 