/*
	Exercise		==>		D		==>	a	 Lets C
	What ill be the output of the following programs:	
*/
class K1
{
	public static void main(String[] args) 
	{
		int i = 2, j = 3, k, l;
		float a, b;
		k = i / j * j;		// k = 2/9	=	0
		l = j / i * i;		// l = 9/4	=   2
		a = i / j * j;		// a = 3/9	=	0.0
		b = j / i * i;		// b = 9/4	=	2.0
		System.out.println(k);		
		System.out.println(l);		
		System.out.println(a);		
		System.out.println(b);
	}
}