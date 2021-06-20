/*

Q02: Take values movies ,web_series save it as a prefix m_xyz for movies and w_abc for web_series,store all.
	for searching user shoud give only name of movie/web_series and you have to show details.
	take separate count and total count of entries.
	with base cost of 50,display movie price is 150, and web_series 100	
*/

import java.util.Scanner;

public class MoviesWebSeriesData 
{
	public static void main(String[] args) 
	{
		IO obj = new IO();
		obj.addDetails();
	}
}
class IO
{
	String prefix_movie = "m_";
	String prefix_web= "w_";
	String name;
	String review;
	double rate;
	int cost=50;
	int price;

	int m_cnt=0;
	int w_cnt=0;
	int cnt =0;
	static int count=0;
	Scanner sc = new Scanner(System.in);
	IO[] IMDB = new IO[10];
	
	IO(){}
	IO(String name,String review,double rate)
	{
		this.name=name;
		this.review=review;
		this.rate=rate;		
	}
	
	void addDetails()
	{
		int choice=0;
		do
		{
		System.out.println("Manu: Enter 1 --> add the movie,  Enter 2 --> to add the web_series  ,Enter 3--> to search both  ,Enter any key to---> exit");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1 : 	addMovie();
				break;

			case  2 : 	addWeb_Series();
				break;
			
			case  3 : 	doSearch();
				break;

			default:  System.out.println("you made a wrong choice...!!"+"Enter the choice again");
				break;
		}
		}while(choice>0);
	}	
	void addMovie()
	{
		
		System.out.print("Enter the movie name:  ");
		String supress = sc.nextLine();
		 String name = sc.nextLine();
		name=prefix_movie+name;
		System.out.print("Enter the movie review: ");
		String review = sc.nextLine();
		System.out.print("Enter the movie rating 1 to 10 :  ");
		int rate = sc.nextInt();

		IO b = new IO();
		IMDB [count++]=new IO(name ,review ,rate);
		m_cnt++;
	}	

	void addWeb_Series()
	{
		
		System.out.print("Enter the web_series name:  ");
		String supress = sc.nextLine();
		 String name = sc.nextLine();
		name=prefix_web+name;
		System.out.print("Enter the web_series review: ");
		String review = sc.nextLine();
		System.out.print("Enter the web_series rating 1 to 10 :  ");
		int rate = sc.nextInt();

		IMDB [count++]=new IO(name ,review ,rate);
		w_cnt++;
	}
	void doSearch()
	{
		cnt = m_cnt + w_cnt;
		System.out.print(" toSearch : Movie-->1  & Web_Series-->2 ");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.print(" Enter the Movie :");
			String supress = sc.nextLine();
			String name = sc.nextLine();
			this.name=prefix_movie+name;
			this.price = this.cost + 100;
			
		}
		else if(choice==2)	
		{	
			System.out.println(" Enter the Web_Series :");
			String supress = sc.nextLine();
			 String name = sc.nextLine();
			this.name=prefix_web+name;
			this.price = this.cost + 50;
		}		
		
		for(int i=0;i<cnt;i++)				
		{	     	
				if(IMDB[i].name.equals(this.name))
				{
					System.out.println("IN IF");
					System.out.println("============================================");
					System.out.println(IMDB[i].name.substring(2) + "   movie  details");
					System.out.println(IMDB[i].name +"  "+IMDB[i].review +"  "+IMDB[i].rate);
					System.out.println("Cost:-->"+this.cost+"   Price:-->"+this.price);
					System.out.println("============================================");
					break;			
				}
		}
		
		System.out.println("Movie Entries: -->"+m_cnt+"  Web_Series entries:--> "+w_cnt+"  Total Entries:--> "+cnt);	
	}


/*	

	void doSearch()
	{
		cnt = m_cnt + w_cnt;
		
		//System.out.println("cnt  ?-->"+cnt);

		System.out.print(" Enter Movie name :");
		String supress = sc.nextLine();
		String name = sc.nextLine();

		for(int i=0;i<cnt;i++)				
		{	
				if(IMDB[i].name.equals(name))
				{
					//System.out.println("IN IF");
					System.out.println("============================================");
					System.out.println(IMDB[i].name + "   movie  details");
					System.out.println(IMDB[i].name +"  "+IMDB[i].review +"  "+IMDB[i].rate);
					break;			
				}
			
		}
		System.out.println("Movie Entries: -->"+m_cnt+"  Web_Series entries:--> "+w_cnt);	
	}
*/
	
}
