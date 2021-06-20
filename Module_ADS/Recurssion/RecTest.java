

class RecTest
{
	static int i=0;
	 void method()
		{
			i = i+1;
			System.out.println(i);

			if(i>10)
			{
			
			}
			else
			{
				method();
			}
		
		}
	public static void main(String[] args)
	{
		
		RecTest r =new RecTest();
		r.method();
	
	}

}