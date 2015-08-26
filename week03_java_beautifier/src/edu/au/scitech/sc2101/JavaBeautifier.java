package edu.au.scitech.sc2101;

public class JavaBeautifier {
	public static void format(String source) {
		StringBuffer sb = new StringBuffer();	// empty buffer
		int indentLevel = 0;
		for(int i = 0; i < source.length(); i++) {	// loop over original source
			sb.append( source.charAt(i) );

			switch( source.charAt(i) ) {
			case '{':
				sb.append("\n");
				indentLevel++;
				for(int x=0; x<indentLevel; x++)
					sb.append("\t");
				
				break;
			case '\n':
				sb.append('\t');
				break;
			case ';':
				sb.append('\n');
				break;
			}
		}
		
		System.out.println( sb.toString() );
	}
	
	public static void main(String[] args) {
		String sourceCode = "public static void csvPrinter(String s) {// Because string is immutable\nStringBuffer sb = new StringBuffer(s);for(int i = 0; i < sb.length(); i++) {if ( sb.charAt(i) == ',' ) {// replace with a tab\nsb.replace(i, i+1, \"\t\");}}System.out.println( sb.toString() );}}}";
		
		System.out.println(sourceCode);
		System.out.println("---------------------------");
		format(sourceCode);
	}
}
