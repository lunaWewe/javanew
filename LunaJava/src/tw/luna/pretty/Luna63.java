package tw.luna.pretty;

import java.util.Timer;
import java.util.TimerTask;

public class Luna63 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 0, 1 * 1000);
		timer.schedule(new stopTask(timer), 10 * 1000);
		System.out.println("main");
	}

}

class MyTask extends TimerTask {
	private int i=1;
	
	@Override
	public void run() {
		System.out.println(i++);

	}
}

class stopTask extends TimerTask {
	private Timer timer;

	public stopTask(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		timer.purge();
		timer.cancel();
		timer = null;

	}
}