package Oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
		System.out.println(p.mony);
		child c=new child();
		System.out.println(c.mony);
	}

}

class GrandPa{
	int mony=1234;
}
class parent extends GrandPa{
	
}
class child extends parent{
	
}

class grandpa{
	int mony=1234;
}
class brother extends grandpa{}
class sister extends grandpa{}
class boy extends brother{}
class girl extends sister{}
