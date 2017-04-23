package practice;

public class test1 {

	public static int FindPalindrome(int number)
	{
		int reverse = 0, remainder,num = number;
		while (num > 0)
		{
			remainder = num % 10;
			reverse = reverse * 10;
			reverse = reverse + remainder;
			num = num / 10;
		}
		if(number == reverse)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("prg starts..");
		
		int product, check, large = 0;
		for (int count1 = 999;count1 >=100 ; count1-- )
		{
			for (int count2 = 999; count2 >= 100 ; count2-- )
			{
				product = count1 * count2;
				
				check = FindPalindrome(product);
				
				if(check == 1)
				{
					if(product > large)
					{
						large = product;
						System.out.println(count1+" * "+count2+" = "+large);
						
					}
				}
			}
		}
		
		System.out.println("largest palindrome is "+large);
		System.out.println("prg ends..");
	}
}
