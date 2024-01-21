//Stav Zysblatt 
//Abo Rabia Rami 
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("The number of cows: ");
		int allCows = scanner.nextInt();

		System.out.println("How much cows the hay compound can take: ");
		int x = scanner.nextInt();

		System.out.println("How much cows the trough compound can take: ");
		int y = scanner.nextInt();

		Compounds comp = new Compounds(allCows, x, y);
		SharedResources res = new SharedResources(allCows, x, y);

		CowThread[] cowThreads = new CowThread[allCows];
		for (int i = 0 ; i < allCows; i++) {

			cowThreads[i] = new CowThread(i + 1, res, comp);
			cowThreads[i].start();

		}
		scanner.close();
	}

}
