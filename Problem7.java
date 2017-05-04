class Problem7
{
	public static void main(String[] args)
	{
		int num = 1,count = 0,notprime;
		while (count < 10001)
		{
			num++;
			notprime = 0;
			if (num == 2)
			{
				count++;
			}
			else if(num % 2 != 0)
			{
				for (int repeat = 2;repeat <= num/2 ;repeat++ )
				{
					if (num % repeat == 0)
					{
						notprime = 1;
					}
				}
				if (notprime == 0)
				{
					count++;
				}

			}
			 
		}
		System.out.println();
		System.out.println(count+"st Prime number = "+num);

	}

}