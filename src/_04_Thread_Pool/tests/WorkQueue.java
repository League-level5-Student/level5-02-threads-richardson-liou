package _04_Thread_Pool.tests;

import java.util.ArrayDeque;

import _04_Thread_Pool.tests.ThreadPoolTester.Job;

public class WorkQueue implements Runnable{
	private boolean isRunning = true; 
	private Thread[] threads;
	private ArrayDeque<Job> jobQueue = new ArrayDeque<Job>();
	public WorkQueue () {
		int totalThreads = Runtime.getRuntime().availableProcessors()-1;
		threads = new Thread[totalThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(this);
			threads[i].start();
		}
		
	}
	public int getThreadCount() {
		return threads.length;
	}
	public void shutdown() {
		isRunning = false;
	}
	public void addJob(Job j) {
		jobQueue.add(j);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning) {
			System.out.println("Output from thread #" + Thread.currentThread().getId());
		}
	}

}
