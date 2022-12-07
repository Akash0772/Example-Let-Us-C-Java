/*
	Exercise		==>		[F]	==>	Q.b
	Paper of size A0 has dimensions 1189 mm * 841 mm. Each subsequent size A(n) is definedd as A(n-1) cut half parallel its shorter sides. Thus Paper of size
	A1 would have dimensions 841 mm * 594 mm. Write a program to calculate and print paper sizes A0, A1, A2, .... A8.
*/
class G 
{
	public static void main(String[] args) 
	{
		int w = 841, h = 1189, temp;
		for(int i = 0; i < 9; i++){
			System.out.println("A" + i + ": " + w + " * " + h);
			temp = h;
			h = w;
			w = temp / 2;
		}
	}
}