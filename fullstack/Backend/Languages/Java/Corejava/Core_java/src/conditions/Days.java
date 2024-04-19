package conditions;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random=(int) Math.floor(Math.random()*7+1);
		
switch(random)

{
case 1:
	System.out.println("monday");
	break;

case 2:
	System.out.println("tuesday");
	break;
	
case 3:
	System.out.println("wednesday");
	break;

case 4:
	System.out.println("thursday");
	break;

case 5:
	System.out.println("friday");
	break;

case 6:
	System.out.println("saturday");
	break;

case 7:
	System.out.println("sunday");
	break;
}
	}

}
