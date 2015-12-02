package th.co.transcipt.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student {

	private String name;
	private String id;
	private ArrayList<Semester> semesterList = new ArrayList<Semester>();
	
	/**
	 * 
	 * @param dataFile
	 * @throws IOException if there were any error, the student object cannot be 
	 * created and the there is no proper way to handle it here, but to signal
	 * the caller that it fails.
	 */
	public Student(File dataFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(dataFile));
		String s = br.readLine();	// should contain name,id
		// separate name and id by comma
		/* :: Method 1 ::
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);			
			if (c == ',') {
				name = temp;
				temp = "";
			} else {
				temp += c;	
			}
			System.out.println(c + " ... " +temp);
		}
		id = temp;
		*/
		StringTokenizer stk = new StringTokenizer(s,",");
		name = stk.nextToken();
		id = stk.nextToken();
		
		Semester semester = null;		
		while((s = br.readLine()) != null) {			
			// see what are we reading?
			// semester or subject
			if (s.charAt(0) != '\t') {			
				stk = new StringTokenizer(s,"/");
				String tempSem = stk.nextToken();
				String tempYear = stk.nextToken();
				
				int sem = Integer.parseInt(tempSem);
				int year = Integer.parseInt(tempYear);
				
				semester = new Semester(sem,year);
				addSemester(semester);
			} else {
				// it's a subject
				stk = new StringTokenizer(s,",");
				String code = stk.nextToken();
				code = code.substring(1);	// grab the string from char 1 onward.
				String name = stk.nextToken();
				String credit = stk.nextToken();
				String grade = stk.nextToken();
				int cre = Integer.parseInt(credit);
				
				Subject sub = new Subject(code,name,cre,grade);
				semester.addSubject(sub);
			}
		}
		
	}
	
	
	public Student(String id, String name) {
		this.id = id;
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
		return id + " "+ name;
	}
}
