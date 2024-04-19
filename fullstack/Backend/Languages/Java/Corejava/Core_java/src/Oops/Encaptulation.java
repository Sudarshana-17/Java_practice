package Oops;

import java.util.Scanner;

public class Encaptulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi emp=new sbi();
		System.out.println(emp.name);
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new password: ");
        int newPass = scanner.nextInt();
        emp.setPass(newPass);
		System.out.println(emp.getPass(1256));

	}

}


class sbi{
	String name="aisha";
	private	int creditCard=12324;
	private	int pin=1234;
	int pass=1256;
	
	int getPass(int otp) {
		if(pass==otp) {
			System.out.println("give pin");
			return pin;
		}else {
			System.out.println("wrong pin");
		}
		return 0;
	}


void setPass(int pass) {
	this.pass=pass;
	}
}