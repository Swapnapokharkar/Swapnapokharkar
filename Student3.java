//Java program to Overload the Constructor
package mypac;

public class Student3 {
	int id;
	String name;
	int age;
	//creating two constructor
	Student3(int i,String n){
	id=i;
	name=n;
	}
	//creating three constructor
	Student3(int i,String n,int  a){
		id=i;
		name=n;
		age=a;
		}
		void display(){System.out.println(id+""+name+""+age);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s1=new Student3(11," swapna",24);
		Student3 s2=new Student3(22," Shreyu",25);
		s1.display();
		s2.display();
	}

}
