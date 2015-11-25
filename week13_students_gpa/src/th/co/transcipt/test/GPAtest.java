package th.co.transcipt.test;

import static org.junit.Assert.*;

import th.co.transcipt.model.*;

import org.junit.Test;

public class GPAtest {

	@Test
	public void test() {
		Semester sem1 = new Semester(2,2014);
		Semester sem2 = new Semester(1,2015);
		
		sem1.addSubject(new Subject("SC1101","Computer Programming I",4,"A"));
		sem1.addSubject(new Subject("BG1001","English I",3,"B"));
		sem1.addSubject(new Subject("DA2101","Calculus I",3,"A-"));
		
		sem2.addSubject(new Subject("SC2101","Computer Programming II",4,"B"));
		sem2.addSubject(new Subject("BG1002","English II",3,"B+"));
		sem2.addSubject(new Subject("DA2102","Principle of Statistics",3,"C"));
		
		Student student = new Student("Chayapol");
		
		student.addSemester(sem1);
		student.addSemester(sem2);
		
		// TODO show all info here
		System.out.println(student);
		
		// iterate each semester of a student
		for(Semester sem : student.getSemesterList()) {
			System.out.println(sem);
			
			// iterate each subject in the semester
			for(Subject subject : sem.getSubjectList()) {
				System.out.println("\t"+subject);
			}
			System.out.println("\tGPA = "+sem.getGPA());
		}
		
		System.out.println("GPAC = "+student.getGPA());
		
	}

}
