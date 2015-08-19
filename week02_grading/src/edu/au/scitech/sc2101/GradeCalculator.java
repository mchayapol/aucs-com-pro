package edu.au.scitech.sc2101;

public class GradeCalculator {

	String advGrade(double score)  throws IllegalArgumentException{
		// Validate the input score
		if (score < 0 || score > 100)
			throw new IllegalArgumentException("Score out of range: "+score);
		{
			if (score <= 40)
				return "F";
			else if (score <= 50)
				return "D";
			else if (score <= 55)
				return "C-";
			else if (score <= 60)
				return "C";

			else if (score <= 65)
				return"C+";
			else if (score <= 70)
				return "B-" ;
			else if (score <= 75)
				return "B" ;
			else if (score <= 80)
				return "B+" ;
			else if (score <= 85)
				return "A-" ;
			else
				return "A";
		}
	}

	char grade(double score) throws IllegalArgumentException{
		// Validate the input score
		if (score < 0 || score > 100)
			throw new IllegalArgumentException("Score out of range: "+score);

		if (score <= 40)
			return 'F';
		else if (score <= 50)
			return 'D';
		else if (score <= 60)
			return 'C';
		else if (score <= 75)
			return 'B';
		else
			return 'A';

	}
}
