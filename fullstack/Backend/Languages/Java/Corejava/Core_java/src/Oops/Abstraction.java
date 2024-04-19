package Oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo info=new BankInfo();

	}

}

abstract class BankInfo{
	abstract void secrete();
}

class chairman extends BankInfo{

	@Override
	void secrete() {
		// TODO Auto-generated method stub
		
	}}