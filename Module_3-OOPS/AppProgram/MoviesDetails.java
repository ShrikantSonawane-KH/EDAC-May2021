/*

	nullpointer again.......................??????????
Q01:

	Take movie details by user, search the movie name and show its all details--> name, review, rating.

*/

import java.util.Scanner;

public class MoviesDetails 
{	
	public static void main(String[] args) 
	{
		IO obj = new IO();
		obj.addDetails();
	}
}
class IO
{
	String name;
	String review;
	double rate;
	int cnt=0;
	IO(){}
	IO(String name,String review,double rate)
	{
		this.name=name;
		this.review=review;
		this.rate=rate;		
	}
	int count=0;
	Scanner sc = new Scanner(System.in);
	IO[] IMDB = new IO[10];
	void addDetails()
	{
		int choice=0;
		do
		{
		System.out.println("Manu: Enter 1 --> add the movie,  Enter 2--> to search the movie  ,Enter any key to---> exit");
		choice = sc.nextInt();	
		//System.out.print();
		switch(choice)
		{
			case 1: 	makeChoice();
				break;

			case 2: 	movieSearch();
				break;

			default:  System.out.println("you made a wrong choice...!!"+"Enter the choice again");
				break;
		}
		}while(choice>0);
	}	
	void makeChoice()
	{
		
		System.out.print("Enter the movie name:  ");
		String supress = sc.nextLine();
		 String name = sc.nextLine();
		System.out.print("Enter the movie review: ");
		String review = sc.nextLine();
		System.out.print("Enter the movie rating:  ");
		int rate = sc.nextInt();

		IMDB [count++]=new IO(name ,review ,rate);

		//System.out.println(b.name +"  "+b. review +"  "+b. rate);
		cnt++;
	}	
	void movieSearch() 
	{
		System.out.print("Enter the movie name: ");
		String supress = sc.nextLine();
		String name = sc.nextLine();
		for(int i=0;i<cnt;i++)				
		{	
				if(IMDB[i].name.equals(name))
				{
					System.out.println("============================================");
					System.out.println(IMDB[i].name + "   movie  details");
					System.out.println(IMDB[i].name +"  "+IMDB[i].review +"  "+IMDB[i].rate);
					break;			
				}
			
		}
			
	}
}
