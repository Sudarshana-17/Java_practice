package projects;

public class StaticCalculator {
	public static void main(String[] args) {
		Operation op=new Operation();
		System.out.println(op.add(2, 3));
		System.out.println(op.sub(3, 2));
		System.out.println(op.mul(2, 2));
		System.out.println(op.div(4, 2));
		
	}

}

class Operation{
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;
	}
}
