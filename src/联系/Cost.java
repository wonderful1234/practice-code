
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Cost {
	public static void main(String[] args) {
		int n;
		Scanner reader=new Scanner(System.in);
		BlockingQueue<Mantou> queue = new ArrayBlockingQueue<Mantou>(reader.nextInt());
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}
}

class Producer implements Runnable {
	BlockingQueue<Mantou> queue;

	public Producer(BlockingQueue<Mantou> queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			Mantou mt = new Mantou(i);
			try {
				Thread.sleep(100);
				queue.put(mt);
				System.out.println("���� " + mt.getMantou());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	BlockingQueue<Mantou> queue;

	public Consumer(BlockingQueue<Mantou> queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 1; i < 100; i++) {
			try {
				Mantou mantou = queue.take();

				Thread.sleep(100);
				System.out.println("���ѣ� " + mantou.getMantou());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Mantou {
	private int mantou;

	public Mantou(int mantou) {
		this.mantou = mantou;
	}

	public int getMantou() {
		return mantou;
	}

	public void setMantou(int mantou) {
		this.mantou = mantou;
	}
}