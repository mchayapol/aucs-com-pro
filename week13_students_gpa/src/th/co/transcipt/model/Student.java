package th.co.transcipt.model;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Semester> semesterList = new ArrayList<Semester>();
	
	public Student(String name) {
		this.name = name;
	}
	
	public void addSemester(Semester sem) {
		semesterList.add(sem);
	}
	
	public ArrayList<Semester> getSemesterList() {
		return semesterList;
	}
	
	public double getGPA() {
		double totalProd = 0;
		double totalCredits = 0;
		for(Semester sem : semesterList) {
			totalProd += sem.getTotalProd();
			totalCredits += sem.getTotalCredit();
		}
		return totalProd / totalCredits;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
