class Problem6
{
	public static int squareSum()
	{
		int square,sum = 0;
		for (int count = 1;count <= 100 ;count++ )
		{
			square = count * count;
			sum    = sum + square; 
		}
		System.out.println("The sum of the squares of the first ten natural numbers is "+sum);
		return sum;
	}
	public static int sumSquare()
	{
		int square,sum = 0;
		for (int count = 1;count <= 100 ;count++ )
		{
			sum = sum + count;
		}
		square = sum * sum;
		System.out.println("The square of the sum of the first ten natural numbers is "+square);
		return square;
	}
	public static void main(String[]args)
	{
		System.out.println("Prg Starts..");
		int output1 = squareSum();
		int output2 = sumSquare();
		int diff = output2 - output1;
		System.out.println("THe Difference is = "+diff);
		System.out.println("Prg Ends..");

	}

}