class SmallMultiple 
{
	public static void multiple()
	{
		int num = 20;
		while (num >= 20)
		{
			int output = 0;
			for (int count = 1;count <= 20 ;count++ )
			{
				if (num % count == 0)
				{
					output = output + 1;
				}
			}
			if (output == 20)
			{
				System.out.println("smallest multiple = "+num);
				return;

			}
			num++;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Prg Starts..");
		
		multiple();	
		System.out.println("Prg Ends..");
	}
}
