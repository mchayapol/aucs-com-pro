package edu.au.scitech.sc2101;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class TextFileTest {

	@Test
	public void test() {
		File f = new File("D:\\com-pro-2\\text01.txt");
		File ft = new File("D:\\com-pro-2\\text01.tmp");
	
		try {
			FileReader fr = new FileReader( f );
			BufferedReader br = new BufferedReader( fr );
			
			FileWriter fw = new FileWriter( ft , false );
			BufferedWriter bw = new BufferedWriter( fw );
			PrintWriter pw = new PrintWriter( bw );
			
			String s;
			while((s = br.readLine()) != null) {
				s = s.replace("she", "Lily");
				s = s.replace("She", "Lily");
				System.out.println(s);
				pw.println(s);
			}
			
			pw.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			
			f.delete();
			ft.renameTo(f);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}		
	}

}
