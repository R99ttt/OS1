//Stav Zysblatt 
//Abo Rabia Rami 
import java.util.ArrayList;
import java.util.Random;

public class Compounds {

	//	private ArrayList<Integer> eating;
	//	private ArrayList<Integer> drinking;
	//	private ArrayList<Integer> walking;

	private EatingCompounds eatingComp;
	private DrinkingCompounds drinkingComp;
	private WalkingCompounds walkingComp;

	private Random randomTime;
	private int waitTime;

	final int allCows;

	public Compounds(int N, int x, int y) {


		//		eating = new ArrayList<Integer>();
		//		drinking = new ArrayList<Integer>();
		//		walking = new ArrayList<Integer>();

		eatingComp = new EatingCompounds(x);
		drinkingComp = new DrinkingCompounds(y);
		walkingComp = new WalkingCompounds(N);

		randomTime = new Random();

		allCows = N;

	}

	public void eat(CowThread cow) throws InterruptedException{

		eatingComp.add(cow);

		waitTime = randomTime.nextInt(8000) + 2000;

		try {

			Thread.currentThread().sleep(waitTime);

			synchronized (this) {

				//System.out.println(cow.getID());
				eatingComp.remove(cow.getID(), cow);

			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void drink(CowThread cow) throws InterruptedException{

		drinkingComp.add(cow);
		waitTime = randomTime.nextInt(8000) + 2000;

		try {

			Thread.currentThread().sleep(waitTime);

			synchronized (this) {

				drinkingComp.remove(cow.getID(), cow);

			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void walk(CowThread cow) throws InterruptedException{

		walkingComp.add(cow);

		System.out.println("Cow: " + cow.getID() + " started her walk");

	}
}
