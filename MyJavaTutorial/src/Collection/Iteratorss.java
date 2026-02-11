package Collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class Iteratorss {
	public static void main(String[] arg) {
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		Iterator itr =al.iterator();
		  while(itr.hasNext()) {
			  System.out.print(itr.next()+" ");
			  al.add(80);
		  }  
		  Iterator itr2 =al.iterator();
		  while(itr2.hasNext()) {
			  System.out.print(itr2.next()+" ");
	}
	}

}
