package thread;

public class DeadLock {
	public static Object resource1 = new Object();
	public static Object resource2 = new Object();
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne(resource1, resource2);
		t1.setName("Thread-1");
		ThreadTwo t2 = new ThreadTwo(resource1, resource2);
		t2.setName("Thread-2");
		t1.start();
		t2.start();

	}

}

class ThreadOne extends Thread {
	Object resource1;
	Object resource2;
	public ThreadOne(Object resource1, Object resource2) {
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (resource1) {
			System.out.println(name + " locked resource1");
			try {
				Thread.sleep(10);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiting for resource2");
			synchronized (resource2) {
				System.out.println(name + " locked resource1 and resource2");
			}
		}
	}
}

class ThreadTwo extends Thread {
	Object resource1;
	Object resource2;
	public ThreadTwo(Object resource1, Object resource2) {
		this.resource1 = resource1;
		this.resource2 = resource2;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (resource2) {
			System.out.println(name + " locked resource2");
			try {
				Thread.sleep(10);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " waiting for resource1");
			synchronized (resource1) {
				System.out.println(name + " locked resource1 and resource2");
			}
		}
	}
}
