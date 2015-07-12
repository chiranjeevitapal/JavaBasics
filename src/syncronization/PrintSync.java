package syncronization;

class Print {

	void print(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (n*i));
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread {
	Print t;

	Thread1(Print t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}

}

class Thread2 extends Thread {
	Print t;

	Thread2(Print t) {
		this.t = t;
	}

	public void run() {
		t.print(100);
	}
}

public class PrintSync {
	public static void main(String args[]) {
		Print obj = new Print();// only one object
		Thread1 thread1 = new Thread1(obj);
		Thread2 thread2 = new Thread2(obj);
		thread1.start();
		thread2.start();
	}
}
