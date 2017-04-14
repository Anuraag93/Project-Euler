
public class Problem1 {

	public static void main(String[] args) 
	{
		int count = 0,n = 1000,sum = 0;
		for(int num=3;num<n;num++)
		{
			if(num % 3 == 0 || num % 5 == 0)
			{
				System.out.println(num+" is a multiple of 3 & 5");
				sum = sum + num;
				count = count +1;
			}
			
		}
		System.out.println("the sum of all the multiples of 3 or 5 below "+n+" are "+sum);
		System.out.println("the number of multiples of 3 or 5 below "+n+" are "+count);
	}

}
