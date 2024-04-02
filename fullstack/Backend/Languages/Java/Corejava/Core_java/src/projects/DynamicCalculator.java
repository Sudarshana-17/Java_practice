package projects;

import java.util.Scanner;

public class DynamicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operator,n1,n2;
		System.out.println("1 - add \n 2 - subtract\n 3 - multiply\n 4 - divide");
		System.out.print("choose operator: ");
		Scanner sc=new Scanner(System.in);
		operator= sc.nextInt();
		System.out.print("enter first number: ");
		n1=sc.nextInt();
		System.out.print("enter second number: ");
		n2=sc.nextInt();
		
		int result=0;
		switch(operator) {
		case 1:
			result=n1+n2;
			break;
			
		case 2:
			result=n1-n2;
			break;
			
		case 3:
			result=n1*n2;
			break;
			
		case 4:
			result=n1/n2;
			break;
			
			
		}
		
		System.out.println("Result is :"+result);

	}

}
