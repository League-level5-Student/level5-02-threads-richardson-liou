package _04_Thread_Pool.tests;

public class ThreadPoolTester {
	public static void main(String[] args) {
		WorkQueue wq = new WorkQueue();
		System.out.println("Total threads: "+ wq.getThreadCount());
		wq.shutdown();
	}
	
	public interface Job{
		void perform();
	}
}
