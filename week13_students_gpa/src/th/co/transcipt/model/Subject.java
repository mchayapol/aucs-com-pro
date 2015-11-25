package th.co.transcipt.model;

public class Subject {
	
	private String code;             
	private String name;   
	private int credit;
	private String grade;
	
	public Subject(String code, String name, int credit, String grade) {
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.grade = grade;
	}
	
	@Override
	public String toString(){
		return "["+code+"] " + name + " (" + credit + ") \t" + grade;
	}
	
	// getter for grade
	public String getGrade() {
		return grade;
	}
	
	// get grade magnitude
	public double getMagnitude() throws Exception 
	{
		if (grade.equals("A")) { return 4;  } 
		else if (grade.equals("A-")) { return 3.75; }
		else if (grade.equals("B+")) { return 3.25; }
		else if (grade.equals("B")) { return 3; }
		else if (grade.equals("B-")) { return 2.75; }
		else if (grade.equals("C+")) { return 2.25; }
		else if (grade.equals("C")) { return 2; }
		else if (grade.equals("C-")) { return 1.75; }
		else if (grade.equals("D")) { return 1; }
		else if (grade.equals("F")) { return 0; }
		
		throw new Exception("Cannot convert the grade to a magnitude");
	}
	
	// getter for credit
	public int getCredit() {
		return credit;
	}

}
