/*Example of how overrides works:
 * Our parent class ParentClass have a subclass, SubClass which extends
 * from it. One method of the parent class ParentClass is display method.
 * which recives a string and displays it.
 * If the method should be changed for this particular Subclass, then
 * should use @Override. */


// Create the Parentclass. It only have one method displayMethod
class ParentClass
{
	String str = "ParentClass";

	public void displayMethod(String msg){
		System.out.println("Message printed by original Parent 'displayMethod': "+ msg);
	}
	
	public static void main(String[] args){
		ParentClass obj = new ParentClass();
		obj.displayMethod("Hi, Im an instance of Class");
	}
}

// Create a subclass SubClass, extended from ParentClass
class SubClass extends ParentClass
{
	String str ="SubClass";

	// Override the only method in ParentClass
	@Override
	public void displayMethod(String msg){
		System.out.println("Message printed by override 'displayMethod': "+ msg);
		super.displayMethod("With super.method can access the parent method even when was overrided");
	}
	
	// This method will only run if execute the subclass
	public static void main(String[] args){
		SubClass obj = new SubClass();
		obj.displayMethod("Hi, Im an instance of Subclass");
	}	

}

class Testlaunch {

	public static void main(String args[]) {
   
	ParentClass a = new ParentClass();   	// ParentClass reference and object
	ParentClass b = new SubClass();   	// ParentClass reference but SubClass object
	SubClass c = new SubClass();		//

	a.displayMethod("Hi, Im a ParentObject");	// runs the method in Animal class
	b.displayMethod("Hi, Im a SubclassObject but with reference to ParentClass");	// runs the method in Dog class
	c.displayMethod("Hi, Im a SubclassObject");

	a.displayMethod("Parent object a.str = " + a.str);
	b.displayMethod("Subclass Object with reference Parent b.str = " + b.str);
	c.displayMethod("Parent object c.str = " + c.str);
  }
}
