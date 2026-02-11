package EnhancedForLoop;

class Student{
	String name;
	int age ;
	char gender;
	
	
	public Student(String name , int age ,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	char getGender() {
		return gender;
	}
			
}
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Anurag",21,'M');
		Student s2=new Student("Anurag",21,'M');
		Student s3=new Student("Anurag",21,'M');
		
		Student[] st = {s1,s2,s3};
		for(Student s:st) {
			
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getGender());
			
			
		}
		
		
		
		

	}
	

}