package tw.luna.pretty;

public class Luna62 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyRunnable mr1 = new MyRunnable("C");
		Thread t1 = new Thread(mr1);

		mt1.start();
		mt2.start(); // 開始等候，進入等候區待CPU呼叫執行
		t1.start();

		System.out.println("OK");

//		mt1.run();
//		System.out.println("--------");
//		mt1.start();  // 啟動生命特徵
//		System.out.println("--------");
//		mt1.run();
//		System.out.println("--------");
//		mt1.start();  // java.lang.IllegalThreadStateException
	}

}

class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.printf("%s:%d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class MyRunnable implements Runnable {
	private String name;

	public MyRunnable(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.printf("%s:%d\n", name, i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
