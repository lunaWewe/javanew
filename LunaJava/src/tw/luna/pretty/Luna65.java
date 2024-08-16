package tw.luna.pretty;

public class Luna65 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			
		}
		
		
		System.out.println("Main Finish");

	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread1 start working...");
		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread1 Finish");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread2 start working...");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread2 Finish");
	}
}