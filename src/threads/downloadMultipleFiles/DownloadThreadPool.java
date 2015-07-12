package threads.downloadMultipleFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DownloadThreadPool {
	private static final int NTHREADS = 10;
	public static void main(String args[]) throws InterruptedException{
		List<String> urls = new ArrayList<String>();
		urls.add("https://download.mozilla.org/?product=firefox-39.0-SSL&os=win&lang=en-GB");
		urls.add("https://download.mozilla.org/?product=firefox-39.0-SSL&os=win&lang=en-ZA");
		urls.add("https://download.mozilla.org/?product=firefox-39.0-SSL&os=win&lang=en-US");
		ExecutorService pool = Executors.newFixedThreadPool(NTHREADS);
		for(String url : urls){
			DownloadTask downloadTask = new DownloadTask(url, "tmp");
			pool.execute(downloadTask);
		}
		
		pool.shutdown();
		pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
		System.out.println("All threads in the pool are shutdown");
	}
}
