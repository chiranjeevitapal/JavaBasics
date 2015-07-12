package threads;

import java.io.IOException;

public class FileThreads implements Runnable{
	FileCreator fileCreator = new FileCreator();
	void creator() throws InterruptedException, IOException{
		System.out.println(Thread.currentThread().getName());
			fileCreator.createFile(Thread.currentThread().getName()+" is writing...");
	}
	public void run(){
		try {
			creator();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
}
