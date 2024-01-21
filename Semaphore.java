//Stav Zysblatt 
//Abo Rabia Rami 
public class Semaphore {
	private int ticketes;

	public Semaphore(int ticketes) {
		this.ticketes = ticketes;
	}

	public synchronized void down() {

		while (ticketes <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ticketes--;
	}
	public synchronized void up() {
		ticketes++;
		notifyAll();
	}
}