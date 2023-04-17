package CHP2_JAVA;

public class LogicalOpTable {

	public static void main(String[] args) {
		boolean p, q;
		
		System.out.println("p\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		
		p = true;q = false;
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false ; q = true; 
		System.out.println(p + "\t" + q + "\t");
		System.out.println((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	
	
		p = false; q = false;
		System.out.println(p + "\t\t" + q + "\t\t");
		System.out.println((p&q) + "\t\t" + (p|q) + "\t\t");
		System.out.println((p^q) + "\t\t" + (p));
		
		
		
	}

}
