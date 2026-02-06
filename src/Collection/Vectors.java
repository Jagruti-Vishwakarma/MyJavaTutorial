package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {
	public static void main(String[] arg) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Enumeration el = v.elements();
		while (el.hasMoreElements()) {
			System.out.println(el.nextElement() + " ");
		}
		
	}

}
