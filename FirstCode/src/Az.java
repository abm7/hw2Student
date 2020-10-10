
public class Student {

    private int id;
    private String FirstName;
    private String lastName;
    private String Major;
    private String mobile;
    private int bdate;
    private int year;
    private double GPA;

    public Student(int id, String FirstName, String lastName, String Major, String mobile, int bdate, int year) {
        this.id = id;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.Major = Major;
        this.mobile = mobile;
        this.bdate = bdate;
        this.year = year;
        GPA = 0;
    }

    public Student(int id, String FirstName, String lastName, String Major, String mobile, int bdate) {
        this.id = id;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.Major = Major;
        this.mobile = mobile;
        this.bdate = bdate;
        this.year = 1;
        //Gpa when th e student start will be 0 
        this.GPA = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getBdate() {
        return bdate;
    }

    public void setBdate(int bdate) {
        this.bdate = bdate;
    }

    public int getYear() {
        return year;
    }

    //Setting year must be larger than th current one
    public void setYear(int year) {
        if (year > this.year) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    //static average can be used from any where 
    public static double getAvergaeOfGpa(int year, double Gpa) {
        return Gpa / year;

    }
}

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
