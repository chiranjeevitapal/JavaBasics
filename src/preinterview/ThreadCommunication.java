package preinterview;

public class ThreadCommunication {

	public static void main(String[] args) {
		Employee emp = new Employee(12345, "Chiranjeevi", 139098.5);
		Listener listenerThreadOne = new Listener(emp);
		listenerThreadOne.setName("listenerThreadOne");
		Listener listenerThreadTwo = new Listener(emp);
		listenerThreadTwo.setName("listenerThreadTwo");
		listenerThreadTwo.setPriority(10);
		Notifier notifier = new Notifier(emp);
		listenerThreadOne.start();
		listenerThreadTwo.start();
		notifier.start();
	}

}

class Listener extends Thread {
	Employee emp;

	public Listener(Employee emp) {
		this.emp = emp;
	}

	public void run() {
		synchronized (emp) {
			System.out.println(Thread.currentThread().getName() + " started");
			try {
				System.out.println(Thread.currentThread().getName() + " waiting");
				emp.wait();
				System.out.println(Thread.currentThread().getName() + " restarted");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Notifier extends Thread {
	Employee emp;

	public Notifier(Employee emp) {
		this.emp = emp;
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (emp) {
			System.out.println("Notifier running");
			emp.notify();
		}
	}
}
