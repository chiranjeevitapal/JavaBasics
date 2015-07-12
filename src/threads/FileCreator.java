package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCreator {
	synchronized void createFile(String string) throws IOException{
		//Double random1 = (double) Math.round((Math.random()*1000000));
		//Double random2 = (double) Math.round((Math.random()*1000000));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		File file = new File("tmp/myfile.txt");
		StringBuffer strings = new StringBuffer();
		if(file.exists()){
			String currentLine;
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			while((currentLine = reader.readLine())!= null){
				strings.append(currentLine+"\n");
			}
			reader.close();
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			String print = strings.toString().concat(string+" at "+dateFormat.format(date));
			System.out.println(print);
			fw.write(print);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
