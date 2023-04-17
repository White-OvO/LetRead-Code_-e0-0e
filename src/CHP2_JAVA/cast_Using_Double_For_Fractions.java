package CHP2_JAVA;

public class cast_Using_Double_For_Fractions {

	public static void main(String[] args) {
int i;
for(i = 0; i <5; i++) { 
	System.out.println(i + " / 3 : " + i / 3); // i in this case is being called for in numerical order no more than 5.
	System.out.println(i + " / 3 with fractionP " + (double) i /3); // including double will make the program run results with fractiosn due to the double being in place.
	System.out.println(); /// This line of code represents a line inbetween every other icnrement.
}
	}

}
