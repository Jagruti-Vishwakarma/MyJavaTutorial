package LegacyPackage;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(100);
		v.add(50);
		v.add(150);
		v.add(25);
		v.add(75);
		v.add(125);
		v.add(175);
	
	
		
		Enumeration el =v.elements();
			while(el.hasMoreElements()) {
				System.out.print(el.nextElement()+ " ");
			}
		
	}

}
