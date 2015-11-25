package th.co.transcipt.model;

import java.util.ArrayList;

public class Semester {
	private int semester;             
	private int year;  

	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Semester(int semester, int year) {
		this.semester = semester;
		this.year = year;
	}

	public ArrayList<Subject> getSubjectList(){
		return subjectList;
	}
	
	
	public double getGPA() {
		double gpa = (int) (((getTotalProd() / getTotalCredit()) + 0.005) * 100);
		
		return gpa / 100;
	}
	
	public double getTotalProd() {
		double total = 0;
		for(Subject sub : subjectList) {
			try {
				double m = sub.getMagnitude();
				double c = sub.getCredit();
				total += m * c;
			} catch(Exception e) {
				// just ignore it amd continue the next loop
			}			
		}
		return total;		
	}
	
	public double getTotalCredit() {
		double total = 0;
		for(Subject s : subjectList) {
			total += s.getCredit();				
		}
		return total;
	}	
	
	public void addSubject(Subject s){
		subjectList.add(s);
	}	

	@Override
	public String toString(){
		return semester + "/" + year;
	}
}
