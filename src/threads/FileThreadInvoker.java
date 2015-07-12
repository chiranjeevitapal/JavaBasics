package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileThreadInvoker {
	private static final int NTHREADS = 10;
	public static void main(String args[]) throws InterruptedException{
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		//for (int i = 0; i < 2; i++) {
			FileThreads fileThreads = new FileThreads();
			executor.execute(fileThreads);
			//executor.submit(fileThreads);
		//}
		
		executor.shutdown();
	}
	
}
