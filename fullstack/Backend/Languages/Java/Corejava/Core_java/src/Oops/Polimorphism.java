package Oops;

public class Polimorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent2 p=new parent2();
		System.out.println(p.mony);
		child2 c=new child2();
		System.out.println(c.mony);
		System.out.println(c.land());

	}

}
class parent2{
	int mony=1234;
	int land(){
		return mony;
	}
}
class child2 extends parent2{
	int mony=12345;
	int land(){
		return super.mony;
	}
	int land(int a){
		return super.mony;
	}
}