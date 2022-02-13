//Demonstrate the use of parameterized constructor
package mypac;

public class Student1 {
	
	int id;
	String name;
	//creating a parameterized constructor
	Student1(int i,String n){
	id=i;
	name=n;
	}
	//method to display the values
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String[] args) {
		//creating objects and passing values
		Student1 s1=new Student1(11, " swapnali");
		Student1 s2=new Student1(22, " shreya");
		//calling method to display the values of object
		s1.display();
		s2.display();
	}

}
