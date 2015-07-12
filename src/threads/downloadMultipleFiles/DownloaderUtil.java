package threads.downloadMultipleFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloaderUtil {
	private static final int BUFFER_SIZE = 4096;
	public static void downloadFile(String sourceUrl, String destUrl) throws IOException{
		System.out.println("Running Thread : "+Thread.currentThread().getName());
		URL url = new URL(sourceUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		int responseCode = connection.getResponseCode();
		System.out.println("responseCode : "+responseCode);
		//Before downloading file check the responce code
		//if it is 200 then download the file
		if(responseCode == HttpURLConnection.HTTP_OK){
			String fileName = "";
			String disposition = connection.getHeaderField("Content-Disposition");
			String contentType = connection.getContentType();
			int contentLength = connection.getContentLength();
			if(disposition != null){
				// extracts file name from header field
                int index = disposition.indexOf("filename=");
                if(index>0){
                	fileName = disposition.substring(index + 10, disposition.length() - 1);
                }
			}else{
				fileName = sourceUrl.substring(sourceUrl.lastIndexOf("=")+1, sourceUrl.length()); 
			}
			System.out.println("Content-Type : "+contentType);
			System.out.println("Content-Disposition : "+disposition);
			System.out.println("Content-Length = " + contentLength);
            System.out.println("fileName = " + fileName);
            
            InputStream inputStream = connection.getInputStream();
            String saveToPath = destUrl + File.separator + fileName;
            
            FileOutputStream fileOutputStream = new FileOutputStream(saveToPath);
            
            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
            	fileOutputStream.write(buffer, 0, bytesRead);
            }
 
            fileOutputStream.close();
            inputStream.close();
		}
	}
}
