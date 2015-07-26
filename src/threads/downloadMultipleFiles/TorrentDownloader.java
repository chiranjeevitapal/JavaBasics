package threads.downloadMultipleFiles;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.turn.ttorrent.client.Client;
import com.turn.ttorrent.client.SharedTorrent;

public class TorrentDownloader{
	public static void main(String args[]) throws UnknownHostException, IOException{
		File srcTorrentFile = new File("C://Users/Chiranjeevi/Desktop/[kat.cr]war.pigs.2015.hdrip.xvid.etrg.torrent");
		File destinationFile = new File("C://Users/Chiranjeevi/Desktop");
		System.out.println("srcTorrentFile "+srcTorrentFile.exists()+" dest "+destinationFile.exists());
		InetAddress inetAddress = InetAddress.getLocalHost();
		SharedTorrent sharedTorrent = SharedTorrent.fromFile(srcTorrentFile, destinationFile);
		Client client = new Client(inetAddress, sharedTorrent);
		client.setMaxDownloadRate(100000.0);
		client.setMaxUploadRate(10.0);
		client.download();
		client.waitForCompletion();
	}
}
