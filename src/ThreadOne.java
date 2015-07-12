
public class ThreadOne {
	public static void main(String args[]){
		Syncronisation syncronisation = new Syncronisation();
		Thread t1 = new Thread(syncronisation);
		Thread t2 = new Thread(syncronisation);
		t1.start();
		t2.start();
		
	}
}
