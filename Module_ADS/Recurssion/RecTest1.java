/*
	3 - table by recurtion  
*/

class RecTest1
{
	static int i=0;
	 void method()
		{
			System.out.println(i);
			i =i+3;
			if(i>30)
			{
				
			}
			else
			{
				method();
				
			}
		}
	public static void main(String[] args)
	{
		
		RecTest1 r = new  RecTest1();
		r.method();
	
	}

}