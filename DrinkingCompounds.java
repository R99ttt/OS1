//Stav Zysblatt 
//Abo Rabia Rami 
import java.util.ArrayList;
import java.util.Iterator;

public class DrinkingCompounds {

	private ArrayList<CowThread> drinkingList;

	final int maxDrinkingCompound;

	public DrinkingCompounds(int y) {

		this.drinkingList = new ArrayList<CowThread>();

		maxDrinkingCompound = y;


	}

	public synchronized void add(CowThread cow) {

		if(drinkingList.size() > maxDrinkingCompound)
			System.out.println("MAX Drinking Capacity");

		if(drinkingList.contains(cow))
			System.out.println("Cow: " + cow.getID() + " cant drink while eating");

		this.drinkingList.add(cow);
		System.out.println("Cow: " + cow.getID() + " is drinking. ");

	}

	public synchronized void remove(int findId, CowThread cow) {

		Iterator<CowThread> iterator = drinkingList.iterator();

		while (iterator.hasNext()) {

			CowThread currentCow = iterator.next();

			if (cow.getID() == findId) {
				iterator.remove();
				break;
			}

		}

		System.out.println("Cow: " + cow.getID() + " has finished drinking.");

	}


}
