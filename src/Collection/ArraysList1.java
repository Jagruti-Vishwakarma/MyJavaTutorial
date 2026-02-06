package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysList1 {
	public static void main(String[] arg) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		for(int i=0; i<al.size();i++) {
			
			System.out.println(al.get(i)+ " ");
			al.add(i);
		}
		
		//concurrent  modification
		Iterator itr =al.listIterator();
		  while(itr.hasNext()) {
			  System.out.print(itr.next()+" ");
			  
		  }
		
	}
}