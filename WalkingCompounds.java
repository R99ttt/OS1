//Stav Zysblatt 
//Abo Rabia Rami 
import java.util.ArrayList;
import java.util.Iterator;

public class WalkingCompounds {

	private ArrayList<CowThread> walkingList;

	final int allCows;


	public WalkingCompounds(int N) {

		this.walkingList = new ArrayList<CowThread>();

		allCows = N;


	}

	public synchronized void add(CowThread cow) {

		this.walkingList.add(cow);

	}

	public synchronized void remove(int findId) {

		Iterator<CowThread> iterator = walkingList.iterator();

		while (iterator.hasNext()) {

			CowThread cow = iterator.next();

			if (cow.getID() == findId) {

				iterator.remove();
				break;

			}
		}
	}
}
