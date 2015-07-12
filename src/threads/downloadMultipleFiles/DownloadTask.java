package threads.downloadMultipleFiles;

import java.io.IOException;

public class DownloadTask implements Runnable {
	private String sourceUrl;
	private String destUrl;
	DownloadTask(String sourceUrl, String destUrl){
		this.sourceUrl = sourceUrl;
		this.destUrl = destUrl;
	}
	
	@Override
	public void run() {
		try {
			DownloaderUtil.downloadFile(sourceUrl, destUrl);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
