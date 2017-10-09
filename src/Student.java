//example shows calling immediate super class method
class Simple{
	public void di() {
		System.out.println("display method of super class");
	}
}

class Show extends Simple{
	public void di() {
		System.out.println("display method of sub-class");
	}
	public void show()
	{
		System.out.println("show method of sub-class");
		super.di();  //super class display method is called
	}
}

//example shows all 3 uses of this keyword along with use of super keywords where super class constructor is called
public class Student {
	
	int id,physics,chemistry,total,u;   //instance variable
	String name;  //instance variable
	
	Student(int uid)
	{
		//use of this in constructor chaining
		this(90,90); //called two parameter constructor Student(int,int)
		u=uid; //no need of this keyword
		System.out.println("UID: "+u);
	}
	
	Student(int id, String name)   //local variable
	{
		this.id=id; //instance variable and local variable are distinguished using this keyword
		this.name=name; //if this keyword is not used then it will give rise to ambiguity and proper details wont be printed
	}
	
	Student(int phy , int chem)
	{
		physics=phy;   //local and instance variable are different hence this keyword is not used
		chemistry=chem;
		total=physics + chemistry;
		this.show();  //calling current class method using this
	}
	
	public void show()
	{
		System.out.println("TOTAL : "+total);	
	}
	
	public void display()           //method to print details
	{
		System.out.println("Student ID : "+id+" \nStudent NAME : "+name+"\n\n");   
	}

	public static void main(String[] args) {
		
		System.out.println("Uses of this keyword shown here :\n1) Constructor chaining\n2) Calling current class method\n3) Distinguishing instance and local variable\n---------------------------------------------------");
		Student obj = new Student(3); //creating object of default constructor
		
		Student obj1 = new Student(3,"Soham");  //creating object
		obj1.display();  //method call
		
		College object = new College(3,1040,9899,"Soham"); //passing arguments to constructor of derived class
		object.display();
		
		System.out.println("\n2.)");
		Show object1 = new Show(); //creates show class object
		object1.show(); //calling method
	}

}
