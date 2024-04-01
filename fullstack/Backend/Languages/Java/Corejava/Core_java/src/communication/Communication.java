package communication;

public class Communication {
	public static void main(String [] args) {
		System.out.println("hellow");
		Table t=new Table();
		System.out.println(t.wood);
		Fan f=new Fan();
		System.out.println(f.company);
		Helmet h=new Helmet();
		System.out.println(h.brand);
		Bike b=new Bike();
		System.out.println(b.Model);
		Movie m=new Movie();
		System.out.println(m.hero);
		Ipl i=new Ipl();
		System.out.println(i.cup);
		Car c=new Car();
		System.out.println(c.brand);
		Job j=new Job();
		System.out.println(j.role);
		
		
	}
}

class Table{
	String wood="playwood";
}

class Fan{
	String company="Usha";
}

class Helmet{
	String brand="steelbird";
}

class Bike{
	String Model="2022";
}

class Movie{
	String hero="yash";
}

class Ipl{
	String cup="namde";
}

class Car{
	String brand="toyota";
}

class Job{
	String role="developer";
}


