package preinterview;

public class DeadLock {

	public static void main(String[] args) {
		Employee emp1 = new Employee(12345, "Chiranjeevi", 139098.5);
		Employee emp2 = new Employee(12345, "Chiranjeevi", 139098.5);
		FirstThread firstThread = new FirstThread(emp1, emp2);
		firstThread.setName("firstThread");
		SecondThread secondThread = new SecondThread(emp1, emp2);
		secondThread.setName("secondThread");
		firstThread.start();
		secondThread.start();
	}

}

class FirstThread extends Thread {
	Employee empObj1;
	Employee empObj2;

	public FirstThread(Employee empObj1, Employee empObj2) {
		this.empObj1 = empObj1;
		this.empObj2 = empObj2;
	}

	public void run() {
		synchronized (empObj1) {
			System.out.println(Thread.currentThread().getName() + " locked empObj1");
			try {
				System.out.println(Thread.currentThread().getName() + " sleeping");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (empObj2) {
				System.out.println(Thread.currentThread().getName() + " locked empObj2");
			}
		}
	}
}

class SecondThread extends Thread {
	Employee empObj1;
	Employee empObj2;

	public SecondThread(Employee empObj1, Employee empObj2) {
		this.empObj1 = empObj1;
		this.empObj2 = empObj2;
	}

	public void run() {
		synchronized (empObj2) {
			System.out.println(Thread.currentThread().getName() + " locked empObj2");
			try {
				System.out.println(Thread.currentThread().getName() + " sleeping");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (empObj1) {
				System.out.println(Thread.currentThread().getName() + " locked empObj1");
			}
		}
	}
}
