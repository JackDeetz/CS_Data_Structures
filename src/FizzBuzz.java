public class FizzBuzz 
{
	public FizzBuzz() {}
	
	public static void PrintFizzBuzz()
	{
		//				Fancy Title
		System.out.println("~~~~~~~~~~The~~~~~~~~~") ;
		System.out.println("~~~~~~~FizzBuzz~~~~~~~") ;
		System.out.println("~~~~~~~Program~~~~~~~~") ;
		
		//for loop iterates 1 - 100, printing either i, Fizz, Buzz, FizzBuzz
		for (int i = 1 ; i < 101 ; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)		//if i is divisible by both 3 and 5
			{
				System.out.println("FizzBuzz") ;
				continue ;						//skip to next for loop iteration
			}
			if (i % 3 == 0)						//if i is divisible by 3
			{
				System.out.println("Fizz") ;
				continue ;
			}
			if (i % 5 == 0)						//if i is divisible by 5
			{
				System.out.println("Buzz") ;
				continue ;
			}
			System.out.println(i) ;				//if i is not divisible by 3 or 5 or 3 and 5, just print i
		}
	}

}
