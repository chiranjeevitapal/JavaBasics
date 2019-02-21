package thread;

public class Yield {
	public static void main(String args[]) {
		YieldThread t1 = new YieldThread("1");
		t1.start();
		YieldThread t2 = new YieldThread("2");
		t2.start();
		YieldThread t3 = new YieldThread("break");
		t3.start();
	}
}

class YieldThread extends Thread {
	String param;
	public YieldThread(String param) {
		this.param = param;
	}
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//yield();
			System.out.println(param);
		}
		
		
	}
}
