package Methods;

public class DifferentTypesOfMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BF vaibhav=new BF("no");
		System.out.println(vaibhav.idly);
		marriage abhishek=new marriage();
		System.out.println(abhishek.marriage("dinner set"));

	}

}

class BF{
	String idly="yes";
	String chanti;
	String dosa;
	BF(String qa){
		this.idly=qa;
	}
}

class marriage{
	String marriage(String gift) {
		System.out.println(gift);
		return "biryani";
				}
}
