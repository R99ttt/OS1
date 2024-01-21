//Stav Zysblatt 
//Abo Rabia Rami 
import java.util.ArrayList;
import java.util.Iterator;

public class EatingCompounds {

	private ArrayList<CowThread> eatingList;

	final int maxEatingCompound;


	public EatingCompounds(int x) {

		this.eatingList = new ArrayList<CowThread>();
		maxEatingCompound = x;
	}

	public synchronized void add(CowThread cow) {

		if(eatingList.size() > maxEatingCompound)
			System.out.println("MAX Eating Capacity");

		else {

			this.eatingList.add(cow);
			System.out.println("Cow: " + cow.getID() + " is eating");

		}

	}

	public synchronized void remove(int findId, CowThread cow) {

		Iterator<CowThread> iterator = eatingList.iterator();
		//boolean found = false;

		while (iterator.hasNext()) {

			CowThread currentCow = iterator.next();

			if (cow.getID() == findId) {
				iterator.remove();
				break;
			}

		}

		System.out.println("Cow: " + cow.getID() + " has finished eating.");

	}


}
