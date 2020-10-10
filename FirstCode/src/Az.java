
public class Az {

	public static void main(String[] args) {
		  Student std = new Student(1, "Ahmad", "Qahtany", "IT", "055556999", 1993);


	        System.out.println(std.getFirstName() + " info *****************");
	        System.out.println(std.getFirstName());
	        System.out.println(std.getLastName());
	        System.out.println(std.getGPA());
	        System.out.println(std.getMajor());

	        System.out.println("Change year to 4");
	        std.setYear(4);

	        System.out.println(std.getYear());
	        System.out.println("Change year to 2");
	       
	        std.setYear(2);

	        
	        
	        std.setGPA(5);
	        
	       //Calc Average
	        System.out.println("Average Gpa Of this student"+ Student.getAvergaeOfGpa(std.getYear(),std.getGPA()));
	        System.out.println(std.getYear());

	        //Try to define object with Second costructor
	        Student std2 = new Student(1, "Ahmad", "Qahtany", "Itisalat", "055556999", 1993, 3);
	        System.out.println(std2.getFirstName() + " info *****************");
	        System.out.println(std2.getFirstName());
	        System.out.println(std2.getLastName());
	        System.out.println(std2.getGPA());
	        System.out.println(std2.getMajor());

	        System.out.println(std2.getYear());
	        
	        //try to change year to pervoius one
	        System.out.println("Change year to 2");
	        std2.setYear(2);
	        
	        //try to change year to next one
	        System.out.println("Change year to 3");
	        std2.setYear(4);

	        System.out.println(std2.getYear());

	}

}
