package Inheritance;

public class Rule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.print(c.a);
		System.out.println("--------------");
		c.disp();//  rule 2. The private members of a class does not participate in inheritance.

		}

}

class Parents{
	private int a = 10 ;
	int b=20;
	private void disp() {
		 System.out.println(a);
		 System.out.println(b);
	 }
}	 
class Childs extends Parent{
	

}
