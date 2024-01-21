//Stav Zysblatt 
//Abo Rabia Rami 
public class CowThread extends Thread{

	final int id;
	private Compounds comp;
	private SharedResources res;

	public CowThread(int id, SharedResources res, Compounds comp) {

		this.id = id;
		this.res = res;
		this.comp = comp;

	}

	public int getID() {
		return id;
	}

	public void run() {

		try {
			res.haySem.down();
			comp.eat(this);
			res.haySem.up();

			res.troughSem.down();
			comp.drink(this);
			res.troughSem.up();

			res.binarySem.down();
			res.satiatedCows += 1;
			res.binarySem.up();

			res.binarySem.down();
			while(res.satiatedCows < res.allCows) {
				res.binarySem.up();

				res.binarySem.down();

			}

			res.binarySem.up();

			comp.walk(this);

		}

		catch(InterruptedException e) {

			e.printStackTrace();

		}

	}


}
