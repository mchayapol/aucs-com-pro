package edu.au.scitech.sc2101;

public class CSVPrinter {
	public static void csvPrinter(String s) {
		// Because string is immutable
		StringBuffer sb = new StringBuffer(s);
		
		for(int i = 0; i < sb.length(); i++) {
			if ( sb.charAt(i) == ',' ) {
				// replace with a tab
				sb.replace(i, i+1, "\t");
			}
		}
		
		System.out.println( sb.toString() );
	}
	
	public static void main(String[] args) {
		String s = "ID,Name,Email\n5715111,John,u5715111@au.edu\n5715112,Jack,u5715112@au.edu\n5715113,Jimmy,u5715113@au.edu";
		
		csvPrinter(s);
	}
}
