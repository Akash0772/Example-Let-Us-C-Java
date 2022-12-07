/*
	Exercise		==>		D		==>	c	 Lets C
	What ill be the output of the following programs:	
*/
class K3
{
	public static void main(String[] args) 
	{
		double a = 5, b = 2;
		int c, d;
		double c, d;
		c = a % b;
		d = a / 2;		
		System.out.println(c);		
		System.out.println(d);
	}
}

/*
	  int c, d;

	Output

	K3.java:11: error: incompatible types: possible lossy conversion from double to int
                c = a % b;
                      ^
	K3.java:12: error: incompatible types: possible lossy conversion from double to int
                d = a / 2;
                      ^
	2 errors
*/


/*
	double c, d;

    Output

	1.0
	2.5
*/