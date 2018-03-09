package thread;

import java.util.Stack;

public class ProducerConsumer {
	public static void main(String args[]) throws InterruptedException {
		Stack<Integer> stack = new Stack<>();
		Producer producer = new Producer(stack);
		producer.setName("Producer Thread");
		Consumer consumer = new Consumer(stack);
		consumer.setName("Consumer Thread");
		producer.start();
		consumer.start();
		producer.join();
		consumer.join();
	}
}

class Producer extends Thread {

	private final Stack<Integer> stack;

	public Producer(Stack<Integer> stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		int value = 0;
		while (true) {
			System.out.println("Produced: " + value);
			try {
				produce(value++);
				// Thread.sleep(10);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	private void produce(int i) throws InterruptedException {

		// wait if queue is full
		if (stack.size() == 2) {
			synchronized (stack) {
				System.out.println(
						"Stack is full " + Thread.currentThread().getName() + " is waiting , size: " + stack.size());

				stack.wait();
			}
		}

		// producing element and notify consumers
		synchronized (stack) {
			stack.add(i);
			stack.notifyAll();
		}
	}
}

class Consumer extends Thread {

	private final Stack<Integer> stack;

	public Consumer(Stack<Integer> stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	private int consume() throws InterruptedException {
		// wait if queue is empty
		if (stack.isEmpty()) {
			synchronized (stack) {
				System.out.println(
						"Stack is empty " + Thread.currentThread().getName() + " is waiting , size: " + stack.size());

				stack.wait();
			}
		}

		// Otherwise consume element and notify waiting producer
		synchronized (stack) {
			stack.notifyAll();
			return (Integer) stack.pop();
		}
	}
}
