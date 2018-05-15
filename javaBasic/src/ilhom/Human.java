package ilhom;

public class Human {
	String color;  //line 4,5,6 Variables declared at thr class level are called Fields
	int age;
	String gender;
	
	
	public Human() {             //this this default constructor with 3 default value
		color = "white";
		age = 24;
		gender ="male";
		
				
	}

	public Human(String humanColor) {  //this is parameterized constructor taking 1 parameter and 2 default value
		color = humanColor;
		age = 23;
		gender = "mardak";
		
				
	}
	public Human(String humanColor, int humanAge, String humanGender) {  //this is parameterized constructor with 3 parameters 
		color = humanColor;
		age = humanAge;
		gender = humanGender;

	}


	public void printDetails() {   //this is a method which is going to print details of the object when invoked 
		System.out.println("color= " +color +" age= " + age +" gender= "+ gender);
	}
	public static void satisfyHunger() {
		System.out.println("hunger can be satisfied by having food");
	}

	public static void main(String[] args) {
		Human Jon = new Human("white", 23, "male");
		Human Ram = new Human("brown", 25, "male");
		Human Rose = new Human("white", 20, "femail");
		Human Tim = new Human();
		Human Paul = new Human("white");
		

	Tim.printDetails();
	Paul.printDetails();
	Jon.printDetails();
	Ram.printDetails();
	Rose.printDetails();
satisfyHunger();

	}

}
