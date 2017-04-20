package beautiful;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConsumerAndProducer {
	public static void main(String[] args) {
		
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);
		for(int i =0;i<5;i++){
			new Thread(producer).start();
			new Thread(consumer).start();
		}
			
		
	}
}
class Producer implements Runnable{
	private BlockingQueue<String> bq; 
	public Producer(BlockingQueue<String> bq) {
		// TODO Auto-generated constructor stub
		this.bq = bq;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			bq.put("hello");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Consumer implements Runnable{
	private BlockingQueue<String> bq; 
	public Consumer(BlockingQueue<String> bq) {
		// TODO Auto-generated constructor stub
		this.bq = bq;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			String temp = bq.take();//如果队列为空，会阻塞当前线程  
            System.out.println(temp);  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}