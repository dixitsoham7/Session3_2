
public class College extends Student{                   //extends keyword shows inheritance

	int code,no;
	
	College(int cod,int n,int i, String na)        //parameterized constructor of College class
	{
		super(i,na);  //calling Constructor of class Student using super keyword
		code=cod;     //as local and instance variables are different there is no use of this keyword here
		no=n;
	}
	
	public void display()  //method of class College
	{
		System.out.println("-------------------------------------------");
		System.out.println("Uses of super keyword shown here :\n1) Calling immediate super class constructor\n2) Calling immediate super class method");
		System.out.println("-------------------------------------------");
		System.out.println("1.)Brief Details of Students are : \nName = "+name+"\nID = "+id+"\nCode = "+code+"\nNo = "+no);  //printing data
	}
}
