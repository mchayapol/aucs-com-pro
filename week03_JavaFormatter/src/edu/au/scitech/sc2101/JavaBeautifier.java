package edu.au.scitech.sc2101;

public class JavaBeautifier {
	
	public static void format(String source) {
		StringBuffer sb = new StringBuffer(); // empty buffer
		
		//boolean triggerFor1, triggerFor2, triggerFor3, foundFor;
		//triggerFor1 = triggerFor2 = triggerFor3 = foundFor = false;
		int forFlag = 0;
		final int FORFLAG_F = 0b1000;
		final int FORFLAG_O = 0b1100;
		final int FORFLAG_R = 0b1110;
		final int FORFLAG_FOUND = 0b1111;
		
		int commentLineFlag = 0;
		final int COMMENTLINEFLAG_1 = 0b100;
		final int COMMENTLINEFLAG_2 = 0b110;
		final int COMMENTLINEFLAG_FOUND = 0b111;
		
		int indentLevel = 0;
		int ignoreSemicolons = 0; 
		boolean ignoreUntilEOL = false;
		for (int i = 0; i < source.length(); i++ ) { // loop over original source

			if (ignoreUntilEOL) {
				sb.append(source.charAt(i));
				if (source.charAt(i) == '\n') {
					ignoreUntilEOL = false;
					for(int x = 0; x < indentLevel; x++) {
						sb.append("\t");
					}
				}
				continue;
			}
			
			switch (source.charAt(i)) {			
			case '{':
				sb.append(source.charAt(i));
				//indentLevel++;
				//for(int x = 0; x < indentLevel; x++)
				sb.append("\n");
				indentLevel++;
				for(int x = 0; x < indentLevel; x++) {
					sb.append("\t");
				}
				break;
			case '\n':
				sb.append(source.charAt(i));
				sb.append('\t');
				break;
			case ';':
				sb.append(source.charAt(i));
				if (ignoreSemicolons > 0)
					break;
				if(sb.charAt(i) != 'i')
				sb.append('\n');
				
				for (int x = 0; x > indentLevel; x++) 
					indentLevel++;
					sb.append("\t");
				break;
			case '}':
				sb.append("\n");
				indentLevel--;
				
				for(int x = indentLevel; x > 0; x--)					
					sb.append('\t');					

				sb.append(source.charAt(i));
				break;
			case 'f':
				sb.append(source.charAt(i));
				forFlag = FORFLAG_F;
				break;
			case 'o':
				sb.append(source.charAt(i));
				forFlag = (forFlag == FORFLAG_F) ? FORFLAG_O : 0;
				break;
			case 'r':
				sb.append(source.charAt(i));
				forFlag = (forFlag == FORFLAG_O) ? FORFLAG_R : 0;
				break;
			case ' ': case '(':
				sb.append(source.charAt(i));
				forFlag = (forFlag == FORFLAG_R) ? FORFLAG_FOUND : 0;
				break;
			
			case '/':
				sb.append(source.charAt(i));
				if (commentLineFlag == 0) {
					commentLineFlag = COMMENTLINEFLAG_1;
				} else if (commentLineFlag == COMMENTLINEFLAG_1) {
					commentLineFlag = COMMENTLINEFLAG_2;
				} else if (commentLineFlag == COMMENTLINEFLAG_2) {
					commentLineFlag = COMMENTLINEFLAG_FOUND;
				} else {
					commentLineFlag = 0;
				}
				break;
			default:
				sb.append(source.charAt(i));
			}
			
			
			if (forFlag == FORFLAG_FOUND) {
				ignoreSemicolons = 2;
				forFlag = 0;
			}
			
			if (commentLineFlag == COMMENTLINEFLAG_FOUND) {
				ignoreUntilEOL = true;
				commentLineFlag = 0;
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		String sourceCode = "public static void csvPrinter(String s) {// Because string is immutable\nStringBuffer sb = new StringBuffer(s);for(int i = 0; i < sb.length(); i++) {if ( sb.charAt(i) == ',' ) {// replace with a tab\nsb.replace(i, i+1, \"\t\");}}System.out.println( sb.toString() );}}}";

		System.out.println(sourceCode);
		System.out.println("----------------------------");
		format(sourceCode);
		
		//int flags = 0b1111;
		//System.out.println(flags);
	}

}
