package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int test;

	public ThreadedGreeter(int i) {
		test = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread: " + test);
		if (test <= 50) {
			Thread t = new Thread(new ThreadedGreeter(test + 1));
			t.start();
		}

	}
}
