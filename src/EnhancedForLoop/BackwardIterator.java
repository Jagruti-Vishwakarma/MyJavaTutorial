package EnhancedForLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BackwardIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lh = new ArrayList();
		lh.add(100);
		lh.add(50);
		lh.add(150);
		lh.add(25);
		lh.add(75);
		lh.add(125);
		lh.add(175);
		
	  ListIterator itr =lh.listIterator(lh.size());
	  while(itr.hasPrevious()) {
		  System.out.print((itr.previous())+" ");
		  
	  }
	}

}