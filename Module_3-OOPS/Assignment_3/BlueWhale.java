/* Q01

Create two classes named Mammals and MarineAnimals.
Create another class named BlueWhale which inherits both the
above classes. Now, create a function in each of these classes
which prints "I am mammal", "I am a marine animal" and "I
belong to both the categories: Mammals as well as Marine
Animals" respectively. Now, create an object for each of the
above class and try calling
1 - function of Mammals by the object of Mammal
2 - function of MarineAnimal by the object of MarineAnimal
3 - function of BlueWhale by the object of BlueWhale
4 - function of each of its parent by the object of BlueWhale



*/
interface Mammals
{
	void m1();
}
interface MarineAnimals
{
	void m2();
}

class BlueWhale implements Mammals, MarineAnimals
{
	public void m1()
	{
	System.out.println("I am mammal");
	}	

	public void m2()
	{
	System.out.println("I am a marine animal");
	}
	
	void m3()
	{
	System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
	}
	
	public static void main(String[] args)
	{
	BlueWhale obj = new BlueWhale();
	obj.m1();
	obj.m2();
	obj.m3();
	}	

}







