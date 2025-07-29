package superthiskeyword;


class Parent{

	int x = 10;
	
}

class Child extends Parent{
	int x = 20;
	
	//this is print method inside child class
	void print() {
		int x = 30;
		System.out.println(x);
		System.out.println(this.x); //as we know this keyword represents the current class variable
		System.out.println(super.x); //super keyword used to denote parent variable when its inherited
	}
	
}


public class SperThisKeyword {

	
	public static void main(String[] args) {

		Child child = new Child();   //This is the important way to create object to call the class.
		System.out.println(child.x);
		child.print();

	}

}
