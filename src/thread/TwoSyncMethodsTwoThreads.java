package thread;

public class TwoSyncMethodsTwoThreads {

	public static void main(String[] args) throws InterruptedException {
		SyncThread syncT1 = new SyncThread();
		syncT1.setName("Thread 1");
		SyncThread syncT2 = new SyncThread();
		syncT2.setName("Thread 2");
		syncT1.syncOne();
		//syncT1.join();
		syncT2.syncTwo();
		

	}

}

class SyncThread extends Thread {

	public synchronized void syncOne() {
		try {
			System.out.println(Thread.currentThread().getName()+" is accessing this..");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void syncTwo() {
		System.out.println(Thread.currentThread().getName()+" is accessing this..");
	}

	public void run() {
		if(currentThread().getName().equals("Thread 1")) {
			syncOne();
		}else {
			syncTwo();
		}
	}

}
