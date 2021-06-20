/*
	Tower of hanoi: example of excessive recursion


*/


class  Recursion
{
		static void method(int Rnum, char S, char I, char D)
		{
			if (Rnum == 1)
			{	
				System.out.println("Disk " + S + " to " + D);
			}
			else
			{
				method(Rnum-1,S,D,I);
				System.out.println("Disk " + S + " to " + D);
				method(Rnum-1,I,S,D);
	
			}
			
		}
}

class TowerOfHanoi
{
	public static void main(String[] agrs)
	{
		Recursion.method(3,'S','I','D');
	}
 
}

Disk S to D
Disk S to I
Disk D to I
Disk S to D
Disk I to S
Disk I to D
Disk S to D