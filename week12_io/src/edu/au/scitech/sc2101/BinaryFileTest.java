package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;

import org.junit.Test;

public class BinaryFileTest {

	@Test
	public void testWrite() {
		int[] data = {10,20,30,40,50};
		
		try {
			File dataFile = new File("data.dat");
			FileOutputStream fos = new FileOutputStream( dataFile );
			DataOutputStream dos = new DataOutputStream( fos  );
			
			for(int x: data) {
				dos.writeInt(x);
			}
			
			dos.close();
			fos.close();
		} catch(FileNotFoundException fnfe) {
			fail("Cannot open the file");
		} catch(IOException ioe) {
			fail("Cannot write");
		}
	}

	@Test
	public void testRead() {
		try{
			File dataFile = new File("data.dat");
			FileInputStream fis = new FileInputStream( dataFile );
			DataInputStream dis = new DataInputStream( fis );
			
			int size = dis.available() / 4;
			int[] arr = new int[size+1];
			int i = 0;
			while(dis.available() > 0) {
				int x = dis.readInt();
				arr[i] = x;
				System.out.println(dis.available()+": "+x+" _ "+arr[i]);
				i++;
			}
			
			dis.close();
			fis.close();			
		} catch(FileNotFoundException fnfe) {
			fail("Cannot open the file");
		} catch(IOException ioe) {
			fail("Cannot read");
		}
		
	
	}
}
