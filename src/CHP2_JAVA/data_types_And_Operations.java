package CHP2_JAVA;

public class data_types_And_Operations {

	public static void main(String[] args) {
int i;
boolean boo = false;
i = 0;


if(boo == false && (++i <100)) { // why didnot i need a { at  the end of this Statment
	System.out.println("this wount be dispalyed");
System.out.println("if statment excuted: " + i);
	}
/*in this case, i is not incremented because the short circuit operator skips the increment 
 */
if(false && (++i < 100)) {
	System.out.println("this wount be displayed");
System.out.println("if statments exucuted: " + i); 
	}



	long L;
	double D;
	 
	L = 1001286L;
	D = L;
	System.out.println("L and D: " + L + " " + D);
	
	
	/*
	 * long L ;
	 * double D;
	 * 
	 * Syst
	 * 
	 * 
	 */



// why does not the second line print

//why can i type in my terminal
	}
}
	
	
