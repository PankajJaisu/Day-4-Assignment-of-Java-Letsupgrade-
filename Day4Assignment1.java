public class Day4Assignment1
{
	public static void main(String Args[])
	{
	 Avenger []obj=new Avenger[5];
	/*obj[0]=new Avenger();
	
	obj[2]=new Avenger();
	obj[3]=new Avenger();
	obj[4]=new Avenger();
	*/
	for(int i=0;i<=4;i++)
	{
		obj[i]=new Avenger();
	}
	obj[0].getDetails("IronMan","Intelligent","Gama","Mars",49);
	obj[0].displayDetails();
	obj[1].getDetails("Tony stark","Strength","Earth","Mars",41);
	obj[1].displayDetails();
	obj[2].getDetails("thor","Magic","TimeStone","Earth",43);
	obj[2].displayDetails();
	obj[3].getDetails("hulk","Nuclear","Physics","Mars",19);
	obj[3].displayDetails();
	obj[4].getDetails("Captain america","strenth","shield","Earth",49);
	obj[4].displayDetails();





	}
}
class Avenger
{
	String Name,power,weapon,planet;
	int age;
	static int no=1;
	void getDetails(String Name,String power,String weapon,String planet,int age)
	{
		this.Name=Name;
		this.power=power;
		this.weapon=weapon;
		this.planet=planet;
		this.age=age;	
	}
	void displayDetails()
	{
		System.out.println(no+" Avenger");
		System.out.println("Name:"+Name);
		System.out.println("Power:"+power);
		System.out.println("Weapon:"+weapon);
		System.out.println("Planet:"+planet);
		System.out.println("Age:"+age);
		System.out.println("\n");
		no++;
	}
}