package thread;

class Waiter extends Thread {

	private Message msg;

	public Waiter(Message msg) {
		this.msg = msg;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name+" started");
				System.out.println(name + " going to waiting state at :" + System.currentTimeMillis());
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " thread got notified at :" + System.currentTimeMillis());
			// process the message now
			System.out.println(name + " processed: " + msg.getMsg());
		}
	}

}

class Notifier extends Thread {
	private Message msg;

	public Notifier(Message msg) {
		this.msg = msg;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name + " Notifier work done");
				msg.notify();
				// msg.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Message {
	private String msg;

	public Message(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String str) {
		this.msg = str;
	}

}

public class ThreadCommunication {
	public static void main(String args[]) throws InterruptedException {
		Message msg = new Message("process it");
		Waiter waiter1 = new Waiter(msg);
		waiter1.setName("waiter-1");
		waiter1.start();

		Waiter waiter2 = new Waiter(msg);
		waiter2.setName("waiter-2");
		waiter2.start();

		Notifier notifier = new Notifier(msg);
		notifier.setName("notifier");
		notifier.start();
	}
}
