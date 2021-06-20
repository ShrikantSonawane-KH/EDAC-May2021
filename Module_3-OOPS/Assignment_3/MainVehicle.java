/*
Q.04
We want to store the information of different vehicles. Create a
class named Vehicle with two data member named mileage and
price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by
years), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders,
number of gears, cooling type(air, liquid or oil), wheel
type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having
a data member to store the model type. Next, make two
subclasses Bajaj and TVS, each having a data member to store
the make-type.Now, store and print the information of an Audi and a Ford car
(i.e. model type, ownership cost, warranty, seating capacity, fuel
type, mileage and price.) Do the same for a Bajaj and a TVS
bike.

*/

import java.util.*;
class vehicle
{
	double mileage; 
	double price;
}

class car extends vehicle
{
	double cost;
	int warranty;
	int seatCapacity;
	String fuleType;
	String modelNo;
	public void getCarDetails (String modelNo, double mileage, double price, double cost, int warranty, int seatCapacity, String fuleType)
	{
		this.modelNo=modelNo;
		this.cost = cost;
		this.warranty=warranty;
		this.seatCapacity=seatCapacity;
		this.fuleType=fuleType;
		
		System.out.println("modelNo:  "+ modelNo+"  mileage:  "+mileage+ "  price  "+ price + "   cost:   "+cost+ "   warranty:  "+warranty + " years "+ "   seatCapacity   "+seatCapacity+"  fuleType:  "+fuleType);
	}
}

class bike extends vehicle
{
	double cylinders;
	double cost;
	int warranty;
	int gears ;
	int modelNo;
	String cooling;	
	String wheelType;
	double tankSize;

	public void getBikeDetails(String modelNo, double mileage,double price, double cost,  double cylinders ,int gears ,String cooling,String wheelType,double tankSize,int warranty)
	{
		this.cylinders= cylinders;
		this.gears = gears;
		this.cost=cost;
		this.cooling =cooling;	
		this.wheelType = wheelType;
		this.tankSize = tankSize;
		this.warranty=warranty;
		System.out.println("modelNo:  "+ modelNo+"  mileage:  "+mileage+ "  price  "+ price + "   cost:   "+cost+ "   warranty:  "+warranty + " years "+ "  Gear  "+ gears + "  cooling  "+cooling + "  wheelType  "+ wheelType + "  tankSize  "+tankSize);
	}
} 

class Audi extends car
{
	String modelNo;
}

class Ford extends car
{
	String modelNo;
}

class Bajaj extends bike
{
	int makeType;

}

class TVS extends bike
{
 	int modelNo;

}

public class MainVehicle
{
	public static void main(String[] args)
	{
		System.out.println("========AUDI========");
		Audi d=new Audi();
		d.getCarDetails("A0001", 50.20, 200000, 150000, 2 ,2 ," Petrol");
		System.out.println("========FORD========");
		Ford f=new Ford();
		f.getCarDetails("A0002", 40.00, 100000, 50000, 3 ,5 , "Petrol");

		System.out.println("========TVS========");
		TVS t=new TVS();
		t.getBikeDetails("A0002",45.2, 60000, 40000 ,2.4d,5,"Liquid","Spokes",4.5d,2);
		System.out.println("========BAJAJ========");
		Bajaj b=new Bajaj();
		b.getBikeDetails("A0003", 52.2 , 40000, 20000 ,2.4d ,4 ,"Air","Alloys",5.5d,2);
	}
	
	//(String modelNo, double mileage, double price, double cost, int warranty, int seatCapacity, String fuleType);
	//String modelNo, double mileage,double price, double cost,  double cylinders ,int gears ,String cooling,String wheelType,double tankSize,int warranty);alloys or spokes,air, liquid or oil
}







