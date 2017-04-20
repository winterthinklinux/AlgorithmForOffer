package beautiful;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadOfJava {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
	    new Thread(myThread1).start();
	    new MyThread2().start();
	    
	    ExecutorService executorService = Executors.newFixedThreadPool(10);
	    executorService.submit(new MyThread3());
	    
	    executorService.shutdown();
	    
	}
}
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�߳�һִ������");
	}
	
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("�̶߳�ִ������");
	}
}
class MyThread3 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�߳���ִ������");
		return null;
	}
	
}