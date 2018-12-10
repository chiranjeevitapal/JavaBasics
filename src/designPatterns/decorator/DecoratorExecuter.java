package designPatterns.decorator;

import java.io.FileInputStream;
import java.io.IOException;

public class DecoratorExecuter {
	public static void main(String args[]) {
		FileInputStream is = null;
		LowerCaseInputStream lcis = null;
		int line;
		try {
			is = new FileInputStream("serialization.txt");
			lcis = new LowerCaseInputStream(is);
			while ((line=lcis.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
