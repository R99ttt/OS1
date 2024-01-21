//Stav Zysblatt 
//Abo Rabia Rami 
public class SharedResources {
	public Semaphore haySem, troughSem, binarySem;

	public int allCows, satiatedCows;

	public SharedResources(int N, int x, int y) {

		this.haySem = new Semaphore(x);
		this.troughSem = new Semaphore(y);
		this.binarySem = new Semaphore(1);

		this.allCows = N;
		satiatedCows = 0;
	}
}